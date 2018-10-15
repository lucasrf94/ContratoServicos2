package projeto.dawii.lucas.DAO;


import java.util.List;

import projeto.dawii.lucas.filters.ClienteFilter;
import projeto.dawii.lucas.entities.Cliente;

public class ClienteDAO extends DAO<Cliente> {
	
	public ClienteDAO() {
		super(Cliente.class);
	}

	public List<Cliente> findBy(ClienteFilter filtro) {
		return null;
	}
	
}
