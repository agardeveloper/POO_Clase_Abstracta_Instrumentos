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
public class Triangulo extends Figura {
    //Atributos
    private double base, altura;
    
    //Métodos
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    //@Override
    //public String mostrarPosicion() {
        //return "La posicón del triángulo ";
    //}
    
    //toString
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}' + " posición " + super.toString();
    }
    
    //Constructores
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, int x, int y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    
    
    
    //Setters y Getters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
