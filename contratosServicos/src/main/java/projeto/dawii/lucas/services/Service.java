package projeto.dawii.lucas.services;

import java.util.List;

import projeto.dawii.lucas.entities.Identificavel;

public interface Service<E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List<E> getAll();

}