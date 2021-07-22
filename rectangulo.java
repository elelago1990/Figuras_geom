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
public class rectangulo extends figura{

    public rectangulo(punto a,punto b,punto c, punto d) {
        vertices = new punto[4];
        vertices[0]= a;
        vertices[1]= b;
        vertices[2]= c;
        vertices[3]= d;
    }
    
     @Override
    public String toString() {
//        return "rectgulo{" +vertices[0]+','+vertices[1]+','+ vertices[2]+','+ vertices[3]+'}';
        return "rectangulo{"+super.toString()+'}';
    }

}//fin rectangulo
