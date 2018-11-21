package ett;
import java.util.*;

import java.io.*;

public class ETT{

    public static void main(String[] args) {
        try {
            parser p = new parser(new Lexer(new BufferedReader(new InputStreamReader(System.in))));
            System.out.println("Bienvenido/a a la consola ETT, ingrese \"editar\" para comenzar, y luego \"termino\" para cerrar el programa:");
            p.parse();      
        } catch (Exception e) {
            /* do cleanup here -- possibly rethrow e */
            e.printStackTrace();
        }
    
        }
}