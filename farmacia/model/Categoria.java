package org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table ( name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue ( strategy  = GenerationType.IDENTITY)
	private long id; 
	
	@NotBlank (message = "Este campo não pode permanecer em branco ")
	@Size (max = 100, message = "O atribuito tipo deve conter no maxímo 100 caracteres.") 
	private String tipo; 
	
	@NotBlank (message = "Este campo não pode permanecer em branco ")
	@Size (max = 100, message = "O atribuito deve conter no maxímo 100 caracteres.") 
	private String publicoAlvo;
	
	@OneToMany (mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	
	
}
