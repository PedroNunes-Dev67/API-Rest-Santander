package PedroNunesDev.Projeto_Santander.service;

import PedroNunesDev.Projeto_Santander.exception.ConflictObjectResource;
import PedroNunesDev.Projeto_Santander.exception.NotFoundObject;
import PedroNunesDev.Projeto_Santander.model.User;
import PedroNunesDev.Projeto_Santander.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById (Long id){

        return userRepository.findById(id).orElseThrow(() -> new NotFoundObject("Usuário não encontrado."));
    }

    public User create(User user){

        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) throw new ConflictObjectResource("Usuário já cadastrado.");

        return userRepository.save(user);
    }
}
