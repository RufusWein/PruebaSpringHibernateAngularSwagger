package mi.aplicacion.angular.spring.prueba.modelos;

import org.springframework.data.repository.CrudRepository;

// Creamos nuestro repositorio con funciones CRUD para Usuario
public interface UsuarioRepositorio extends CrudRepository<Usuario,Integer>{

}
