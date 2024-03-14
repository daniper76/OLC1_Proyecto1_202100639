// ------------  Paquete e importaciones ------------
package compi; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 

// ------> Expresiones Regulares 


entero = [0-9]+|[0-9]+[.][0-9]+
cadena = [\"][^\n\"]*[\"]
id = [a-zA-Z][a-zA-Z0-9_]*
comentario = ["!"][^\n]*[\n]
multicomentario = ["<"]["!"][^]*["!"][">"]



%%
// ------------  Reglas Lexicas -------------------
"program"   {return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());}
"end program"  {return new Symbol(sym.ENDPROGRAM, yycolumn, yyline, yytext());}
"arr"        {return new Symbol(sym.ARR, yycolumn, yyline, yytext());}
"@"          {return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}
"double"   {return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext());}
"char[]"     {return new Symbol(sym.CHAR, yycolumn, yyline, yytext());}
"sum"       {return new Symbol(sym.SUMA, yycolumn, yyline, yytext());}
"res"       {return new Symbol(sym.RESTA, yycolumn, yyline, yytext());}
"mul"       {return new Symbol(sym.MULTIPLICAR, yycolumn, yyline, yytext());}
"div"       {return new Symbol(sym.DIVIDIR, yycolumn, yyline, yytext());}
"mod"       {return new Symbol(sym.MODULO, yycolumn, yyline, yytext());}
"media"     {return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());}
"graphbar"  {return new Symbol(sym.BARRAS, yycolumn, yyline, yytext());}
"titulo"    {return new Symbol(sym.TITULO, yycolumn, yyline, yytext());}
"ejex"      {return new Symbol(sym.EJEX, yycolumn, yyline, yytext());}
"graphPie"  {return new Symbol(sym.PIE, yycolumn, yyline, yytext());}
"label"     {return new Symbol(sym.LABEL, yycolumn, yyline, yytext());}
"values"    {return new Symbol(sym.VALUES, yycolumn, yyline, yytext());}
"grapPie"   {return new Symbol(sym.GRAPPIE, yycolumn, yyline, yytext());}
"graphLine" {return new Symbol(sym.LINEAL, yycolumn, yyline, yytext());}
"grapLine"  {return new Symbol(sym.GRAPLINE, yycolumn, yyline, yytext());}
"ejey"      {return new Symbol(sym.EJEY, yycolumn, yyline, yytext());}
"titulox"   {return new Symbol(sym.TITULOX, yycolumn, yyline, yytext());}
"tituloy"   {return new Symbol(sym.TITULOY, yycolumn, yyline, yytext());}
"exec"      {return new Symbol(sym.EXEC, yycolumn, yyline, yytext());}
"grapbar"   {return new Symbol(sym.GRAPBAR, yycolumn, yyline, yytext());}
"mediana"   {return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());}
"histogram" {return new Symbol(sym.HISTOGRAMA, yycolumn, yyline, yytext());}
"moda"      {return new Symbol(sym.MODA, yycolumn, yyline, yytext());}
"varianza"  {return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());}
"max"       {return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}
"min"       {return new Symbol(sym.MENOR, yycolumn, yyline, yytext());}
"console"   {return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());}
"print"     {return new Symbol(sym.PRINT, yycolumn, yyline, yytext());}
"column"    {return new Symbol(sym.COLUMNA, yycolumn, yyline, yytext());}
"var"       {return new Symbol(sym.VAR, yycolumn, yyline, yytext());}
":"         {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
"<"         {return new Symbol(sym.FLECHA, yycolumn, yyline, yytext());}
">"         {return new Symbol(sym.FLECHADERECHA, yycolumn, yyline, yytext());}
"-"         {return new Symbol(sym.GUION, yycolumn, yyline, yytext());}
"end"       {return new Symbol(sym.END, yycolumn, yyline, yytext());}
"!"         {return new Symbol(sym.EXCL, yycolumn, yyline, yytext());}
"("         {return new Symbol(sym.PARIZQ, yycolumn, yyline, yytext());}
")"         {return new Symbol(sym.PARDER, yycolumn, yyline, yytext());}
"["         {return new Symbol(sym.CORA, yycolumn, yyline, yytext());}
"]"         {return new Symbol(sym.CORC, yycolumn, yyline, yytext());}
";"         {return new Symbol(sym.PYC, yycolumn, yyline, yytext());}
","         {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
"="         {return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
{entero}    {Tokens.tokens.GuardarTokes(String.valueOf(yytext()),"double",String.valueOf(yycolumn),String.valueOf(yyline)); return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{cadena}    {Tokens.tokens.GuardarTokes(String.valueOf(yytext()),"string",String.valueOf(yycolumn),String.valueOf(yyline)); return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}
{id}        {Tokens.tokens.GuardarTokes(String.valueOf(yytext()),"id",String.valueOf(yycolumn),String.valueOf(yyline)); return new Symbol(sym.ID, yycolumn, yyline, yytext());}
{comentario} {}
{multicomentario} {}


//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ Errores.Error.GuardarError(String.valueOf(yytext()),"Error Léxico: Carácter no reconocido",String.valueOf(yycolumn),String.valueOf(yyline)); System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


