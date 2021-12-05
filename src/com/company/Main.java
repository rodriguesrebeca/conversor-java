package com.company;

import com.company.services.Calculos;
import com.company.utils.Leitor;



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
//        Pedir para o usuário inserir uma temperatura em celsius.

        float celsius = Leitor.escanearCelsius();

        final float FATOR_CONVERSAO = 1.8f;

        float fahrenheit= Calculos.calculaFahrenheit(celsius, FATOR_CONVERSAO);
        float kelvin = Calculos.calculaKelvin(celsius);
        float reaumur = Calculos.calculaReaumur(celsius);
        float rankine = Calculos.calculaRankine(celsius, FATOR_CONVERSAO);

        System.out.printf("As temperaturas geradas foram: %n CELSIUS: %.2f %n FAHRENHEIT: %.2f %n KELVIN: %.2f " +
                "%n REAUMUR: %.2f %n RANKINE: %.2f %n", celsius, fahrenheit, kelvin, reaumur, rankine);

    }

}
