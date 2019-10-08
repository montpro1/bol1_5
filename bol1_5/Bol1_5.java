/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_5;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Bol1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
                float milla;
                System.out.println("teclee las millas que quiere convertir");
                milla=teclado.nextFloat();
                float metros=milla*1852;
                System.out.println(milla + " millas son "+metros + " metros");
                
                
    }
    
}
