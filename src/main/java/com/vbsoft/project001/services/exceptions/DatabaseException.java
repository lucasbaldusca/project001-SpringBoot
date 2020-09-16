package com.vbsoft.project001.services.exceptions;

public class DatabaseException extends RuntimeException {
	
	public DatabaseException(String msg) {
		super(msg); // chama o construtor da RunTimeException, passando essa "msg", vai gerar a exceção com a mensagem que eu mandar
	}

}
