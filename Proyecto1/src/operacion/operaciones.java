/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author danie
 */
public class operaciones {
    public static String Suma(String izq, String der){
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);
        double resultado = val1 + val2;
        return String.valueOf(resultado);
    }
    public static String Resta(String izq, String der){
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);
        double resultado = val1 - val2;
        return String.valueOf(resultado);
    }
    public static String Multiplicar(String izq, String der){
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);
        double resultado = val1 * val2;
        return String.valueOf(resultado);
    }
    
    public static String Dividir(String izq, String der){
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);
        double resultado = val1 / val2;
        return String.valueOf(resultado);
    }
    
    public static String Modulo(String izq, String der){
        double val1 = Double.parseDouble(izq);
        double val2 = Double.parseDouble(der);
        double resultado = val1 % val2;
        return String.valueOf(resultado);
    }
    
       public static String Media(LinkedList<String> listaDatos) {
        Double suma = 0.0;
        for (String str : listaDatos) {
            Double numero = Double.parseDouble(str);
            suma += numero;
        }
        double resultado=suma / listaDatos.size();
        return String.valueOf(resultado);
    }
    
    public static String Mediana(LinkedList<String> listaDatos) {
        LinkedList<Double> listaNumeros = new LinkedList<>();
        for (String str : listaDatos) {
            Double numero = Double.parseDouble(str); // Convertir String a Double
            listaNumeros.add(numero);
        }
        Collections.sort(listaNumeros); // Ordenar la lista de Doubles

        int tamanio = listaNumeros.size();
        if (tamanio % 2 == 0) {
            return String.valueOf((listaNumeros.get(tamanio / 2 - 1) + listaNumeros.get(tamanio / 2)) / 2.0); // Mediana de elementos pares
        } else {
            return String.valueOf(listaNumeros.get(tamanio / 2)); // Mediana de elementos impares
        }
        
    }
    
    public static String Moda(LinkedList<String> listaDeStrings) {
        Map<Double, Integer> frecuencia = new HashMap<>();
        for (String str : listaDeStrings) {
            Double numero = Double.parseDouble(str);
            if (frecuencia.containsKey(numero)) {
                frecuencia.put(numero, frecuencia.get(numero) + 1);
            } else {
                frecuencia.put(numero, 1);
            }
        }
        Double moda = null;
        int maxFrecuencia = 0;
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        return String.valueOf(moda);
    } 

    public static String Varianza(LinkedList<String> listaDeStrings) {
        int n = listaDeStrings.size();
        double suma = 0.0;
        double media = 0.0;
        // Calcular la media
        for (String str : listaDeStrings) {
            Double numero = Double.parseDouble(str);
            suma += numero;
        }
        media = suma / n;

        // Calcular la suma de los cuadrados de las diferencias
        double sumaCuadradosDiferencias = 0.0;
        for (String str : listaDeStrings) {
            Double numero = Double.parseDouble(str);
            sumaCuadradosDiferencias += Math.pow(numero - media, 2);
        }

        // Calcular la varianza
        Double varianza = sumaCuadradosDiferencias / n;
        return String.valueOf(varianza);
    }
    
    public static String Menor(LinkedList<String> listaDeStrings){
            
        Double numeroMasPequenio = Double.MAX_VALUE; // Inicializar con un valor muy grande

        for (String str : listaDeStrings) {
            Double numero = Double.parseDouble(str);
            if (numero < numeroMasPequenio) {
                numeroMasPequenio = numero;
            }
        }

        return String.valueOf(numeroMasPequenio);
    }
    
    
    public static String Mayor(LinkedList<String> listaDeStrings) {
        Double numeroMasGrande = Double.MIN_VALUE; // Inicializar con un valor muy pequeño

        for (String str : listaDeStrings) {
            Double numero = Double.parseDouble(str);
            if (numero > numeroMasGrande) {
                numeroMasGrande = numero;
            }
        }

        return String.valueOf(numeroMasGrande);
    }
     
}
