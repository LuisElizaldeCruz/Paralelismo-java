package CarreraCaballosV2;

import static CarreraCaballosV2.ICaballo.contador;
import static CarreraCaballosV2.ICaballo.etiC4;
import static CarreraCaballosV2.ICaballo.j4;
import static CarreraCaballosV2.ICaballo.meta;
import static CarreraCaballosV2.ICaballo.posicion4;
import static CarreraCaballosV2.ICaballo.suma4;
import static CarreraCaballosV2.ICaballo.total4;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

import static CarreraCaballosV2.ICaballo.hilo;
import static CarreraCaballosV2.ICaballo.hilo2;
import static CarreraCaballosV2.ICaballo.hilo3;
import static CarreraCaballosV2.ICaballo.hilo4;
import static CarreraCaballosV2.ICaballo.hilo5;
import static CarreraCaballosV2.ICaballo.j2;
import static CarreraCaballosV2.ICaballo.j3;
import static CarreraCaballosV2.ICaballo.j5;

/**
 * *@author luis
 */
public class Caballo4 implements Runnable {

    public Caballo4() {

    }

    @Override
    public void run() {
        // for (int i = 0; i < 3000; i++) {
        suma4 = (int) (Math.random() * 150);
        total4 = total4 + suma4;
        posicion4 = total4 + suma4 + 2;
        //if (j4 < meta) {
        while (j4 <= posicion4) {

           // if (contador<=meta||j2 <= meta||j3<=meta||j4<=meta||j5<=meta) {
            try {
                //if (j4 <= meta) {
                if(j4<=meta){
                if (contador>=meta||j2 >= meta||j3>=meta||j5>=meta) {
                   
                }else{
                     sleep(10);
                    //System.out.println("El caballo " + getName()+" descansa");
                    System.out.println("La posicion c4 es " + j4);
                    etiC4.setLocation(j4, 420);
                    j4 = j4 + 1;
                }
                }
                
                if (j4 == meta) {
                    JOptionPane.showMessageDialog(null, "El caballo 4 ha llegado a la meta");
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
                JOptionPane.showMessageDialog(null, "El caballo 4 ha ganado");
            }*/

        }

    }
}
