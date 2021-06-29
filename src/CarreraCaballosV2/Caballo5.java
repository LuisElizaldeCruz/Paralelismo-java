package CarreraCaballosV2;

import static CarreraCaballosV2.ICaballo.contador;
import static CarreraCaballosV2.ICaballo.etiC5;
import static CarreraCaballosV2.ICaballo.j5;
import static CarreraCaballosV2.ICaballo.meta;
import static CarreraCaballosV2.ICaballo.posicion5;
import static CarreraCaballosV2.ICaballo.suma5;
import static CarreraCaballosV2.ICaballo.total5;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

import static CarreraCaballosV2.ICaballo.hilo;
import static CarreraCaballosV2.ICaballo.hilo2;
import static CarreraCaballosV2.ICaballo.hilo3;
import static CarreraCaballosV2.ICaballo.hilo4;
import static CarreraCaballosV2.ICaballo.hilo5;
import static CarreraCaballosV2.ICaballo.j2;
import static CarreraCaballosV2.ICaballo.j3;
import static CarreraCaballosV2.ICaballo.j4;


/**
 * *@author luis
 */
public class Caballo5 implements Runnable {

    public Caballo5() {

    }

    @Override
    public void run() {
        // for (int i = 0; i < 3000; i++) {
        suma5 = (int) (Math.random() * 150);
        total5 = total5 + suma5;
        posicion5 = total5 + suma5 + 2;
        //if (j5 <= meta) {
        while (j5 <= posicion5) {
            //if (contador<=meta||j2 <= meta||j3<=meta||j4<=meta||j5<=meta) {
            try {
                //if (j5 <= meta) {
                if(j5<=meta){
                if (contador>=meta||j2 >= meta||j3>=meta||j4>=meta) {
                    
                }
                else{
                    sleep(10);
                    System.out.println("La posicion c5 ha llegado a la meta" + j5);
                    etiC5.setLocation(j5, 570);
                    j5 = j5 + 1;
                }
                }
                
                if (j5 == meta) {
                    JOptionPane.showMessageDialog(null, "El caballo 5 ha llegado a la meta");
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
                JOptionPane.showMessageDialog(null, "El caballo 5 ha ganado");
            }*/

        }

    }
}
