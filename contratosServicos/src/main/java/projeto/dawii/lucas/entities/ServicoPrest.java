package projeto.dawii.lucas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ServicoPrest implements Identificavel{
	
	@Id
	@GeneratedValue
	private int id_serv;
	
	@Column
	private String psicologo;
	@Column
	private String baba;
	@Column
	private String eletricista;
	@Column
	private String vendedor;
	@Column
	private String pedreiro;
	@Column
	private String professor;
	@Column
	private Servidor Servidores;

	
	public ServicoPrest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_serv() {
		return id_serv;
	}
	public void setId_serv(int id_serv) {
		this.id_serv = id_serv;
	}
	public String getPsicologo() {
		return psicologo;
	}
	public void setPsicologo(String psicologo) {
		this.psicologo = psicologo;
	}
	public String getBaba() {
		return baba;
	}
	public void setBaba(String baba) {
		this.baba = baba;
	}
	public String getEletricista() {
		return eletricista;
	}
	public void setEletricista(String eletricista) {
		this.eletricista = eletricista;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getPedreiro() {
		return pedreiro;
	}
	public void setPedreiro(String pedreiro) {
		this.pedreiro = pedreiro;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}
