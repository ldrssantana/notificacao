package com.leandro.notificacao.business.Infrascruture.exceptions;

public class EmailException extends   RuntimeException{

    public EmailException(String mensagem){
        super(mensagem);
    }

    public EmailException(String mensagem, Throwable trowable){
        super(mensagem, trowable);
    }
}
