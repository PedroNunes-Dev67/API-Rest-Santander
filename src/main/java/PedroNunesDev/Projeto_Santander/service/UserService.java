package PedroNunesDev.Projeto_Santander.service;

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

        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    public User create(User user){

        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) throw new IllegalArgumentException("Usuário já existe");

        return userRepository.save(user);
    }
}
