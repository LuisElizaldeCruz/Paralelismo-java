package CarreraCaballosV2;

import static CarreraCaballosV2.ICaballo.contador;
import static CarreraCaballosV2.ICaballo.etiC1;
import static CarreraCaballosV2.ICaballo.i;
import static CarreraCaballosV2.ICaballo.meta;
import static CarreraCaballosV2.ICaballo.posicion;
import static CarreraCaballosV2.ICaballo.suma;
import static CarreraCaballosV2.ICaballo.total;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.sql.Time;
import javax.swing.JOptionPane;

import static CarreraCaballosV2.ICaballo.hilo;
import static CarreraCaballosV2.ICaballo.hilo2;
import static CarreraCaballosV2.ICaballo.hilo3;
import static CarreraCaballosV2.ICaballo.hilo4;
import static CarreraCaballosV2.ICaballo.hilo5;
import static CarreraCaballosV2.ICaballo.j;
import static CarreraCaballosV2.ICaballo.j2;
import static CarreraCaballosV2.ICaballo.j3;
import static CarreraCaballosV2.ICaballo.j4;
import static CarreraCaballosV2.ICaballo.j5;


/**
 * *@author luis
 */
public class Caballo1 implements Runnable {

    public Caballo1() {

    }

    @Override
    public void run() {
        suma = (int) (Math.random() * 150);
        total = total + suma;
        posicion = total + suma + 2;
        //if (contador < meta) {
        while (i <= posicion) {
           // if (contador<=meta||j2 <= meta||j3<=meta||j4<=meta||j5<=meta) {
            try {
                //if (contador <= meta) {
                if (contador<=meta){
                    if(j2 >= meta||j3>=meta||j4>=meta||j>=meta) {
                   
                    }
                    else{
                     sleep(10);
                    System.out.println("La posicion c1 es " + contador);
                    etiC1.setLocation(contador, 50);
                    i = i + 1;
                    contador = i;
                    }
                }
                
                if (contador == meta) {
                
                    JOptionPane.showMessageDialog(null, "El caballo 1 ha llegado a la meta");
                    /*
                    hilo.stop();
                    hilo2.stop();
                    hilo3.stop();
                    hilo4.stop();
                    hilo5.stop();
                    */
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            /*
            } /*
            else {
                JOptionPane.showMessageDialog(null, "El caballo 1 ha llegado en :" + contador);
            }
             */
        }//fin del while

    }

}
