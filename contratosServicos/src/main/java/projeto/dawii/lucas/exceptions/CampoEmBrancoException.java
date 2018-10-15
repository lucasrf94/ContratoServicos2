package projeto.dawii.lucas.exceptions;

public class CampoEmBrancoException extends Exception {
	public CampoEmBrancoException() {
		super("O campo esta em branco");
	}
}
