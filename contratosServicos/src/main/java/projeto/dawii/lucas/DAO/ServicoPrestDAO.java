package projeto.dawii.lucas.DAO;

import java.util.List;

import projeto.dawii.lucas.entities.ServicoPrest;
import projeto.dawii.lucas.filters.ServicoPrestFilter;


public class ServicoPrestDAO extends DAO<ServicoPrest> {
	
	public ServicoPrestDAO() {
		super(ServicoPrest.class);
	}
	public List<ServicoPrest> findBy(ServicoPrestFilter filtro) {
		return null;
	}
	
}
