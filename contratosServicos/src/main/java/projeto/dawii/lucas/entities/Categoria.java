package projeto.dawii.lucas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Categoria implements Identificavel {
	@Column
	private String nome;
	@Column
	private String tipo;
	@Id
	private Long id_categoria;
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id_categoria;
	}

	@Override
	public void setId(Long id) {
		id_categoria = id;
		
	}
	
}
