package Exceptions;

public class CampoEmBrancoException extends Exception {
	public CampoEmBrancoException() {
		super("O campo esta em branco");
	}
}
