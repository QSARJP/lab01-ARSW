package edu.escuelaing.arsw.lab01CaycedoOspina.math;



public class bbpThread extends Thread{

    private Integer n ;
    private int start;
    private int count;

    public bbpThread(int start, int count){
        this.start=start;
        this.count = count;

    }

    public void run(){
    
        System.out.print(Main.bytesToHex(PiDigits.getDigits(start, count)));
        
    }

}