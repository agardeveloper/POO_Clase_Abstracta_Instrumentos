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
public class Flauta extends InstrumentoMusical{
    //Atributos
    private String material;
    
    //Métodos
    @Override
    public String emitirSonido() {
        return "suena una flauta";
    }
    
    //toString
    @Override
    public String toString() {
        return "Flauta{" + "material=" + material + '}' + " " + super.toString();
    }
    
    //Constructores
    public Flauta() {
    }

    public Flauta(String material, String marca) {
        super(marca);
        this.material = material;
    }
    
    //Setters y Getters

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    

    

    
}
