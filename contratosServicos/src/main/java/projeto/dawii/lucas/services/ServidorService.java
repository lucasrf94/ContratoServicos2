package projeto.dawii.lucas.services;

import java.io.Serializable;
import java.util.List;

import projeto.dawii.lucas.DAO.ServidorDAO;
import projeto.dawii.lucas.entities.Servidor;
import projeto.dawii.lucas.util.TransacionalCdi;

public class ServidorService implements Serializable ,Service<Servidor>{

	private static final long serialVersionUID = -7803325791425670859L;
	private ServidorDAO servidorDAO;
	
	@Override
	@TransacionalCdi
	public void save(Servidor e) {
		servidorDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Servidor e) {
		servidorDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Servidor e) {
		servidorDAO.remove(e);
		
	}

	@Override
	public Servidor getByID(long servidorId) {
		return servidorDAO.getByID(servidorId);
	}

	@Override
	public List<Servidor> getAll() {
		return servidorDAO.getAll();
	}
}