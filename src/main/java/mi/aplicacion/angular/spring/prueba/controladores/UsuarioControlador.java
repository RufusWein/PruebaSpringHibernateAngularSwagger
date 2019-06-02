package mi.aplicacion.angular.spring.prueba.controladores;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mi.aplicacion.angular.spring.prueba.modelos.Usuario;
import mi.aplicacion.angular.spring.prueba.service.UsuarioServicio;

@RestController 
@RequestMapping("/usuarios")
@Api(value = "Microservicios Web de Usuario")
public class UsuarioControlador { // El controlador de Usuario
	
	private static final Logger Log = LoggerFactory.getLogger(UsuarioControlador.class);
	
	@Autowired
	UsuarioServicio servicioUsuarios;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "Devuelve todos los usuarios", notes = "Retorna una lista o colección de usuarios" )
	public List<Usuario> usuarios() {
		return servicioUsuarios.list();
	}
	
	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Busca un usuario por su id", notes = "Retorna el usuario en caso de hallarlo" )
	public Usuario usuario(@PathVariable("id") Integer id) {
		return servicioUsuarios.findById(id);
	}
	
	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
    @ApiOperation(value = "Guarda un usuario", notes = "Toma el id y el nombre, y en caso de desplegarlo con éxito retorna el usuario con su id generada" )
	public Usuario nuevo(@RequestBody Usuario usuario) { 
		Log.debug("Nombre : "+usuario.getNombre());

		return servicioUsuarios.save(usuario);
	}
	
}
