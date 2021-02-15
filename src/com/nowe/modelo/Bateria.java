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
public class Bateria extends InstrumentoMusical {

    //Atributos
    private int numPlatillos;

    //Métodos
    @Override
    public String emitirSonido() {
        return "suena una batería";
    }

    //toString
    @Override
    public String toString() {
        return "Bateria{" + "numPlatillos=" + numPlatillos + '}' + " " + super.toString();
    }

    //Constructores
    public Bateria() {
    }

    public Bateria(int numPlatillos, String marca) {
        super(marca);
        this.numPlatillos = numPlatillos;
    }

    //Setters y Getters

    public int getNumPlatillos() {
        return numPlatillos;
    }

    public void setNumPlatillos(int numPlatillos) {
        this.numPlatillos = numPlatillos;
    }
    
    
}
