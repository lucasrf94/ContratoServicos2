package projeto.dawii.lucas.services;

import java.util.Scanner;

public class Issoai {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String v1=sc.nextLine();
		String v2 = sc.nextLine();
		System.out.println("import java.io.Serializable;\r\n" + 
				"import java.util.List;\r\n" + 
				"\r\n" + 
				"import projeto.dawii.lucas.DAO."+v1+"DAO;\r\n" + 
				"import projeto.dawii.lucas.entities."+v1+";\r\n" + 
				"import projeto.dawii.lucas.util.TransacionalCdi;");
		System.out.println();
		
		System.out.println("public class "+ v1 + "Service implements Serializable ,Service<"+v1+">{\r\n" + 
				"\r\n" + 
				"	private static final long serialVersionUID = -7803325791425670859L;\r\n" + 
				"	private "+v1+"DAO "+v2+"DAO;\r\n" + 
				"	\r\n" + 
				"	@Override\r\n" + 
				"	@TransacionalCdi\r\n" + 
				"	public void save("+v1+" e) {\r\n" + 
				"		"+v2+"DAO.save(e);\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	@Override\r\n" + 
				"	@TransacionalCdi\r\n" + 
				"	public void update("+v1+" e) {\r\n" + 
				"		"+v2+"DAO.update(e);\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	@Override\r\n" + 
				"	@TransacionalCdi\r\n" + 
				"	public void remove("+v1+" e) {\r\n" + 
				"		"+v2+"DAO.remove(e);\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	@Override\r\n" + 
				"	public "+v1+" getByID(long "+v2+"Id) {\r\n" + 
				"		return "+v2+"DAO.getByID("+v2+"Id);\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"	@Override\r\n" + 
				"	public List<"+v1+"> getAll() {\r\n" + 
				"		return "+v2+"DAO.getAll();\r\n" + 
				"	}\r\n" + 
				"}");
	}
}