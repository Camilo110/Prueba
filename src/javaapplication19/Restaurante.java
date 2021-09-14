/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.ArrayList;

/**
 *
 * @author urrea
 */
public class Restaurante {

    

    private ArrayList<Pedido> pedidos = new ArrayList();
    
    public void agregarPedidoLista(Pedido p){
        boolean si = true; 
        if(getPedidos().isEmpty()){
            getPedidos().add(p);  
        }else{
            for(int i = 0; i<getPedidos().size(); i++){
                if(getPedidos().get(i).getnPedido().equals(p.getnPedido())){
                    si = false;  
                    break;
                }
            } 
            if(si){
                getPedidos().add(p);
            }
        } 
    }
    public void eliminarPedido(String nPedido){
        for(int i = 0; i<getPedidos().size(); i++){
                if(getPedidos().get(i).getnPedido().equals(nPedido)){
                    getPedidos().remove(i);
                }
        } 
    }
    public double calcularGanancias(){
        double suma = 0;
        for(int i = 0; i<getPedidos().size(); i++){
            suma += getPedidos().get(i).getCostoPedido();
        }
        return suma;
    }
    public double promedioGananciasTotales(){
        double suma = 0;
        for(int i = 0; i<getPedidos().size(); i++){
            suma += getPedidos().get(i).getCostoPedido();
        }
        return suma/getPedidos().size();
    }
    public double desviacionEstandarGananciasTotales(){
        int n = getPedidos().size();
        double x1;
        double u = promedioGananciasTotales();
        double sumatoria = 0;
        
        for(int i = 0; i<getPedidos().size(); i++){
            sumatoria += Math.pow((getPedidos().get(i).getCostoPedido()- u), 2);
        }
        
        x1 = Math.sqrt(sumatoria)/(n);
        return x1;
    }
    public double retornarCostoPedido(String ID){
        double retornar =-2;
        for(int i = 0; i<getPedidos().size(); i++){
            if(getPedidos().get(i).getnPedido().equals(ID)){
                retornar = getPedidos().get(i).getCostoPedido();
            }
        }
        return retornar;
    }
 
        public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
