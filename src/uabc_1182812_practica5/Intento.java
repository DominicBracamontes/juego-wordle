/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc_1182812_practica5;

import java.util.ArrayList;

/**
 *
 * @author domi1
 */
public class Intento {
    private int contadorIntentos;
    private ArrayList<String> intentosAnteriores;
    private PalabraAlAzar palabraAlAzar;
    private BuscadorDePalabras buscadorDePalabras;

    public Intento(PalabraAlAzar palabraAlAzar, BuscadorDePalabras buscadorDePalabras) {
        this.palabraAlAzar = palabraAlAzar;
        this.buscadorDePalabras = buscadorDePalabras;
        this.contadorIntentos = 0;
        this.intentosAnteriores = new ArrayList<>();
    }

    public boolean realizarIntento(String palabraIngresada) {
        this.intentosAnteriores.add(palabraIngresada);
        this.contadorIntentos++;

        if (!buscadorDePalabras.buscarPalabra(palabraIngresada)) {
            System.out.println("La palabra ingresada no existe en el diccionario.");
            return false;
        }

        if (palabraIngresada.length() != 5) {
            System.out.println("La palabra ingresada debe tener 5 letras.");
            return false;
        }

        boolean esIgual = contrastarPalabras(palabraIngresada, palabraAlAzar.obtenerPalabra());
        if (esIgual) {
            System.out.println("¡Felicidades! Has adivinado la palabra en " + contadorIntentos + " intentos.");
        } else {
            if (contadorIntentos < 6) {
                System.out.println("La palabra ingresada no es igual a la palabra buscada. Intenta de nuevo.");
            } else {
                System.out.println("Lo siento, has llegado al límite de intentos.");
            }
        }
        return esIgual;
    }

    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public ArrayList<String> getIntentosAnteriores() {
        return intentosAnteriores;
    }

    private boolean contrastarPalabras(String palabra1, String palabra2) {
        for (int i = 0; i < palabra1.length(); i++) {
            if (palabra1.charAt(i) != palabra2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}