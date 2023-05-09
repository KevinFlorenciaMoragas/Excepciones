package org.example.Ejemplo;

import org.example.Ejemplo.Excepciones.AccesoDatosEx;

public class Division {
    int numerador;
    int denominador;

    public Division(int numerador, int denominador) throws AccesoDatosEx {
        if(denominador == 0){
            throw new AccesoDatosEx("No se puede dividir entre cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Division() {
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public void visualizarOperacion() {
        System.out.println("El resultado de la division es: " + numerador / denominador);
    }
}
