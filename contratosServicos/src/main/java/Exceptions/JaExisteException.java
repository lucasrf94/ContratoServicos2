package Exceptions;

public class JaExisteException extends Exception {
		public JaExisteException() {
			super("O item ja existe");
		}
	}
