/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.modelo;

/**
 *
 * @author agarm
 */
public class Cuadrado extends Figura {
    //Atributos
    private double lado;
    
    //Métodos
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    //@Override
    //public String mostrarPosicion() {
      // return "La posición del cuadrado ";
    //}
    
    //toString
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}' + " posición " + super.toString();
    }
    
    //Constructores
    public Cuadrado() {
    }

    public Cuadrado(double lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    
    //Setters y Getters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    
    
}
