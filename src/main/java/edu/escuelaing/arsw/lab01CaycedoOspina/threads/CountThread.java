package edu.escuelaing.arsw.lab01CaycedoOspina.threads;


public class CountThread extends Thread{

    private Integer a;
    private Integer b;


    public CountThread (Integer a,Integer b){
        this.a = a;
        this.b = b;
    }


    @Override
    public void run (){
        while(a < b){
            System.out.println(a);
            a++;
        }
        



    }
    

}
