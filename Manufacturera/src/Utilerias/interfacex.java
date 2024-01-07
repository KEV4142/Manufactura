package Utilerias;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kev4142
 */
public class interfacex {

    public interfacex() {
    }
    public String FormatoSimple(float n){
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat num = new DecimalFormat("##.##",simbolos);
        double xx=-1;
        xx=(double) n;
        return num.format(xx);
    }
    
    /**
     * Funcion que convierte argumentos de tipo String a de tipo Integer.
     * @param x tipo String
     * @return un tipo Integer
     */
    public int String_Int(String x){
        int z=-1;
        try{
            z=Integer.parseInt(x);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    /**
     * Funcion que convierte argumentos de tipo String a de tipo Float.
     * @param x tipo String
     * @return un tipo Float
     */
    public float String_Float(String x){
        float z=-1;
        try{
            z= Float.parseFloat(x);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    /**
     * Funcion que convierte argumentos de tipo Integer a de tipo String.
     * @param x tipo Integer
     * @return un tipo String
     */
    public String Int_String(int x){
        String z="";
        try{
            z=String.valueOf(x);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    /**
     * Funcion que convierte argumentos de tipo Object a de tipo String.
     * @param x tipo Object
     * @return un tipo String
     */
    public String Object_String(Object x){
        String z="";
        try{
            z=String.valueOf(x);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    /**
     * Funcion que convierte argumentos de tipo Object a de tipo String.
     * @param x tipo Object
     * @return un tipo String
     */
    public Object String_Object(String x){
        Object z=null;
        try{
            z=x;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    
    public InputStream String_InputStream(String x){
        InputStream z;
        z = null;
        try{
            z=new ByteArrayInputStream(x.getBytes());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    /**
     * Funcion que convierte argumentos de tipo Object a de tipo String.
     * @param x tipo Date
     * @return un tipo String
     */
    public String Date_String(Date x){
        String z="";
        try{
            SimpleDateFormat a=new SimpleDateFormat("yyyy-M-dd");
            
            z=a.format(x).toString();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
    /**
     * Funcion que convierte argumentos de tipo String a de tipo Date.
     * @param x tipo String
     * @return un tipo Date
     */
    public Date String_Date(String x){
        Date z=null;
        try{
            SimpleDateFormat a=new SimpleDateFormat("yyyy-M-dd");
            z=a.parse(x);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONVERTIR ESTE VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return z;
    }
}
