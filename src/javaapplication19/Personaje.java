package javaapplication19;

public class Personaje {
    //Inserte acá los atributos
    String nombre;
    char sexo;
    double posicionX ;
    double posicionY ;
    double vida = 100;
    double damage;
  
    
    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo,double posicionX ,double posicionY, double damage){//personaje
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }
    
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear (Personaje p){
        
        double d = calcularDistanciaRespectoPersonaje(p);
        
        p.setVida(p.getVida() - this.getDamage()/d);
        }
    
    public void recibirImpacto(double d){
        setVida(getVida() - d);
    }
    
    public double calcularDistanciaRespectoPersonaje(Personaje p){
        double d = Math.sqrt (Math.pow((this.getPosicionX() - p.getPosicionX()),2) + 
                             (Math.pow((this.getPosicionY() - p.getPosicionY()),2)));
        return d;
    }
    
    
    //Inserte acá los SETTERS Y GETTERS
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    
    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
        if (this.vida < 0){
            this.vida = 0;
        }
    }
      
    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
    
    
    
    
}