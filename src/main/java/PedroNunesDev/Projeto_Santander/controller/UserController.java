package PedroNunesDev.Projeto_Santander.controller;

import PedroNunesDev.Projeto_Santander.model.User;
import PedroNunesDev.Projeto_Santander.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){

        User user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){

        User newUser = userService.create(user);

        return ResponseEntity.created(getURI(newUser.getId())).body(newUser);
    }

    private URI getURI(Object id){
        return ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(id).toUri();
    }
}
