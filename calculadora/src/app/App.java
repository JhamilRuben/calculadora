package app;

import java.util.Scanner;

public class App {
    
    public static void main(final String[] args) {
        calculos calcu=new calculos();
        float ValorUno;
        float ValorDos;
        float respuesta;
        final Scanner tec = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("primer valor: ");
        ValorUno=tec.nextFloat();
        System.out.println("segundo valor: ");
        ValorDos=tec.nextFloat();
        
        respuesta=calcu.suma(ValorUno, ValorDos);
        System.out.println("la suma es: "+ respuesta);
        respuesta=calcu.resta(ValorUno, ValorDos);
        System.out.println("la resta es: "+ respuesta);
        respuesta=calcu.multiplicacion(ValorUno, ValorDos);
        System.out.println("la multiplicación es: "+ respuesta);
        respuesta=calcu.division(ValorUno, ValorDos);
        System.out.println("la división es: "+ respuesta);
        

        tec.close();
    }
}