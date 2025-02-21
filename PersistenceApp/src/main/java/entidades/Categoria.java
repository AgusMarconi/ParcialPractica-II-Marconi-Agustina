package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "categoria")
public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "denominacion")
	private String denominacion;

	@ManyToMany(mappedBy = "categorias")
	private List<Articulo> articulos = new ArrayList<Articulo>();
	///////////////////
	public Categoria(String denominacion) {
		this.denominacion = denominacion;
	}
	public Categoria() {
	}
	
	public Categoria(String denominacion, List<Articulo> articulos) {
		this.denominacion = denominacion;
		this.articulos = articulos;
	}
	//////////////////
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//////
	public String getDenominacion() {
		return denominacion;
	}
	
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	///////
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
}
