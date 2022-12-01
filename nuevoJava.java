/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.Random;

/**
 *
 * @author alfgonru
 */
public class Prueba {

    public static void main(String[] args) {

        while (true) {
            Random dado1 = new Random(0,5);
            Random dado2 = new Random(5,10);
            Random dado3 = new Random(10,15);
            System.out.println(dado1.nextInt());
            System.out.println(dado2.nextInt());
            System.out.println(dado3.nextInt());
        }
    }
}
