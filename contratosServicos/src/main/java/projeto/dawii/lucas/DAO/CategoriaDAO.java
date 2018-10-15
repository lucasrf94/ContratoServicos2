package projeto.dawii.lucas.DAO;

import java.util.List;

import projeto.dawii.lucas.entities.Categoria;
import projeto.dawii.lucas.filters.CategoriaFilter;


public class CategoriaDAO extends DAO<Categoria> {
	
	public CategoriaDAO() {
		super(Categoria.class);
	}
	public List<Categoria> findBy(CategoriaFilter filtro) {
		return null;
	}
	
}
