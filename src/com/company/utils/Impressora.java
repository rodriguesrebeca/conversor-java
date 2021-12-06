package com.company.utils;

import com.company.services.Calculos;

public class Impressora {

    final static String MSG_TEMPERATURA_CELSIUS = "Insira uma temperatura em CELSIUS:";
    final static String RESULTADOS_TEMPERATURAS = "As temperaturas geradas foram: %n CELSIUS: %.2f %n FAHRENHEIT: %.2f " +
            "%n KELVIN: %.2f %n REAUMUR: %.2f %n RANKINE: %.2f %n";

    public static void inserirTemperaturaCelsius(){
        System.out.println(MSG_TEMPERATURA_CELSIUS);
    }

    public static void impressoraDeResultados(float celsius){
        System.out.printf(RESULTADOS_TEMPERATURAS, celsius, Calculos.calculaFahrenheit(celsius),
                Calculos.calculaKelvin(celsius), Calculos.calculaReaumur(celsius), Calculos.calculaRankine(celsius));
    }
}
