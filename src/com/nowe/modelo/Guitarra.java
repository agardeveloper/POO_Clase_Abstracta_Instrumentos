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
public class Guitarra extends InstrumentoMusical {

    //Atributos
    private String tiposCuerda;

    //Métodos
    @Override
    public String emitirSonido() {
        return "suena una guitarra";
    }

    //toString
    @Override
    public String toString() {
        return "Guitarra{" + "tiposCuerda=" + tiposCuerda + '}' + " " + super.toString();
    }

    //Constructores
    public Guitarra() {
    }

    public Guitarra(String tiposCuerda, String marca) {
        super(marca);
        this.tiposCuerda = tiposCuerda;
    }

    //Setters y Getters

    public String getTiposCuerda() {
        return tiposCuerda;
    }

    public void setTiposCuerda(String tiposCuerda) {
        this.tiposCuerda = tiposCuerda;
    }
    
    
}
