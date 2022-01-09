//  Author: Mohammad Jihad Hossain
//  Create Date: 04/01/2022
//  Modify Date: 04/01/2022
//  Description: ResourceNotFound exception file

package com.jihad.rtr.wfp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static  final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
