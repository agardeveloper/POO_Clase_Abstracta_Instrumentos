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
public abstract class InstrumentoMusical {

    //Atributos
    protected String marca;

    //Métodos
    public abstract String emitirSonido();

    //toString
    @Override
    public String toString() {
        return "InstrumentoMusical{" + "marca=" + marca + '}';
    }

    //Constructores
    
        public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }
    
    //Setters y Getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

}
