/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mi.aplicacion.angular.spring.prueba.simple;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mi.aplicacion.angular.spring.prueba.AplicacionDePrueba;
import mi.aplicacion.angular.spring.prueba.service.UsuarioServicio;
/**
 * Tests for {@link AplicacionDePrueba}.
 * 
 * @author Dave Syer
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PruebasDeLaAplicacion {

	@Test
	public void pruebaDelServicioUsuario() throws Exception {
		UsuarioServicio usuarios=new UsuarioServicio();

		// comprobamos la instancia
		assertNotNull(usuarios);
			
	}

}
