package projeto.dawii.lucas.services;

import java.io.Serializable;
import java.util.List;

import projeto.dawii.lucas.DAO.ClienteDAO;
import projeto.dawii.lucas.entities.Cliente;
import projeto.dawii.lucas.util.TransacionalCdi;

public class ClienteService implements Serializable ,Service<Cliente>{

	private static final long serialVersionUID = -7803325791425670859L;
	private ClienteDAO clienteDAO;
	
	@Override
	@TransacionalCdi
	public void save(Cliente e) {
		clienteDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Cliente e) {
		clienteDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Cliente e) {
		clienteDAO.remove(e);
		
	}

	@Override
	public Cliente getByID(long clienteId) {
		return clienteDAO.getByID(clienteId);
	}

	@Override
	public List<Cliente> getAll() {
		return clienteDAO.getAll();
	}
}