/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_inicio;


import java.io.*;
import java.math.BigInteger;
//import java.io.IOException;
import java.util.*;
/**
 *
 * @author planfipinf
 */

public class punto {
    //solo se pueden acceder desde la clase
    protected double x, y;// Si se cambia el private x protected, hacemos que las clases
    //hijas hereden lamayoria de las cosas de la clase padre
    
    public punto(double x, double y){
        this.x= x;
        this.y= y;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
    //----------------------------------------------
    
   public void tonto(){
       System.out.println("Punto tonto");
   }
    
    
    public double distanciaA(punto otro){
        double dx,dy;
        dx =this.x - otro.x;
        dy =this.y - otro.y;
        
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    double distanciaAlOrigen(){
        return Math.sqrt(x*x+y*y);
    }
    
      double distanciaAlOrigenDos(){
        return distanciaA(new punto(0,0));
    }
    //----------------------------------------------------------------
    //----------------------------------------------------------------
    public static void main(String[] args) {
        
        
        Scanner a_ = new Scanner(System.in);
        System.out.println("dime punto x");
        int x = a_.nextInt();
        
        Scanner b_ = new Scanner(System.in);
        System.out.println("dime punto y");
        int y = b_.nextInt();
        
        punto a ;
        
        a = new punto(x,y);
        System.out.println(a);
      
        
       
}

  
}
