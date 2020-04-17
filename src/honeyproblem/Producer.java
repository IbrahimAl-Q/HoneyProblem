/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honeyproblem;

import java.util.Random;

/**
 *
 * @author ibo
 */
class Producer implements Runnable {
    private final HoneyPot pot;
    private int id;
    private Random sleep= new Random();
    
    public Producer(int id, HoneyPot pot) {
        this.pot=pot;
        this.id=id;
    }


    public void run() {
        
       while(true){
           try{
            pot.put();
            Thread.sleep(sleep.nextInt(1000));
              System.out.println(" bee with id "+ id +" honey produced :"+ pot.put());
             
              
           }
           catch(Exception err){
               err.printStackTrace();
           }
           
        }
    }

   
}
