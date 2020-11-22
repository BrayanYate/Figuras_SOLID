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
public class Cuadrado extends FiguraGeometrica {
    @Override
    public void calcularArea(){
        this.area = valor * valor;
    }
    
    @Override
    public void calcularPerimetro(){
        this.perimetro = valor * 4;
    }
}
