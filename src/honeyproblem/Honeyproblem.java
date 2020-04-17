/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honeyproblem;

/**
 *
 * @author ibo
 */
public class Honeyproblem {

     private static final int NUM_Bees = 5;
             
     //private static final int MAX_POT =25;
    public static void main(String[] args) {
       HoneyPot pot= new HoneyPot();
       
       (new Thread(new Consumer(pot))).start();
       for(int i=0; i< NUM_Bees;i++){
            new Thread(new Producer(i+1,pot)).start();
        }
    }
    
}
