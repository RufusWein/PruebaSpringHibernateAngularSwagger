package mi.aplicacion.angular.spring.prueba;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
@EnableWebMvc
public class WebConfig  // Da igual el nomrbe que le pongamos, lo importante son las anotaciones
						extends WebMvcConfigurerAdapter  {

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
    	// Despachamos los HTMLs desde la ruta indicada "templates", puedes llamarla vistas o lo que sea
    	ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();

        templateResolver.setPrefix("templates/");
        templateResolver.setCacheable(false);
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");

        return templateResolver;
    }
    
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Inidcamos la ruta y localizacion de los recursos
        registry.addResourceHandler(
                "/webjars/**",
                "/img/**",
                "/css/**",
                "/js/**")
                .addResourceLocations(
                		"classpath:/META-INF/resources/webjars/",
                        "classpath:/static/img/",
                        "classpath:/static/css/",
                        "classpath:/static/js/");
        
        // Registramos la ruta en la localizacion de webjars
        registry.addResourceHandler("swagger-ui.html")
        		.addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
	}

}