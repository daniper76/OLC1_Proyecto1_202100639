/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacion;

import java.util.LinkedList;


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
        double[] datos = new double[listaDatos.size()];
        double total=0;
        String media="";
        for (int i = 0; i < listaDatos.size(); i++) {
            datos[i] = Double.parseDouble(listaDatos.get(i));
        }
        for (int j=0; j<listaDatos.size();j++){
            total=total+datos[j];
        }
        media=String.valueOf(total/listaDatos.size());
        return media;
    }
    
    public static String Mediana(LinkedList<String> listaDatos) {
        double[] datos = new double[listaDatos.size()];
        for (int i = 0; i < listaDatos.size(); i++) {
            datos[i] = Double.parseDouble(listaDatos.get(i));
        }
            double temp;
            for(int i=1; i<listaDatos.size();i++){
                for(int j=0;j<listaDatos.size()-i;j++){
                    if(datos[j]>datos[j+1]){
                        temp=datos[j];
                        datos[j]=datos[j+1];
                        datos[j+1]=temp;
                    }
                }
            
            }
            double desicion_mediana=listaDatos.size()%2;
            if (desicion_mediana==0){
                int valor_medio=(listaDatos.size())/2;
                double mediana=((datos[valor_medio-1]+datos[valor_medio])/2);
                return String.valueOf(mediana);
            
            }
            else{
                int posicion_media=listaDatos.size()/2;
                double mediana=datos[posicion_media];
                return String.valueOf(mediana);
            }
        
    }
    
    public static String Moda(LinkedList<String> listaDatos) {
        double[] datos = new double[listaDatos.size()];
        for (int i = 0; i < listaDatos.size(); i++) {
            datos[i] = Double.parseDouble(listaDatos.get(i));
        }
        double temporal;
        double moda=0;
        int contador_dato=0;
            
            for (int j=0; j<listaDatos.size(); j++){
                temporal=datos[j];
                int contador=0;
                for(int k=0; k<listaDatos.size();k++){
                    if (temporal==datos[k]){
                    contador=contador+1;
                    }
                }
                if (contador>contador_dato){
                    moda=temporal;
                    contador_dato=contador;
                }
            }
           return String.valueOf(moda);
        
    } 

    public static String Varianza(LinkedList<String> lista_datos) {
        double[] datos = new double[lista_datos.size()];
        double total=0;
        for (int i = 0; i < lista_datos.size(); i++) {
            datos[i] = Double.parseDouble(lista_datos.get(i));
        }
        for (int j=0; j<lista_datos.size();j++){
            total=total+datos[j];
        }
        double media=total/lista_datos.size();
        
        double serie=0;
        for(int j=0; j<lista_datos.size();j++){
            double temporal=datos[j]-media;
            double suma=temporal*temporal;
            serie=serie+suma; 
            }
        double varianza=serie/lista_datos.size();
        return String.valueOf(varianza);
        
        
    }
    
    public static String Menor(LinkedList<String> listaDatos){
        double[] datos = new double[listaDatos.size()];
        for (int i = 0; i < listaDatos.size(); i++) {
            datos[i] = Double.parseDouble(listaDatos.get(i));
        }
        double menor=datos[0];
        for (int j=0;j<listaDatos.size();j++){
            if (menor>datos[j]){
                menor=datos[j];
            }
        }
        return String.valueOf(menor);
    }
    
    
    public static String Mayor(LinkedList<String> listaDatos) {
        double[] datos = new double[listaDatos.size()];
        for (int i = 0; i < listaDatos.size(); i++) {
            datos[i] = Double.parseDouble(listaDatos.get(i));
        }
        double mayor=datos[0];
        for (int j=0;j<listaDatos.size();j++){
            if (mayor<datos[j]){
                mayor=datos[j];
            }
        }
        return String.valueOf(mayor);
     
}
}