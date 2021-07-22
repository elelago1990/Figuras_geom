/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elena.geometria;
import ejercicios_inicio.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author planfipinf
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       punto a,b,c,d;
       
       //puntos
       a= new punto(1,1);
       b= new punto(1,5);
       c= new punto(1,8);
       d = new punto(2,8);
       
       
       //triangulo
       triangulo t1 = new triangulo(a,b,c);
       System.out.println("triangulo");
       System.out.println(t1);
       System.out.println("el perimetro del triangulo es:"+" "+t1.perimetro());
       
       //rectangulo
       rectangulo r1= new rectangulo(a,b,c,d);
       System.out.println("rectgulo");
       System.out.println(r1);
       System.out.println("el perimetro del rectangulo es:"+" "+" "+r1.perimetro());
       //cuadrado
       cuadrado c1= new cuadrado(a,b,c,d);
       System.out.println("cuadrado");
       System.out.println(c1);
       System.out.println("el perimetro del cuadrado es:"+" "+" "+c1.perimetro());
    }
    
}
