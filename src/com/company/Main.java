package com.company;

import com.company.utils.Impressora;
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

        Impressora.impressoraDeResultados(Leitor.escanearCelsius());
    }

}
