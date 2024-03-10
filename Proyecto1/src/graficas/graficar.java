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
    public static String tituloPie = "";
    public static LinkedList<String> valoresPie = new LinkedList<>();
    public static LinkedList<String> labelPie = new LinkedList<>();
    
    
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
    
    public static void linea(
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
    
}
