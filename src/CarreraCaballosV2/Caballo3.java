package CarreraCaballosV2;

import static CarreraCaballosV2.ICaballo.contador;
import static CarreraCaballosV2.ICaballo.etiC3;
import static CarreraCaballosV2.ICaballo.i;
import static CarreraCaballosV2.ICaballo.j3;
import static CarreraCaballosV2.ICaballo.meta;
import static CarreraCaballosV2.ICaballo.posicion3;
import static CarreraCaballosV2.ICaballo.suma3;
import static CarreraCaballosV2.ICaballo.total3;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

import static CarreraCaballosV2.ICaballo.hilo;
import static CarreraCaballosV2.ICaballo.hilo2;
import static CarreraCaballosV2.ICaballo.hilo3;
import static CarreraCaballosV2.ICaballo.hilo4;
import static CarreraCaballosV2.ICaballo.hilo5;
import static CarreraCaballosV2.ICaballo.j2;
import static CarreraCaballosV2.ICaballo.j4;
import static CarreraCaballosV2.ICaballo.j5;

/**
 * *@author luis
 */
public class Caballo3 implements Runnable {

    public Caballo3() {

    }

    @Override
    public void run() {
        // for (int i = 0; i < 3000; i++) {
        suma3 = (int) (Math.random() * 150);
        total3 = total3 + suma3;
        posicion3 = total3 + suma3 + 2;
        //if (j3 <= meta) {
        while (j3 <= posicion3) {
            //if (contador<=meta||j2 <= meta||j3<=meta||j4<=meta||j5<=meta) {
            try {
                //if (j3 <= meta) {
                if(j3<=meta){
                if (contador>=meta||j2 >= meta||j4>=meta||j5>=meta) {
                    
                }
                else{
                    sleep(10);
                    System.out.println("La posicion es " + j3);
                    etiC3.setLocation(j3, 290);
                    j3 = j3 + 1;
                }
                }
                
                if (j3 == meta) {
                    JOptionPane.showMessageDialog(null, "El caballo 3 ha llegado a la meta");
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
             }
            /*
            } else {
                JOptionPane.showMessageDialog(null, "El caballo 3 ha ganado");
            }
             */
        }

    }
}
