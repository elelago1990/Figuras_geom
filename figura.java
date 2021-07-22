/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elena.geometria;
import ejercicios_inicio.*;
import ejercicios_inicio.punto;
import java.io.*;
import java.util.*;
/**
 *
 * @author planfipinf
 */
public class figura {
    protected punto[] vertices;
    
    public String toString(){
        String s= " ";
        for (int i=0; i<vertices.length; i++)
            s= s+vertices[i]+",";
        return s;
        
    }
    
    public double perimetro(){
        double p= 0;int i;//sumar distancia del p0 al p1
            for ( i=0; i<vertices.length; i++){
                double d = vertices[i].distanciaA(vertices[i+1]);
                p=p+d;
                
            }
            p= p+vertices[i].distanciaA(vertices[0]);
        return p;
    
    }
}
