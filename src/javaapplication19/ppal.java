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
public class ppal {
    Jugador j = new Jugador("Explorador", 'm', 0,5,100);
    Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
    
    public void mostrar (){
        System.out.println("pos X " + j.posicionX + " -- " + e.posicionX);
        System.out.println("pos y " + j.posicionY + " -- " + e.posicionY);
        System.out.println("daño " + j.getDamage() + " -- " + e.getDamage());
        System.out.println("vida " + j.getVida() + " -- " + e.getVida());
        System.out.println("______________________________" + "\n");
    }
    public void usar(){
        mostrar();
        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin();
        j.moverDerecha(10);
        j.moverAbajo(5);
        mostrar();
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        mostrar();
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        mostrar();
        e.golpear(j);
        e.golpear(j);
        mostrar();
        j.golpear(e);
        j.golpear(e);
        mostrar();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        mostrar();
                
        
        
    }
    public static void main(String[] args) {
        ppal x = new ppal();
        x.usar();
    }
    
}
