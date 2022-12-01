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
            int dado2 = (int) ((5) * Math.random() + 1.5);
            Random dado1 = new Random();
            System.out.println(dado1.nextInt());
            System.out.println(dado1.nextInt());
            System.out.println(dado1.nextInt());
            System.out.println(dado1.nextInt());
        }
    }
}
