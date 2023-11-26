package com.procesos.tienda.util;

import lombok.Getter;

@Getter
public enum Constans {

    USER_NOT_FOUND("User not found"),
    USER_IS_NULL("User is null"),
    ADDRESS_NOT_FOUND("Address not found"),
    CREDENTIAL_INVALID("Credentials invalid!"),
    USER_EMAIL_EXISTS("The email is already registered");

    private String message;

    private Constans(String message){
        this.message = message;
    }

}
