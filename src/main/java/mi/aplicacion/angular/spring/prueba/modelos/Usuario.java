package mi.aplicacion.angular.spring.prueba.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="usuario")
@ApiModel("Modelo Usuario")
public class Usuario {
	
	public Usuario() {} // ESte puto constructor es necesario
	
	public Usuario(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "La Id del usuario", required = true)
	private Integer id;
    
    @Column
    @NotEmpty
    @ApiModelProperty(value = "El nombre del usuario", required = true)
	private String nombre;	
	
}
