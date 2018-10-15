package projeto.dawii.lucas.beans;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import projeto.dawii.lucas.entities.Servidor;
import projeto.dawii.lucas.services.ServidorService;

public class ServidorBean implements Serializable{
	
	@Inject
	private ServidorService service;

	protected Servidor entidade;

	protected Collection<Servidor> entidades;

	public ServidorBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Servidor entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Servidor getEntidade() {
		return entidade;
	}

	public void setEntidade(Servidor entidade) {
		this.entidade = entidade;
	}

	public Collection<Servidor> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Servidor> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Servidor newEntidade() {
		return new Servidor();
	}

	public ServidorService getService() {
		return service;
	}
}
