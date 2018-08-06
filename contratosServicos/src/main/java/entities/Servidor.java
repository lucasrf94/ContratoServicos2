package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Servidor {
	@Column
	private String nome_servidor;
	@Column
	private int idade_servidor;
	@Column
	private String telefone_servidor;
	@Column
	private String curriculum_servidor;
	@Column
	private String endereco;
	@Column
	private String cidade_servidor;
	@Column
	private String estado_servidor;
	@Column
	private ServicoPrest servicoPrest;

	@Id
	@GeneratedValue
	private int id_servidor;
	
	@Column
	private int custo_minimo;
	@Column
	private String foto_servico;


	public Servidor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome_servidor() {
		return nome_servidor;
	}

	public void setNome_servidor(String nome_servidor) {
		this.nome_servidor = nome_servidor;
	}

	public int getIdade_servidor() {
		return idade_servidor;
	}

	public void setIdade_servidor(int idade_servidor) {
		this.idade_servidor = idade_servidor;
	}

	public String getTelefone_servidor() {
		return telefone_servidor;
	}

	public void setTelefone_servidor(String telefone_servidor) {
		this.telefone_servidor = telefone_servidor;
	}

	public String getCurriculum_servidor() {
		return curriculum_servidor;
	}

	public void setCurriculum_servidor(String curriculum_servidor) {
		this.curriculum_servidor = curriculum_servidor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade_servidor() {
		return cidade_servidor;
	}

	public void setCidade_servidor(String cidade_servidor) {
		this.cidade_servidor = cidade_servidor;
	}

	public String getEstado_servidor() {
		return estado_servidor;
	}

	public void setEstado_servidor(String estado_servidor) {
		this.estado_servidor = estado_servidor;
	}

	public ServicoPrest getServicoPrest() {
		return servicoPrest;
	}

	public void setServicoPrest(ServicoPrest servicoPrest) {
		this.servicoPrest = servicoPrest;
	}

	public int getId_servidor() {
		return id_servidor;
	}

	public void setId_servidor(int id_servidor) {
		this.id_servidor = id_servidor;
	}

	public int getCusto_minimo() {
		return custo_minimo;
	}

	public void setCusto_minimo(int custo_minimo) {
		this.custo_minimo = custo_minimo;
	}

	public String getFoto_servico() {
		return foto_servico;
	}

	public void setFoto_servico(String foto_servico) {
		this.foto_servico = foto_servico;
	}
}
