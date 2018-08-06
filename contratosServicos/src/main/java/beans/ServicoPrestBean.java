package beans;

import java.util.ArrayList;
import java.util.List;

import entities.ServicoPrest;
import entities.Servidor;

public class ServicoPrestBean {
	private List<ServicoPrest> servicos = new ArrayList<ServicoPrest>();
	private ServicoPrest servico = new ServicoPrest();
	private int id_serv;
	private Servidor servidores;
	private static int contador = 0;

	private ServicoPrest servicoBuscada = new ServicoPrest();

	private String updateNome;

	private String updateTipo;

	public List<ServicoPrest> getServicos() {
		return servicos;
	}

	public void setServiçoPrests(List<ServicoPrest> servicos) {
		this.servicos = servicos;
	}

	public ServicoPrest getServicoPrest() {
		return servico;
	}

	public void setServicoPrest(ServicoPrest servico) {
		this.servico = servico;
	}

	public int getId_serv() {
		return id_serv;
	}

	public void setId(int id_serv) {
		this.id_serv = id_serv;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		ServicoPrestBean.contador = contador;
	}

	public ServicoPrest getServicoPrestBuscada() {
		return servicoBuscada;
	}

	public void setServiçoPrestBuscada(ServicoPrest servicoBuscada) {
		this.servicoBuscada = servicoBuscada;
	}

	public String getUpdateNome() {
		return updateNome;
	}

	public void setUpdateNome(String updateNome) {
		this.updateNome = updateNome;
	}

	public String getUpdateTipo() {
		return updateTipo;
	}

	public void setUpdateTipo(String updateTipo) {
		this.updateTipo = updateTipo;
	}

	public void adicionarServicoPrest() {
		servico.setId_serv(contador++);
		servicos.add(servico);
		servico = new ServicoPrest();
	}

	public void buscarServicoPrest() {
		ServicoPrest servico = new ServicoPrest();
		for (ServicoPrest serv : servicos) {
			if (getId_serv() == serv.getId_serv());
				servico = serv;
				setServiçoPrestBuscada(servico);
		}
	}

	public void removerServicoPrest() {
		servicos.remove(getServicoPrestBuscada());
		servicoBuscada = new ServicoPrest();
	}
}
