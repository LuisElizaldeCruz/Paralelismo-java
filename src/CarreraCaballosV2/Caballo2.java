package CarreraCaballosV2;

import static CarreraCaballosV2.ICaballo.contador;
import static CarreraCaballosV2.ICaballo.etiC2;
import static CarreraCaballosV2.ICaballo.hilo;
import static CarreraCaballosV2.ICaballo.hilo2;
import static CarreraCaballosV2.ICaballo.hilo3;
import static CarreraCaballosV2.ICaballo.hilo4;
import static CarreraCaballosV2.ICaballo.hilo5;
import static CarreraCaballosV2.ICaballo.j2;
import static CarreraCaballosV2.ICaballo.j3;
import static CarreraCaballosV2.ICaballo.j4;
import static CarreraCaballosV2.ICaballo.j5;
import static CarreraCaballosV2.ICaballo.meta;
import static CarreraCaballosV2.ICaballo.posicion2;
import static CarreraCaballosV2.ICaballo.suma2;
import static CarreraCaballosV2.ICaballo.total2;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.JOptionPane;

/**
 * *@author luis
 */
public class Caballo2 implements Runnable {

    public Caballo2() {

    }

    @Override
    public void run() {
        suma2 = (int) (Math.random() * 150);
        total2 = total2 + suma2;
        posicion2 = total2 + suma2 + 2;
        // if (j2 < meta) {
        while (j2 <= posicion2) {
            //if (contador<=meta||j2 <= meta||j3<=meta||j4<=meta||j5<=meta) {
            try {
                //if (j2 <= meta) {
                if(j2<=meta){
                if (contador>=meta||j2 >= meta||j3>=meta||j4>=meta||j5>=meta) {
                    
                }
                else{
                    sleep(10);
                    System.out.println("La posicion c2 es " + j2);
                    etiC2.setLocation(j2, 190);
                    j2 = j2 + 1;
                }
                }
                
                if (j2 == meta) {
                    JOptionPane.showMessageDialog(null, "El caballo 2 ha llegado a la meta");
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
                JOptionPane.showMessageDialog(null, "El caballo 2 ha ganado");
            }
             */
        }

    }

}
