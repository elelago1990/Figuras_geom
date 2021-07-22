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
public class triangulo extends figura {

    public triangulo(punto a,punto b,punto c) {
        vertices = new punto[3];
        vertices[0]= a;
        vertices[1]= b;
        vertices[2]= c;
    }

    @Override
    public String toString() {
//        return "triangulo{" +vertices[0]+','+vertices[1]+','+ vertices[2]+'}';
            return "triangulo{"+super.toString()+'}';
    }

     
}//fin triangulo
