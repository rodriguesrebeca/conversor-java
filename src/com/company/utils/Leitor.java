package com.company.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner scanCelsius;

    public static float escanearCelsius(){
        scanCelsius = new Scanner(System.in);
        Impressora.inserirTemperaturaCelsius();
        float celsius = scanCelsius.nextFloat();
        return celsius;
    }
}
