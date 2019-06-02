package mi.aplicacion.angular.spring.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mi.aplicacion.angular.spring.prueba.modelos.Usuario;
import mi.aplicacion.angular.spring.prueba.modelos.UsuarioRepositorio;

@Service
public class UsuarioServicio { // Nuestro servicio que provee funciones para Usuario
	@Autowired
	private UsuarioRepositorio usuarios;
	
	public List<Usuario> list(){
		return (List<Usuario>) usuarios.findAll();
	}
	
	public Usuario findById(Integer id) {
		return usuarios.findOne(id);
	}
	
	public Usuario save(Usuario usuario) {
		return usuarios.save(usuario);
	}
}
