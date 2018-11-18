package ett;
import java_cup.runtime.*;
import java.util.*;
%%

%class Lexer
%caseless
%cup
%line
%column

%init{

this.i = 0;
this.tabla = new Hashtable<String, Integer>();

%init}

%{  
    
    /* 
    Declaramos una variable auxiliar "i" que servira de contador 
    para la función de asociación de cada ID a un identificador numérico.
    */
    private Integer i;

    /*
    Declaramos la tabla Hash que almacenara la asociación de cada ID 
    con su identificador numérico.
    */
    private Hashtable<String, Integer> tabla;
    

    /*
    Definimos un par de funciones necesaria para el uso de la 
    clase "Symbol" que viene desde JFlex.
    */
    
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    
    /*
    Definimos la función que se ocupara para la creación y
    obtención de los valores numericos asociados a cada ID
    */
    
    private int get() {
        int aux;
        if (this.tabla.containsKey(this.yytext())) {
            aux = this.tabla.get(this.yytext());
        } else {
            this.tabla.put(this.yytext(), ++this.i);
            aux = this.i;
        }
        return aux;
    }
%}


/* 
Determinación del formato de los token que formarán parte 
de la gramática a partir del analizador léxico   
*/

ID = [a-zA-Z][a-zA-Z_0-9]*

DIGITO = [0-9]+

LineTerminator = \r|\n|\r\n

WhiteSpace     = {LineTerminator} | [ \t\f]

EDITAR = editar
TERMINO = termino
C = rojo|verde|amarillo|azul|blanco
POS = pos
IZQ = izq
DER = der
ARR = arr
ABA = aba
DAVALOR = davalor
COLOR = color
%%



/*  
Retornamos los valores simbolicos correspondientes a los terminales
de la grámatica a usar, cuando se ingresen los tokens correspondientes
para el analizador sintáctico    
*/

<YYINITIAL> {
{EDITAR}                        { return symbol(sym.EDITAR); }
{POS}                           { return symbol(sym.POS); }
{IZQ}                           { return symbol(sym.IZQ); }
{DER}                           { return symbol(sym.DER); }
{ARR}                           { return symbol(sym.ARR); }
{ABA}                           { return symbol(sym.ABA); }
{DAVALOR}                       { return symbol(sym.DAVALOR); }
{COLOR}                         { return symbol(sym.COLOR); }
{TERMINO}                       { return symbol(sym.TERMINO); }
"("                             { return symbol(sym.LPAREN); }
")"                             { return symbol(sym.RPAREN); }
","                             { return symbol(sym.COMMA); }
"="                             { return symbol(sym.EQUAL); }

{C}                             { return symbol(sym.C, yytext().toLowerCase()); }
{DIGITO}                        { return symbol(sym.DIGITO, new Integer(yytext())); }
{ID}                            { return symbol(sym.ID, this.get()); }

{WhiteSpace}                    {  /* IGNORAR */ }
}


/*  Manejador de errores para simbolos erroneos   */

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
