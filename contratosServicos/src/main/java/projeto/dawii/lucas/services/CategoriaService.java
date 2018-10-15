package projeto.dawii.lucas.services;

import java.io.Serializable;
import java.util.List;


import projeto.dawii.lucas.entities.Categoria;

import projeto.dawii.lucas.DAO.CategoriaDAO;
import  projeto.dawii.lucas.util.TransacionalCdi;

public class CategoriaService implements Serializable ,Service<Categoria>{

	private static final long serialVersionUID = -7803325791425670859L;
	private CategoriaDAO categoriaDAO;
	
	@Override
	@TransacionalCdi
	public void save(Categoria e) {
		categoriaDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Categoria e) {
		categoriaDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Categoria e) {
		categoriaDAO.remove(e);
		
	}

	@Override
	public Categoria getByID(long categoriaId) {
		return categoriaDAO.getByID(categoriaId);
	}

	@Override
	public List<Categoria> getAll() {
		return categoriaDAO.getAll();
	}
}