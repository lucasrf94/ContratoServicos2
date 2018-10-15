package projeto.dawii.lucas.DAO;

import java.util.List;

import projeto.dawii.lucas.filters.ServidorFilter;
import projeto.dawii.lucas.entities.Servidor;;

public class ServidorDAO extends DAO<Servidor> {
	
	public ServidorDAO() {
		super(Servidor.class);
	}
	public List<Servidor> findBy(ServidorFilter filtro) {
		return null;
	}
	
}
