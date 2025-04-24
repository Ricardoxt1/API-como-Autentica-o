package application.repository;

import application.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNomeDeUsuario(String nomeDeUsuario);
}