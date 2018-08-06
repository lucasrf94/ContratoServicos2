package beans;

import java.util.ArrayList;
import java.util.List;

import entities.Servidor;
import entities.Servidor;
import entities.ServicoPrest;
import entities.Servidor;;

public class ServidorBean {
	
	private List<Servidor> servidores = new ArrayList<Servidor>();
	private Servidor servidor = new Servidor();
	private int id_servidor;
	private static int contador = 0;

	private Servidor servidorBuscado = new Servidor();

	private String updateNome;
	private String updateIdade;
	private String updateEndereco;
	private String updateTelefone;
	private String updateUF;
	private String updateCidade;
	private ServicoPrest update_servicoPrest;
	private String updateCusto;
	private String updateFoto;
	public List<Servidor> getServidores() {
		return servidores;
	}
	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}
	public Servidor getServidor() {
		return servidor;
	}
	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	public int getId_servidor() {
		return id_servidor;
	}
	public void setId_servidor(int id_servidor) {
		this.id_servidor = id_servidor;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		ServidorBean.contador = contador;
	}
	public Servidor getServidorBuscado() {
		return servidorBuscado;
	}
	public void setServidorBuscado(Servidor servidorBuscado) {
		this.servidorBuscado = servidorBuscado;
	}
	public String getUpdateNome() {
		return updateNome;
	}
	public void setUpdateNome(String updateNome) {
		this.updateNome = updateNome;
	}
	public String getUpdateIdade() {
		return updateIdade;
	}
	public void setUpdateIdade(String updateIdade) {
		this.updateIdade = updateIdade;
	}
	public String getUpdateEndereco() {
		return updateEndereco;
	}
	public void setUpdateEndereco(String updateEndereco) {
		this.updateEndereco = updateEndereco;
	}
	public String getUpdateTelefone() {
		return updateTelefone;
	}
	public void setUpdateTelefone(String updateTelefone) {
		this.updateTelefone = updateTelefone;
	}
	public String getUpdateUF() {
		return updateUF;
	}
	public void setUpdateUF(String updateUF) {
		this.updateUF = updateUF;
	}
	public String getUpdateCidade() {
		return updateCidade;
	}
	public void setUpdateCidade(String updateCidade) {
		this.updateCidade = updateCidade;
	}
	public ServicoPrest getUpdate_servicoPrest() {
		return update_servicoPrest;
	}
	public void setUpdate_servicoPrest(ServicoPrest update_servicoPrest) {
		this.update_servicoPrest = update_servicoPrest;
	}
	public String getUpdateCusto() {
		return updateCusto;
	}
	public void setUpdateCusto(String updateCusto) {
		this.updateCusto = updateCusto;
	}
	public String getUpdateFoto() {
		return updateFoto;
	}
	public void setUpdateFoto(String updateFoto) {
		this.updateFoto = updateFoto;
	}
	
	

	private void adicionarServidor() {
		servidor.setId_servidor(contador++);
		servidores.add(servidor);
		servidor = new Servidor();
	}

	private void buscarServidor() {
		Servidor servidor = new Servidor();
		for (Servidor cli : servidores) {
			if (getId_servidor() == cli.getId_servidor())
				;
			servidor = cli;
			setServidorBuscado(servidor);
		}
	}

	public void removerCategoria() {
		servidores.remove(getServidorBuscado());
		servidorBuscado = new Servidor();
	}
}