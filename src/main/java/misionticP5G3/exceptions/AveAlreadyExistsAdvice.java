/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misionticP5G3.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author USER
 */
@ControllerAdvice
@ResponseBody
public class AveAlreadyExistsAdvice {
    @ResponseBody
    @ExceptionHandler(AveAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String EntityAlreadyExits(AveAlreadyExistsException ex) {
        return ex.getMessage();
    }
}