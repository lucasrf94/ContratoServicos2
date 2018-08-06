package beans;

import java.util.ArrayList;
import java.util.List;

import entities.Categoria;

public class CategoriaBean {
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private Categoria categoria = new Categoria();
	private int id_cat;
	private static int contador = 0;

	private Categoria categoriaBuscada = new Categoria();

	private String updateNome;

	private String updateTipo;

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId(int id_cat) {
		this.id_cat = id_cat;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		CategoriaBean.contador = contador;
	}

	public Categoria getCategoriaBuscada() {
		return categoriaBuscada;
	}

	public void setCategoriaBuscada(Categoria categoriaBuscada) {
		this.categoriaBuscada = categoriaBuscada;
	}

	public String getUpdateNome() {
		return updateNome;
	}

	public void setUpdateNome(String updateNome) {
		this.updateNome = updateNome;
	}

	public String getUpdateTipo() {
		return updateTipo;
	}

	public void setUpdateTipo(String updateTipo) {
		this.updateTipo = updateTipo;
	}

	public void adicionarCategoria() {
		categoria.setId_categoria(contador++);
		categorias.add(categoria);
		categoria = new Categoria();
	}

	public void buscarCategoria() {
		Categoria categoria = new Categoria();
		for (Categoria cat : categorias) {
			if (getId_cat() == cat.getId_categoria())
				;
				categoria = cat;
				setCategoriaBuscada(categoria);
		}
	}

	public void removerCategoria() {
		categorias.remove(getCategoriaBuscada());
		categoriaBuscada = new Categoria();
	}
}
