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
public abstract class Asiento {

    char tipo;
    String ID;
    boolean pantallaEncendida = false;
    double inclinacionSilla = 90;
    boolean luzLecturaEncendida = false;
    boolean luzAsistenciaEncendida = false;
    boolean aireAcondicionadoEncedido = false;
    
    
    public Asiento(String ID,char tipo ){
        this.tipo = tipo;
        this.ID = ID;
    }
    
    public void gestionarAireAcondicionado (){
        if (isAireAcondicionadoEncedido()){
            setAireAcondicionadoEncedido(false);
        }else{
            setAireAcondicionadoEncedido(true);
        }
    }
    public void gestionarPantalla (){
        if (isPantallaEncendida()){
            setPantallaEncendida(false);
        }else{
            setPantallaEncendida(true);
        }
    }
    public void gestionarLuzLectura (){
        if (isLuzLecturaEncendida()){
            setLuzLecturaEncendida(false);
        }else{
            setLuzLecturaEncendida(true);
        }
    }
    public void gestionarLuzAsistencia (){
        if (isLuzAsistenciaEncendida()){
            setLuzAsistenciaEncendida(false);
        }else{
            setLuzAsistenciaEncendida(true);
        }
    }
    public void aumentarInclinacion(double d){
        setInclinacionSilla(getInclinacionSilla()+d);
        if(getInclinacionSilla()>135){
            setInclinacionSilla(135);
        }
    }
    public void disminuirInclinacion(double d){
        setInclinacionSilla(getInclinacionSilla()-d);
        if(getInclinacionSilla()<0){
            setInclinacionSilla(0);
        }
    }
    abstract String imprimirMenuPantalla();
    
    
    
    
    
  
    // SETTERS Y GETTERS
    
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    
    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

   
    public boolean isAireAcondicionadoEncedido() {
        return aireAcondicionadoEncedido;
    }

    public void setAireAcondicionadoEncedido(boolean aireAcondicionadoEncedido) {
        this.aireAcondicionadoEncedido = aireAcondicionadoEncedido;
    }


}
