package edu.escuelaing.arsw.lab01CaycedoOspina.threads;



/**
 * Hello world!
 *
 */

public class CountThreadMain {


    public static void main( String a[]){
        Thread hilo1 = new CountThread(0,99);
        Thread hilo2 = new CountThread(100,199);
        Thread hilo3 = new CountThread(200,299);
        hilo1.run();
        hilo2.run();
        hilo3.run();
    }
}
