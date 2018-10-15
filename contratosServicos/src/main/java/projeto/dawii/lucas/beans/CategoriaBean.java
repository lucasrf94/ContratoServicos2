//ISSO DEVE ESTAR PRONTO PODE APAGAR
package projeto.dawii.lucas.beans;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.dawii.lucas.entities.Categoria;
import projeto.dawii.lucas.services.CategoriaService;

@ApplicationScoped
@Named

public class CategoriaBean {

	@Inject
	private CategoriaService service;
	
	protected Categoria entidade;

	protected Collection<Categoria> entidades;

	public CategoriaBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Categoria entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Categoria getEntidade() {
		return entidade;
	}

	public void setEntidade(Categoria entidade) {
		this.entidade = entidade;
	}

	public Collection<Categoria> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Categoria> entidades) {
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

	protected Categoria newEntidade() {
		return new Categoria();
	}

	public CategoriaService getService() {
		return service;
	}
}