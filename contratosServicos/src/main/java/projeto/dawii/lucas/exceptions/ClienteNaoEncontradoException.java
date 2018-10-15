package projeto.dawii.lucas.exceptions;

public class ClienteNaoEncontradoException extends Exception {
	public ClienteNaoEncontradoException() {
		super("O cliente nao foi encontrado");
	}
}
