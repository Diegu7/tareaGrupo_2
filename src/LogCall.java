
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diegu7
 */
public class LogCall {
   
    public int numero;
    public int minutosDuracion;
    public Calendar fecha;
   
    public LogCall (int n, int m) {
        numero = n;
        minutosDuracion = m;
        fecha = Calendar.getInstance();
    }
   
    @Override
    public String toString() {
        return "numero: " + numero + " Duracion llamada: " + minutosDuracion + " fecha llamda: " + fecha.getTime();
    }
   
   
}

