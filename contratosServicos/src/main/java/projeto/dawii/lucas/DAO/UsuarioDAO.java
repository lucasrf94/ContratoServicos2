package projeto.dawii.lucas.DAO;

import java.util.List;

import projeto.dawii.lucas.filters.UsuarioFilter;
import projeto.dawii.lucas.entities.Usuario;

public class UsuarioDAO extends DAO<Usuario> {
	
	public UsuarioDAO() {
		super(Usuario.class);
	}

	public List<Usuario> findBy(UsuarioFilter filtro) {
		return null;
	}
	
}
