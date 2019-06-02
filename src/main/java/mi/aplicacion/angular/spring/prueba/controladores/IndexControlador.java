package mi.aplicacion.angular.spring.prueba.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexControlador {

	private static final String VISTA="thymeleaf/index";
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return VISTA;
	}
	
}
