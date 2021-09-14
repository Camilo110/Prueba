package javaapplication19;

public class Jugador extends Personaje{
    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos
    int numeroBotiquines = 0;
    
    
    //Inserte acá el método constructor
    public Jugador(String nombre, char sexo,double posicionX ,double posicionY, double damage){
        super(nombre,sexo,posicionX,posicionY,damage);
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void usarBotiquin(){
        if (getNumeroBotiquines() > 0){
            setNumeroBotiquines(getNumeroBotiquines() - 1);
            System.out.println("entreee");
            setVida(getVida() + 5);     
        }
    }
    
    public void recogerBotiquin(){
        setNumeroBotiquines(getNumeroBotiquines() + 1);
    }
    
    public void moverDerecha(double d){
        setPosicionX(getPosicionX() + d);
    }
    
    public void moverIzquierda(double d){
        setPosicionX(getPosicionX() - d);
    }
    
    public void moverArriba(double d){
        setPosicionY(getPosicionY() + d);
    }
    
    public void moverAbajo(double d){
        setPosicionY(getPosicionY() - d);
    }
    
    public void golpear(Enemigo p){
        double d = calcularDistanciaRespectoPersonaje(p);
        
        p.setVida(p.getVida() - (this.getDamage()/d));
        p.evolucionar();
    }
    
    
    //Inserte acá los SETTERS Y GETTERS
     public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
    
    
}