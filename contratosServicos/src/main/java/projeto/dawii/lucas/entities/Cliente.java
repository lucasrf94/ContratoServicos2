package projeto.dawii.lucas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cliente implements Identificavel{
	@Column
	private String nome;
	@Id
	private long id_cliente;
	@Column
	private String rua;
	@Column
	private String bairro;
	@Column
	private String cidade;
	@Column
	private String numeroCasa;
	@Column
	private String idade;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	public Long getId() {
		return id_cliente;
	}

	public void setId(Long id) {
		id_cliente = id;
		
	}

}
