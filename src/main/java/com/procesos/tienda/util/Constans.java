package com.procesos.tienda.util;

import lombok.Getter;

@Getter
public enum Constans {

    USER_NOT_FOUND("User not found"),
    USER_IS_NULL("User is null"),
    ADDRESS_NOT_FOUND("Address not found");

    private String message;

    private Constans(String message){
        this.message = message;
    }

}
