package org.generation.farmacia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table ( name = "tb_produto")
public class Produto {

	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotBlank (message = "Este campo não pode permanecer em branco ")
    @Size (max = 100, message = "O atribuito nome deve conter no maxímo 100 caracteres.") 
	private String nome; 
	
	@NotNull (message = "Este campo não pode permanecer em branco ")
	private double preco; 

   @NotNull (message = "Este campo não pode permanecer em branco ")
   private int quanEstoque;
   
   @ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getQuanEstoque() {
	return quanEstoque;
}

public void setQuanEstoque(int quanEstoque) {
	this.quanEstoque = quanEstoque;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}


}
   

