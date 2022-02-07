package com.josemanuel.funcion;

import java.util.Scanner;
import java.util.function.Function;

import com.josemanuel.menu.ExitMenuException;

/**
 * proviene de la clase menu y su función bucle, la cuál salta la excepción a esta
 * clase y ésta a su vez lleva a la clase ExitMenuException
 */
public class FuncionExitMenu implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner t) {
        
        throw new ExitMenuException();

        //return null;
    }
    
}
