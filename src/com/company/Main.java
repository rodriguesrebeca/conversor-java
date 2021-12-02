package com.company;

public class Main {

    public static void main(String[] args) {
//        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
//        Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
//
//        F = (C * 1.8) + 32
//        K = C + 273.15
//        Re = C * 0.8
//        Ra = (C * 1.8) + 491
//
//        Considere a conversão de 18 ºC e a precisão de duas casas decimais

        final float CELSIUS = 18f;
        final double FAHRENHEIT = (CELSIUS * 1.8f) + 32;
        final double KELVIN = CELSIUS + 27.15f;
        final double REAUMUR = CELSIUS * 0.8f;
        final double RANKINE = (CELSIUS * 1.8f) + 491;

        System.out.printf("As temperaturas geradas foram: %n CELSIUS: %.2f %n FAHRENHEIT: %.2f %n KELVIN: %.2f " +
                "%n REAUMUR: %.2f %n RANKINE: %.2f %n", CELSIUS, FAHRENHEIT, KELVIN, REAUMUR, RANKINE);

        //pedir para o usuário inserir a temperatura em celsius.
    }
}
