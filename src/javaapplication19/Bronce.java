/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author urrea
 */
public class Bronce extends Asiento{

    public Bronce(String ID, char tipo) {
        super(ID, tipo);
    }

    
    String imprimirMenuPantalla() {
       return "BRONCE"; 
    }
    
}
