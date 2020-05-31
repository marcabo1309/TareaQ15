/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martacabo.figuras;

/**
 *
 * @author marcabo
 */
public class Rectangulo {
    private double lado1,lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double areaRectang(){
        double area;
        area=lado1*lado2;
        return area;
    }
    
    public double  perimetroRectang(){
        return (lado1 * 2) + (lado2 * 2);
    }
    
}
