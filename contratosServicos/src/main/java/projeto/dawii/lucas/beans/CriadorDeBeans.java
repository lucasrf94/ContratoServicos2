package projeto.dawii.lucas.beans;

import java.util.Scanner;

public class CriadorDeBeans {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String v2 = sc.nextLine();
		

		
		System.out.println("protected "+v2+" entidade;\r\n" + 
				"\r\n" + 
				"	protected Collection<"+v2+"> entidades;\r\n" + 
				"\r\n" + 
				"	public "+v2+"Bean() {\r\n" + 
				"	}\r\n" + 
				"	\r\n" + 
				"	@PostConstruct\r\n" + 
				"	public void init() {\r\n" + 
				"		entidade = newEntidade();\r\n" + 
				"		entidades = getService().getAll();\r\n" + 
				"	}\r\n" + 
				"	\r\n" + 
				"	public void remove("+v2+" entidade) {\r\n" + 
				"		getService().remove(entidade);\r\n" + 
				"		limpar();\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public "+v2+" getEntidade() {\r\n" + 
				"		return entidade;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public void setEntidade("+v2+" entidade) {\r\n" + 
				"		this.entidade = entidade;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public Collection<"+v2+"> getEntidades() {\r\n" + 
				"		return entidades;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public void setEntidades(Collection<"+v2+"> entidades) {\r\n" + 
				"		this.entidades = entidades;\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public void save() {\r\n" + 
				"		getService().save(entidade);\r\n" + 
				"		limpar();\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public void editar(Long id) {\r\n" + 
				"		this.getEntidade().setId(id);\r\n" + 
				"		save();\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public void limpar() {\r\n" + 
				"		entidades = getService().getAll();\r\n" + 
				"		entidade = newEntidade();\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	protected "+v2+" newEntidade() {\r\n" + 
				"		return new "+v2+"();\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	public "+v2+"Service getService() {\r\n" + 
				"		return service;\r\n" + 
				"	}");
	}
}