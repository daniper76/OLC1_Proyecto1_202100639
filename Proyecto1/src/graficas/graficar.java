package graficas;

import java.util.LinkedList;
import java.util.Objects;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class graficar {
    public static String titulobarras ="";
    public static String tituloxbarras = "";
    public static String tituloybarras = "";
    public static LinkedList<String> ejeybarras = new LinkedList<>();
    public static LinkedList<String> ejexbarras = new LinkedList<>();
    public static String tituloPie = "";
    public static LinkedList<String> valoresPie = new LinkedList<>();
    public static LinkedList<String> labelPie = new LinkedList<>();
    public static String titulolineal ="";
    public static String tituloxlineal = "";
    public static String tituloylineal = "";
    public static LinkedList<String> ejeylineal = new LinkedList<>();
    public static LinkedList<String> ejexlineal = new LinkedList<>();
    public static LinkedList<Double> valoresHistograma = new LinkedList<>();
    public static LinkedList<Double> frecuenciaHistograma = new LinkedList<>();
    public static LinkedList<Double> frecuenciaAcumulada = new LinkedList<>();
    public static LinkedList<Integer> frecuenciaRelativa = new LinkedList<>();
    public static String tituloHistograma = "";
    public static String tituloHistogramaX = " ";
    public static String tituloHistogramaY= " ";
    public static String cadenaAnalizar="";
    public static String cadenaConsola="";
    
    
    public static void barras(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<String> ejey,
            LinkedList<String> ejex
    )
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < ejey.size() && i < ejex.size(); i++) {
            Double valorEjey = Double.parseDouble(ejey.get(i));
            String valorEjex = String.valueOf(ejex.get(i));
            dataset.addValue(valorEjey, "Valor", valorEjex);
        }
        JFreeChart grafica = 
            ChartFactory.createBarChart(
                Titulo, 
                TituloX, TituloY, 
                dataset, 
                PlotOrientation.VERTICAL,
                true, true, true);
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void histograma(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<Double> ejey,
            LinkedList<Double> ejex
    )
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < ejey.size() && i < ejex.size(); i++) {
            String valorEjex = String.valueOf(ejex.get(i));
            dataset.addValue(ejey.get(i), "Valor", valorEjex);
        }
        JFreeChart grafica = 
            ChartFactory.createBarChart(
                Titulo, 
                TituloX, TituloY, 
                dataset, 
                PlotOrientation.VERTICAL,
                true, true, true);
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void Lineal(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<String> ejey,
            LinkedList<String> ejex
    )
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < ejey.size() && i < ejex.size(); i++) {
            Double valorEjey = Double.parseDouble(ejey.get(i));
            String valorEjex = String.valueOf(ejex.get(i));
            dataset.addValue(valorEjey, "Valor", valorEjex);
        }
        
        JFreeChart grafica = 
            ChartFactory.createLineChart(
                    Titulo, 
                    TituloX,
                    TituloY, 
                    dataset);
        
        
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void Pie(
            String Titulo, 
            LinkedList<String> valores,
            LinkedList<String> labels
    )
    {

        DefaultPieDataset dataset = new DefaultPieDataset( );
      
        for(int i = 0; i < valores.size() && i < labels.size(); i++) {
            Double valor = Double.parseDouble(valores.get(i));
            String label = String.valueOf(labels.get(i));
            dataset.setValue(label,valor);
        }
  
        JFreeChart grafica = 
            ChartFactory.createPieChart(Titulo, dataset);
        
        
        
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void AgregarTituloBarras(String valor){
        titulobarras=valor;
    }
    public static void AgregarTituloXBarras(String valor){
        tituloxbarras=valor;
    }
    public static void AgregarTituloYBarras(String valor){
        tituloybarras=valor;
    }
    public static void AgregarEjeYBarras(LinkedList<String> arreglo){
        ejeybarras=(LinkedList<String>) arreglo;
    }
    
    public static void AgregarEjeXBarras(LinkedList<String> arreglo){
        ejexbarras=(LinkedList<String>) arreglo;
    }
        
    public static void AgregarTituloPie(String valor){
        tituloPie=valor;
    }
    public static void AgregarValoresPie(LinkedList<String> arreglo){
        valoresPie=(LinkedList<String>) arreglo;
    }
    
    public static void AgregarLabelsPie(LinkedList<String> arreglo){
        labelPie=(LinkedList<String>) arreglo;
    }
    
    public static void AgregarTituloLineal(String valor){
        titulolineal=valor;
    }
    public static void AgregarTituloXLineal(String valor){
        tituloxlineal=valor;
    }
    public static void AgregarTituloYLineal(String valor){
        tituloylineal=valor;
    }
    public static void AgregarEjeYLineal(LinkedList<String> arreglo){
        ejeylineal=(LinkedList<String>) arreglo;
    }
    
    public static void AgregarEjeXLineal(LinkedList<String> arreglo){
        ejexlineal=(LinkedList<String>) arreglo;
    }
    
    public static void AgregarValoresHistograma(LinkedList<Double> arreglo){
        valoresHistograma=(LinkedList<Double>) arreglo;
    }
    public static void AgregarFrecuenciaHistograma(LinkedList<Double> arreglo){
        frecuenciaHistograma=(LinkedList<Double>) arreglo;
    }
    
    public static void AgregarFrecuenciaAcumuladaHistograma(LinkedList<Double> arreglo){
        frecuenciaAcumulada=(LinkedList<Double>) arreglo;
    }
    
    public static void AgregarFrecuenciaRelativaHistograma(LinkedList<Integer> arreglo){
        frecuenciaRelativa=(LinkedList<Integer>) arreglo;
    }
    
    public static LinkedList<Double> crearValores(LinkedList<String> arreglo) {
        LinkedList<Double> lista = new LinkedList<>();
        LinkedList<Double> lista_valores = new LinkedList<>();
        for(int i = 0; i < arreglo.size(); i++) {
            Double valor = Double.parseDouble(arreglo.get(i));
            lista.add(valor);
        }
        for(int i = 0; i < lista.size(); i++) {
            if(lista_valores.isEmpty()){
                lista_valores.add(lista.get(i));
            }
            else{
                if(!(lista_valores.contains(lista.get(i)))){
                    lista_valores.add(lista.get(i));
                }
            }
        }
        return lista_valores;
    }
    
    public static LinkedList<Double> frecuencia(LinkedList<Double> valores,LinkedList<String> arreglo){
        LinkedList<Double> lista = new LinkedList<>();
        LinkedList<Double> lista_valores = new LinkedList<>();
        for(int i = 0; i < arreglo.size(); i++) {
            Double valor = Double.parseDouble(arreglo.get(i));
            lista.add(valor);
        }
        for(int i = 0; i < valores.size(); i++) {
            double suma=0;
            for(int j = 0; j < lista.size(); j++) {
                if(Objects.equals(valores.get(i), lista.get(j))){
                    suma=suma+1;
                }
            }
            lista_valores.add(suma); 
        }
      return lista_valores;
    }
    
    public static LinkedList<Double> frecuenciaAcumuladaHistograma(LinkedList<Double> valores){
        LinkedList<Double> lista = new LinkedList<>();
        double suma=0;
        for(int i = 0; i < valores.size(); i++) {
            suma=suma+valores.get(i);
            lista.add(suma);
        }
      return lista;
    }
    
    public static LinkedList<Integer> frecuenciaRelativaHistograma(LinkedList<Double> valores,LinkedList<String> arreglo){
        LinkedList<Integer> lista = new LinkedList<>();
        int suma=0;
        for(int i = 0; i < valores.size(); i++) {
            suma=(int)Math.round((valores.get(i)/arreglo.size())*100);
            lista.add(suma);
        }
      return lista;
    }
    public static void AgregarTituloHistograma(String valor){
        tituloHistograma=valor;
    }
    
    public static void CrearAnalizadores(){
       
       proyecto1.Proyecto1.analizadores("src/compi/", "Lexer.jflex", "Parser.cup");
    }
    
    public static void reporteHistograma(LinkedList<Double> lista_valores,LinkedList<Double> lista_frecuencia,LinkedList<Double> lista_frecuencia_acumulada, LinkedList<Integer> lista_frecuencia_relativa){
        String texto="Analisis de Arreglo\n";
        texto=texto+"Valor    Fb      Fa      Fr\n";
         for(int i = 0; i < lista_valores.size(); i++) {
            texto=texto+String.valueOf(lista_valores.get(i))+"     ";
            texto=texto+String.valueOf(lista_frecuencia.get(i))+"     ";
            texto=texto+String.valueOf(lista_frecuencia_acumulada.get(i))+"     ";
            texto=texto+String.valueOf(lista_frecuencia_relativa.get(i))+"     ";
            texto=texto+"\n";
             System.out.println("se ejecuta reporte histograma");
        }
        texto=texto+"Totales"+"     "+String.valueOf(lista_valores.size())+"     "+String.valueOf(lista_valores.size());
        crearCadenaConsola(texto);
    }
    
    public static void crearCadenaConsola(String cadena){
        cadenaConsola=cadenaConsola+cadena+"\n";
    }
    public static void crearCadenaLista(LinkedList<String> lista){
        lista.forEach((element) -> {
            System.out.println(element);
            System.out.println("estoy imprimiendo");
            crearCadenaConsola(element);
        });
    }
    
}
