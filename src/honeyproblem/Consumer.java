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
class Consumer implements Runnable {
private final HoneyPot pot;
 private Random sleep= new Random();
    public Consumer(HoneyPot pot) {
        this.pot=pot;
    }

    @Override
    public void run() {
        while(true){
            try{
               // System.out.println("bear is waiting for honey to");
                System.out.println("bear eat "+ pot.take());
               Thread.sleep(sleep.nextInt(10));
            }
            catch(Exception err){}
        }
 }
    
}
