
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package ett;

import java_cup.runtime.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\010\002\000\002\004\006\000\002\002" +
    "\004\000\002\003\004\000\002\003\003\000\002\011\002" +
    "\000\002\002\011\000\002\012\002\000\002\002\007\000" +
    "\002\013\002\000\002\002\007\000\002\014\002\000\002" +
    "\002\007\000\002\015\002\000\002\002\007\000\002\002" +
    "\006\000\002\016\002\000\002\002\007\000\002\007\003" +
    "\000\002\007\003\000\002\005\003\000\002\005\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\013\001\001\002\000\004\013\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\uffff\001\002" +
    "\000\020\004\015\005\011\006\014\007\010\010\016\011" +
    "\020\012\012\001\002\000\004\015\063\001\002\000\004" +
    "\015\057\001\002\000\004\015\051\001\002\000\022\004" +
    "\015\005\011\006\014\007\010\010\016\011\020\012\012" +
    "\014\047\001\002\000\004\015\043\001\002\000\004\015" +
    "\035\001\002\000\004\015\027\001\002\000\022\004\ufffd" +
    "\005\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\014" +
    "\ufffd\001\002\000\004\022\021\001\002\000\004\020\022" +
    "\001\002\000\010\021\026\022\023\023\024\001\002\000" +
    "\026\004\uffeb\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011\uffeb" +
    "\012\uffeb\014\uffeb\016\uffeb\017\uffeb\001\002\000\026\004" +
    "\uffea\005\uffea\006\uffea\007\uffea\010\uffea\011\uffea\012\uffea" +
    "\014\uffea\016\uffea\017\uffea\001\002\000\022\004\ufff2\005" +
    "\ufff2\006\ufff2\007\ufff2\010\ufff2\011\ufff2\012\ufff2\014\ufff2" +
    "\001\002\000\026\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010" +
    "\uffe9\011\uffe9\012\uffe9\014\uffe9\016\uffe9\017\uffe9\001\002" +
    "\000\006\022\030\023\032\001\002\000\004\016\uffef\001" +
    "\002\000\004\016\ufff6\001\002\000\004\016\uffee\001\002" +
    "\000\004\016\034\001\002\000\022\004\ufff5\005\ufff5\006" +
    "\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\014\ufff5\001\002" +
    "\000\010\021\026\022\023\023\024\001\002\000\004\017" +
    "\037\001\002\000\010\021\026\022\023\023\024\001\002" +
    "\000\004\016\ufffc\001\002\000\004\016\042\001\002\000" +
    "\022\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb" +
    "\012\ufffb\014\ufffb\001\002\000\006\022\030\023\032\001" +
    "\002\000\004\016\ufff8\001\002\000\004\016\046\001\002" +
    "\000\022\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011" +
    "\ufff7\012\ufff7\014\ufff7\001\002\000\004\002\000\001\002" +
    "\000\022\004\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011" +
    "\ufffe\012\ufffe\014\ufffe\001\002\000\006\021\053\022\052" +
    "\001\002\000\004\016\uffec\001\002\000\004\016\uffed\001" +
    "\002\000\004\016\ufff1\001\002\000\004\016\056\001\002" +
    "\000\022\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011" +
    "\ufff0\012\ufff0\014\ufff0\001\002\000\006\022\030\023\032" +
    "\001\002\000\004\016\ufffa\001\002\000\004\016\062\001" +
    "\002\000\022\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9" +
    "\011\ufff9\012\ufff9\014\ufff9\001\002\000\006\022\030\023" +
    "\032\001\002\000\004\016\ufff4\001\002\000\004\016\066" +
    "\001\002\000\022\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010" +
    "\ufff3\011\ufff3\012\ufff3\014\ufff3\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\006\004\004\010\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\002\016" +
    "\003\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\002\047\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\006\024\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\030\001\001\000\002\001\001" +
    "\000\004\014\032\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\035\001\001\000\002" +
    "\001\001\000\004\006\037\001\001\000\004\011\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\043" +
    "\001\001\000\004\013\044\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\053\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\016\054\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\057\001\001\000\004\012\060\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\063\001\001" +
    "\000\004\015\064\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    /*
    Se declaran las variables y constantes que se usarán al transcurso
    de la ejecución del programa.
    */
    private JFrame mainFrame;
    private DrawPanel dibujo;
    private ArrayList<Instruccion> instrucciones;
    private Hashtable<Integer,Object> memoria;
    private final Integer escala = 56;

    
    /*  
    Se crea una clase para la creación de objetos 
    que definirán las instrucciones de dibujado 
    */
    
    public class Instruccion{
        String tipo; //color / posicion / linea

        //color
        String color;

        //posicion
        Integer x;
        Integer y;

        //linea
        String direccion; //arriba / abajo / izquierda / derecha
        Integer largo;
        
        public Instruccion(String color) {
            this.tipo = "color";
            this.color = color;
        }

        public Instruccion(Integer x, Integer y) {
            this.tipo = "posicion";
            this.x = x;
            this.y = y;
        }

        public Instruccion(String direccion, Integer largo) {
            this.tipo = "linea";
            this.direccion = direccion;
            this.largo = largo;
        }

    }

    public class DrawPanel extends JPanel{
        
        /*  Genera panel gráfico para dibujar las lineas de las instrucciones ingresadas    */
        
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;

            setBackground(new Color(0, 0, 0)); // Establecemos el color de fondo del dibujo en negro
            g.setColor(new Color(255, 255, 255)); // Establecemos el color por defecto de los trazos color blanco
            /*  
            Se guarda la posición origen para ser hacer que la instruccion POS funcione
            con valores absolutos y no relativos   
            */
            
            AffineTransform origen = g2d.getTransform();

            /*  Recorre las instrucciones guardadas para dibujarlas en el panel en el orden que corresponda  */
            
            for (Instruccion i:instrucciones) {
                switch (i.tipo) {
                    case "color":       //  Se establece el color para el dibujado de trazos
                    {
                        switch (i.color)
                        {
                            case "rojo":
                            {
                                g.setColor(new Color(255, 0, 0));
                                break;
                            }
                            case "amarillo":
                            {
                                g.setColor(new Color(255, 255, 0));
                                break;
                            }
                            case "verde":
                            {
                                g.setColor(new Color(0, 255, 0));
                                break;
                            }
                            case "blanco":
                            {
                                g.setColor(new Color(255, 255, 255));
                                break;
                            }
                            case "azul":
                            {
                                g.setColor(new Color(0, 0, 255));
                                break;
                            }
                            default:
                                break;
                        }
                        break;
                    }
                    case "posicion":    //  Se redefine el origen para posicionar un nuevo objeto a dibujar en el panel 
                                        //  según las coordenadas ingresadas.
                    {                   //  Escala definida es a pixel
                        g2d.setTransform(origen);
                        g.translate(i.x, i.y);
                        break;
                    }
                    case "linea":       //  Define la dirección del trazo a dibujar en el panel con su largo y dirección
                    {                   //  Escala definida es a centímetros (1 pixel =~ 56 centimetros) (Resolucion 1920x1080, 15.6")
                        switch (i.direccion) {
                            case "izquierda":
                            {
                                g.drawLine(0, 0, -i.largo * escala, 0);
                                g.translate(-i.largo * escala, 0);
                                break;
                            }
                            case "derecha":
                            {
                                g.drawLine(0, 0, i.largo * escala, 0);
                                g.translate(i.largo * escala, 0);
                                break;
                            }
                            case "abajo":
                            {
                                g.drawLine(0, 0, 0, i.largo * escala);
                                g.translate(0, i.largo * escala);
                                break;
                            }
                            case "arriba":
                            {
                                g.drawLine(0, 0, 0, -i.largo * escala);
                                g.translate(0, i.largo * escala);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    /*  Manejo de errores para símbolos incorrectos, entregando un mensaje en pantalla */
    
    public void report_error(String message, Object info) {

        StringBuilder m = new StringBuilder("Error");
   
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            if (s.left >= 0) {                
                m.append(" in line "+(s.left+1));   
                if (s.right >= 0)                    
                    m.append(", column "+(s.right+1));
            }
        }
   
        m.append(" : "+message);
   
        System.err.println(m);
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
 
        mainFrame = new JFrame("ETT");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        mainFrame.setSize(1440, 900);
        memoria = new Hashtable<Integer, Object>();
        instrucciones = new ArrayList<Instruccion>(); 
        dibujo = new DrawPanel();
        mainFrame.add(dibujo);
        mainFrame.setVisible(true);
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= NT$0 EDITAR A TERMINO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= A I 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= I 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$1 ::= 
            {
              Object RESULT =null;
		int Xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object X = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int Yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object Y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

            instrucciones.add(new Instruccion((Integer)X,(Integer)Y));      // Se genera un objeto de la clase "Instruccion" la cual es almacenada en la lista "instrucciones"
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // I ::= POS LPAREN N COMMA N NT$1 RPAREN 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int Xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int Xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object X = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int Yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object Y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$2 ::= 
            {
              Object RESULT =null;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
            instrucciones.add(new Instruccion("izquierda",(Integer)L));      // Se genera un objeto de la clase "Instruccion" la cual es almacenada en la lista "instrucciones"
            dibujo.repaint();   // Se le dice al panel del dibujado a repintar con la nueva instrucción
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // I ::= IZQ LPAREN D NT$2 RPAREN 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$3 ::= 
            {
              Object RESULT =null;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

            instrucciones.add(new Instruccion("derecha",(Integer)L));      // Se genera un objeto de la clase "Instruccion" la cual es almacenada en la lista "instrucciones"
            dibujo.repaint();   // Se le dice al panel del dibujado a repintar con la nueva instrucción
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // I ::= DER LPAREN D NT$3 RPAREN 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$4 ::= 
            {
              Object RESULT =null;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
            instrucciones.add(new Instruccion("abajo",(Integer)L));      // Se genera un objeto de la clase "Instruccion" la cual es almacenada en la lista "instrucciones"
            dibujo.repaint();   // Se le dice al panel del dibujado a repintar con la nueva instrucción
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$4",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // I ::= ABA LPAREN D NT$4 RPAREN 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$5 ::= 
            {
              Object RESULT =null;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
            instrucciones.add(new Instruccion("arriba",(Integer)L));      // Se genera un objeto de la clase "Instruccion" la cual es almacenada en la lista "instrucciones"
            dibujo.repaint();   // Se le dice al panel del dibujado a repintar con la nueva instrucción
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$5",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // I ::= ARR LPAREN D NT$5 RPAREN 
            {
              Object RESULT =null;
              // propagate RESULT from NT$5
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // I ::= DAVALOR ID EQUAL N 
            {
              Object RESULT =null;
		int IDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int IDright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer ID = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int Nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object N = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
            memoria.put((Integer)ID, N); // Se guarda el valor obtenido N en la tabla segun el ID obtenido.
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NT$6 ::= 
            {
              Object RESULT =null;
		int Cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object C = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
            instrucciones.add(new Instruccion((String)C));      // Se genera un objeto de la clase "Instruccion" la cual es almacenada en la lista "instrucciones"
            dibujo.repaint();   // Se le dice al panel del dibujado a repintar con la nueva instrucción
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$6",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // I ::= COLOR LPAREN B NT$6 RPAREN 
            {
              Object RESULT =null;
              // propagate RESULT from NT$6
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int Cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object C = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("I",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // D ::= ID 
            {
              Object RESULT =null;
		int IDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int IDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer ID = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = memoria.get(ID); // Se busca el valor guardado por el campo ID en la tabla
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // D ::= DIGITO 
            {
              Object RESULT =null;
		int Dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer D = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = D; // Se retorna el valor numerico obtenido
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // B ::= C 
            {
              Object RESULT =null;
		int Cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String C = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = C;  // Se retorna el color obtenido como string obtenido
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // B ::= ID 
            {
              Object RESULT =null;
		int IDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int IDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer ID = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = memoria.get(ID); // Se busca el valor guardado por el campo ID en la tabla
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // N ::= ID 
            {
              Object RESULT =null;
		int IDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int IDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer ID = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = memoria.get(ID); // Se busca el valor guardado por el campo ID en la tabla
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("N",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // N ::= DIGITO 
            {
              Object RESULT =null;
		int Dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer D = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = D;  // Se retorna el valor numerico obtenido
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("N",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // N ::= C 
            {
              Object RESULT =null;
		int Cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String C = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
          RESULT = C; // Se retorna el color obtenido como string obtenido
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("N",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
