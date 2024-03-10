package graficas;

import java.util.LinkedList;
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
    
    public static void barras(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<String> ejey,
            LinkedList<String> ejex
    )
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < ejey.size() && i < ejex.size(); i++) {
            Double valorEjey = Double.parseDouble(ejey.get(i));
            String valorEjex = String.valueOf(ejex.get(i));
            dataset.addValue(valorEjey, "Valor", valorEjex);
        }
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createBarChart(
                Titulo, //TITULO
                TituloX, TituloY, 
                dataset, 
                PlotOrientation.VERTICAL,
                true, true, true);
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void linea(
            String Titulo, 
            String TituloX,
            String TituloY,
            LinkedList<String> ejey,
            LinkedList<String> ejex
    )
    {
        //Ingreso de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < ejey.size() && i < ejex.size(); i++) {
            Double valorEjey = Double.parseDouble(ejey.get(i));
            String valorEjex = String.valueOf(ejex.get(i));
            dataset.addValue(valorEjey, "Valor", valorEjex);
        }
        
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createLineChart(
                    Titulo, 
                    TituloX,
                    TituloY, 
                    dataset);
        
        
        // Mostrar
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public static void Pie(
            String Titulo, 
            String TituloX,
            String TituloY,
            double valores[],
            String ejex []
    )
    {
        //Ingreso de datos
        DefaultPieDataset dataset = new DefaultPieDataset( );
      
        for(int i = 0; i < 5; i++){
            dataset.setValue(ejex[i], valores[i]);
        }
        // Creación de gráfica
        JFreeChart grafica = 
            ChartFactory.createPieChart(Titulo, dataset);
        
        
        // Mostrar
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
        
    
    
}
