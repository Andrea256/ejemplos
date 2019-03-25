/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplos;

import java.util.Scanner;

/**
 *
 * @author AndreaOrjuela
 */
public class Avion {
    private Scanner teclado = new Scanner(System.in);
    //Declaración 
    private boolean[] asientosPrimera;
    private boolean[] asientosEconomicos;
    private final int NUM_ASIENTOS_PRIMERA = 5;
    private final int NUM_ASIENTOS_ECONOMICOS = 5;

    //Constructor
    Avion() {
        asientosPrimera = new boolean[NUM_ASIENTOS_PRIMERA];
        asientosEconomicos = new boolean[NUM_ASIENTOS_ECONOMICOS];
    }

    //Métodos
    public void AsientoPrimera() {
        String opcion;
        char letra;
        int condicion = 0;
        int i = 0;
        final int k = 1;
        while (condicion != 1) {
            if (asientosPrimera[NUM_ASIENTOS_PRIMERA - k]) {
                System.out.println("La Primera clase está llena. Desea viajar "
                        + "en clase económica[S|N]");
                opcion = teclado.next();
                letra = opcion.charAt(0);
                if (letra == 's' || letra == 'S') {
                    AsientoEconomico();
                    condicion = 1;
                } else {
                    System.out.println("Vuelva cuando quiera.");
                    condicion = 1;
                }
            }
            if (!asientosPrimera[i]) {
                asientosPrimera[i] = true;
                System.out.println("Se le ha asignado el asiento nº "
                        + (i + k) + " de la Primera clase.");
                condicion = 1;
            } else if (asientosPrimera[i]) {
                i++;
            }
        }
    }

    public void AsientoEconomico() {
        String opcion;
        char letra;
        int condicion = 0;
        int i = 0;
        final int k = 1;
        while (condicion != 1) {
            if (asientosEconomicos[NUM_ASIENTOS_ECONOMICOS - k]) {
                System.out.println("La clase Económica está llena. Desea viajar "
                        + "en Primera clase[S|N]");
                opcion = teclado.next();
                letra = opcion.charAt(0);
                if (letra == 's' || letra == 'S') {
                    AsientoPrimera();
                    condicion = 1;
                } else {
                    System.out.println("Vuelva cuando quiera.");
                    condicion = 1;
                }
            }
            if (!asientosEconomicos[i]) {
                asientosEconomicos[i] = true;
                System.out.println("Se le ha asignado el asiento nº "
                        + (i + k) + " de la clase Económica.");
                condicion = 1;
            } else if (asientosEconomicos[i]) {
                i++;
            }

        }
    }

    public boolean avionLleno() {
        final int k = 1;
        boolean lleno;
        if (asientosEconomicos[NUM_ASIENTOS_ECONOMICOS - k] && asientosPrimera[NUM_ASIENTOS_PRIMERA - k]) {
            lleno = true;
        } else {
            lleno = false;
        }
        return lleno;

}
}
