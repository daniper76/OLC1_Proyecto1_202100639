/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.io.StringReader;

/**
 *
 * @author danie
 */
public class Proyecto1 {

    public static void main(String[] args) {
        //analizadores("src/compi/", "Lexer.jflex", "Parser.cup");
        String entrada = """
                     PROGRAM
                        PRintln!(Media([5, 2, SUM(3,7), 4, 6]));
                        var:double::promedio<-Media([5, 2, SUM(3,7), 4, 6])end;
                        var:double::numero<-SUM(2222,3)end;
                        var:double::num11<-Mediana([5, 2, SUM(3,7), 4, 6])end;
                         var:double::num12<-Moda([5, 2, SUM(3,7), 2, 6])end;
                         var:double::num13<-Varianza([5, 2, SUM(3,7), 4, 6])end;
                         var:double::num14<-Media([5, 2, SUM(3,7), 4, 6])end;
                         var:double::num15<-Max([5, 2, SUM(3,7), 4, 6])end;
                         var:double::num16<-Min([5, 2, SUM(3,7), 4, 6])end;
                        var:char[]::gato<-"perrito"end;
                         var:double::nota<-61end;
                         var:char[]::gatillo<-"per"end;
                         var:double::num1<-nota end;
                         var:char[]::gato<-"per"end;
                         var:char[]::perro<-gato end;
                         arr:double::@darray <- [sum(34,5), res(23,4), mul(2,3),div(3,3), mod(7,2)] end; 
                         arr:char[]::@darraylist <- ["f","f","f","d","e"] end;
                         console::print = "hola", numero, 15, "adios",Media([5, 2, SUM(3,7), 4, 6]) end;
                         console::column = gato -> @darray end;
                         PRintln!(num14);
                         PRintln!(num11);
                         PRintln!(num12);
                         PRintln!(num13);
                         PRintln!(num15);
                         PRintln!(num16);
                         PRintln!(perro);
                         Println!(@darray);
                         Println!(@darraylist);
                         Println!(num16);
                         graphBar(
                         titulo::char[] = "Estudiantes" end;
                         ejeX::char[] = ["1 Parcial", "2 parcial", "Final"] end;
                         ejeY::double = [50, 30, 70] end;
                         tituloX::char[] = "Actividades" end;
                         tituloY::char[] = "Notas" end;
                         EXEC grapBar end;
                         ) end;
                     ENDPROGRAM
                    """;
        
        analizar(entrada);
        
        
    }
    
    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
        // Realizar Analisis
    public static void analizar (String entrada){
        try {
            compi.Lexer lexer = new compi.Lexer(new StringReader(entrada)); 
            compi.Parser parser = new compi.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    } 
}
