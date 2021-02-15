/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import com.nowe.modelo.Cuadrado;
import com.nowe.modelo.Figura;
import com.nowe.modelo.Triangulo;

/**
 *
 * @author agarm
 */
public class Main_Figura_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar:
        //Objeto de la Clase Triangulo
        Figura triangulo1 = new Triangulo(5, 4, 12, 45);
        System.out.println("El área del triángulo es: " + triangulo1.calcularArea());
        System.out.println(triangulo1.toString());
        System.out.println("La posición del triángulo es: " + triangulo1.mostrarPosicion());
        
        //Objeto de la Clase Cuadrado
        Figura cuadrado1 = new Cuadrado(5, 6, 12);
        System.out.println("El área del cuadrado es: " + cuadrado1.calcularArea());
        System.out.println(cuadrado1.toString());
        System.out.println("La posición del triángulo es: " + cuadrado1.mostrarPosicion());
        
        //Array y bucle for each
        Figura[] figura = new Figura[2];
        figura[0] = triangulo1;
        figura[1] = cuadrado1;
        
        System.out.println("Areas totales calculadas: ");
        for (Figura e : figura) {
            System.out.println(e.calcularArea());
        }
        
        //Ejercicio:
        // Crear una instancia de Cuadrado con el nombre de objeto cPeque asignarle los valores por setters
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(2);
        cPeque.setX(1);
        cPeque.setY(1);
        System.out.println(cPeque.toString());
        System.out.println("Area -> " + cPeque.calcularArea());

        // Crear una instancia de Cuadrado en una referencia de Figura con el nombre de objeto cMediano usando el constructor
        Figura cMediano = new Cuadrado(5, 23, 12);
        System.out.println(cMediano.toString());
        System.out.println("Area -> " + cMediano.calcularArea());

        // Crear una instancia de Triangulo con el nombre de objeto tPeque asignarle los valores por setters
        Triangulo tPeque = new Triangulo();
        tPeque.setAltura(2);
        tPeque.setBase(4);
        tPeque.setX(3);
        tPeque.setY(3);
        System.out.println(tPeque.toString());
        System.out.println("Area -> " + tPeque.calcularArea());

        // Crear una instancia de Triangulo en una referencia de Figura con el nombre de objeto tMediano usando el constructor
        Figura tMediano = new Triangulo(12, 14, 5, 5);
        System.out.println(tMediano.toString());
        System.out.println("Area - > " + tMediano.calcularArea());

        // Crear una matriz de Figuras y asignarle los objetos creados
        Figura[] figura2 = new Figura[4];
        figura[0] = cPeque;
        figura[1] = cMediano;
        figura[2] = tPeque;
        figura[3] = tMediano;

        // En un bucle for each calcular el área de c/u
        System.out.println("Areas totales calculadas: ");
        for (Figura a : figura) {
            System.out.println("Area " + a.calcularArea());
        }
    }
    
}
