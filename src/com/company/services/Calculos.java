package com.company.services;

public class Calculos {


    public static float calculaFahrenheit(float celsius){
        final float FATOR_CONVERSAO = 1.8f;
        final float CONVERSAO_FAHRENHEIT = 32f;
        return (celsius * FATOR_CONVERSAO) + CONVERSAO_FAHRENHEIT;
    }

    public static float calculaKelvin(float celsius){
        final float CONVERSAO_KELVIN = 273.15f;
        return celsius + CONVERSAO_KELVIN;
    }

    public static float calculaReaumur(float celsius){
        final float CONVERSAO_REAUMUR = 0.8f;
        return celsius * CONVERSAO_REAUMUR;
    }

    public static float calculaRankine(float celsius){
        final float FATOR_CONVERSAO = 1.8f;
        final float CONVERSAO_RANKINE = 491f;
        return (celsius * FATOR_CONVERSAO) + CONVERSAO_RANKINE;
    }
}
