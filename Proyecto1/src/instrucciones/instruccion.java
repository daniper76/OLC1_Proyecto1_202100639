/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrucciones;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class instruccion {
    public static HashMap<String, String> tablaSimb = new HashMap<>();
    public static HashMap<String, LinkedList> tablaArreglos= new HashMap<>();
    public static void GuardarVariable(String clave, String valor){
        tablaSimb.put(clave, valor);
    }
    public static String ObtenerVariable(String clave){
        return tablaSimb.get(clave);
    }
    
    public static void GuardarArreglo(String clave, LinkedList<String> arreglo){
        tablaArreglos.put(clave, arreglo);
    }
    public static LinkedList ObtenerArreglo(String clave){
        return tablaArreglos.get(clave);
    }
    public static void mostrarLista(LinkedList<String> lista){
        lista.forEach((element) -> {
            System.out.println(element);
        });
    }
}
