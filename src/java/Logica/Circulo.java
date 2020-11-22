/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica {
    @Override
    public void calcularArea(){
        this.area = (valor * valor)*(3.1415);
    }
    
    @Override
    public void calcularPerimetro(){
        this.perimetro = (2*valor) * (3.1415);
    } 
}
