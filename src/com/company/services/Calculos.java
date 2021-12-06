package com.company.services;

public class Calculos {
    public static float calculaFahrenheit(float celsius, float FATOR_CONVERSAO){
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

    public static float calculaRankine(float celsius, float FATOR_CONVERSAO){
        final float CONVERSAO_RANKINE = 491f;
        return (celsius * FATOR_CONVERSAO) + CONVERSAO_RANKINE;
    }
}
