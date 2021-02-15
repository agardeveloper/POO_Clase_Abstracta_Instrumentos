/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import com.nowe.modelo.Bateria;
import com.nowe.modelo.Flauta;
import com.nowe.modelo.Guitarra;
import com.nowe.modelo.InstrumentoMusical;

/**
 *
 * @author agarm
 */
public class Main_InstrumentosMusicales_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar:
        //Clase Guitarrra
        InstrumentoMusical guitarra1 = new Guitarra("acero", "Fernandes");
        System.out.println("Cuando tocas este instrumento " + guitarra1.emitirSonido());
        System.out.println(guitarra1.toString());
        
        //Clase Bateria
        InstrumentoMusical bateria1 = new Bateria(6, "Yamaha");
        System.out.println("Cuando tocas este instrumento " + bateria1.emitirSonido());
        System.out.println(bateria1.toString());
        
        //Clase Flauta
        InstrumentoMusical flauta1 = new Flauta("madera", "Bardo Folk");
        System.out.println("Cuando tocas este instrumento " + flauta1.emitirSonido());
        System.out.println(flauta1.toString());
        
        //Array y bucle for each
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = guitarra1;
        instrumentos[1] = bateria1;
        instrumentos[2] = flauta1;
        
        for (InstrumentoMusical e : instrumentos) {
            System.out.println(e.emitirSonido());
        }
        
    }
    
}
