package projeto.dawii.lucas.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Servidor implements Identificavel {

	
	@Id
	@GeneratedValue(generator="servidor_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="servidor_seq")
	private Long id;

	private String nome;
	private Date nascimento;
	private String telefone;
	private String InformaçõesAdicionais;
	private String endereco;
	private String cidade;
	private ServicoPrest servicoPrest;
	private int custoMinimo;


	public Servidor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getInformaçõesAdicionais() {
		return InformaçõesAdicionais;
	}


	public void setInformaçõesAdicionais(String informaçõesAdicionais) {
		InformaçõesAdicionais = informaçõesAdicionais;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public ServicoPrest getServicoPrest() {
		return servicoPrest;
	}


	public void setServicoPrest(ServicoPrest servicoPrest) {
		this.servicoPrest = servicoPrest;
	}


	public int getCustoMinimo() {
		return custoMinimo;
	}


	public void setCustoMinimo(int custoMinimo) {
		this.custoMinimo = custoMinimo;
	}
}


	
