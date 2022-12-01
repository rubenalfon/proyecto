/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author alfgonru
 */
public class JuegoDeLosDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Iniciacion de Variables
        Character jugar; //Introducida por el usuario S o N.
        int boteBanca = 0;
        int boteMaquina = 100;
        int boteJugador = 100;

        int dado1;
        int dado2;
        int puntosMaquina, puntosJugador;

        int salida; //Es el numero con el que se inicia la ronda
        int actual; //Es el numero que acabas de sacar en la ronda

        boolean primeraVez = true;
        boolean laLlevas = true; //Indica si es tu turno o no.

        //Código
        //Primera ronda
        System.out.println("*".repeat(30));
        System.out.println(String.format("%24s", "Juego de los dados"));
        System.out.println("*".repeat(30));

        System.out.print("Te atreves a jugar contra mi? (S/N): ");
        jugar = sc.nextLine().toUpperCase().charAt(0);

        while (jugar == 'S') {
            if (primeraVez) {
                System.out.println("\n\tBanca: " + boteBanca + " euros");
                System.out.println("\tMaquina: " + boteMaquina + " euros");
                System.out.println("\tJugador: " + boteJugador + " euros");
                System.out.println("\nEmpieza la partida el que saque mas puntos...");

                //Se van a lanzar los dados para la maquina y despues, para el jugador
                dado1 = (int) ((5) * Math.random() + 1 + .5);
                dado2 = (int) ((5) * Math.random() + 1 + .5);
                puntosMaquina = dado1 + dado2;
                System.out.println("\tPuntos maquina: " + puntosMaquina);
                dado1 = (int) ((5) * Math.random() + 1 + .5);
                dado2 = (int) ((5) * Math.random() + 1 + .5);
                puntosJugador = dado1 + dado2;
                System.out.println("\tPuntos jugador: " + puntosJugador);
                if (puntosMaquina == puntosJugador) {
                    System.out.println("Se repite...");
                } else if (puntosJugador > puntosMaquina) {
                    System.out.println("Empiezas");
                    laLlevas = true;
                    System.out.println("Juegas tu...");
                } else {
                    System.out.println("Empiezo yo");
                    laLlevas = false;
                    System.out.println("Juego...");
                }
                primeraVez = false;
            }// Hasta aqui llega la primera vez que dices que quieres jugar con él.

            //Código compartido por jugadores
            dado1 = (int) ((5) * Math.random() + 1 + .5);
            dado2 = (int) ((5) * Math.random() + 1 + .5);
            salida = dado1 + dado2;

            System.out.println("Tirada de salida: " + salida + "\tPunto: " + salida);

            do {
                dado1 = (int) ((5) * Math.random() + 1 + .5);
                dado2 = (int) ((5) * Math.random() + 1 + .5);
                actual = dado1 + dado2;
                System.out.println("Tirada para el punto: " + actual);

            } while (!(actual == salida || actual==7));

            // Perder/ganar por jugador
            if (laLlevas) {
                if (actual == 7) {
                    System.out.println("vaya he perdido");
                    boteMaquina -= 15;
                    boteBanca += 15;
                } else {
                    System.out.println("Lo siento. He ganado.");
                    boteJugador -= 15;
                    boteMaquina += 15;
                }
            } else {
                if (actual == 7) {
                    System.out.println("vaya he perdido");
                    boteMaquina -= 15;
                    boteBanca += 15;
                } else {
                    System.out.print("Lo siento. He ganado.");
                    boteJugador -= 15;
                    boteMaquina += 15;
                }
                System.out.println("AAAAAA");
                
                System.out.print("Continuamos jugando? (S,N): ");
                jugar = sc.nextLine().toUpperCase().charAt(0);
                //Código si te toca a ti
                //Recuento de banca
                //Volver a jugar?

            }
            if (jugar == 'N') {
                System.out.println("Bueno. Adios...");
            } else {
                System.out.println("Error. Respuesta invalida.");
            }
        }
    }
}
