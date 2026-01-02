package PedroNunesDev.Projeto_Santander.repository;

import PedroNunesDev.Projeto_Santander.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
