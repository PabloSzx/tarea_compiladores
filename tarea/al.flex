import java_cup.runtime.*;

%%

%class Lexer
%cup
%line
%column


%{   
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}


ID = [a-zA-Z][a-zA-Z_0-9]*

DIGITO = [0-9]+

LineTerminator = \r|\n|\r\n

WhiteSpace     = {LineTerminator} | [ \t\f]

EDITAR = editar|EDITAR
TERMINO = termino|TERMINO
C = rojo|verde|amarillo|azul|blanco
POS = pos
IZQ = izq
DER = der
ARR = arr
ABA = aba
DAVALOR = davalor
COLOR = color



B = {C}|{ID}
N = {ID}|{DIGITO}|{C}
D = {ID}|{DIGITO}

I = pos\({N},{N}\)|izq\({D}\)|der\(D\)|arr\({D}\)|davalor {ID}={N}|color\(B\)

%%

<YYINITIAL> {
{EDITAR}                        { return symbol(sym.EDITAR); }
{POS}                           { return symbol(sym.POS); }
{IZQ}                           { return symbol(sym.IZQ); }
{DER}                           { return symbol(sym.DER); }
{ARR}                           { return symbol(sym.ARR); }
{ABA}                           { return symbol(sym.ABA); }
{DAVALOR}                       { return symbol(sym.DAVALOR); }
{COLOR}                         { return symbol(sym.COLOR); }
{C}                             { return symbol(sym.C); }
{TERMINO}                       { return symbol(sym.TERMINO); }
"("                             { return symbol(sym.LPAREN); }
")"                             { return symbol(sym.RPAREN); }
","                             { return symbol(sym.COMMA); }
"="                             { return symbol(sym.EQUAL); }

{DIGITO}                        { return symbol(sym.DIGITO, new Integer(yytext())); }
{ID}                            { return symbol(sym.ID, yytext()); }

{WhiteSpace}                    {  /* IGNORE */ }
}

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }