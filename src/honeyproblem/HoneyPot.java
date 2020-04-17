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
class HoneyPot {
    
    private int honeypot=0;
    private int maxhoney=25;
  
    public synchronized int take() throws InterruptedException {
        if(honeypot == maxhoney) {  
        honeypot=0;  
        }
          wait();  
          
       
        return honeypot;
    }

    public synchronized int put() throws InterruptedException {
        if(honeypot < maxhoney ){ 
                honeypot++;
                
        }
        else{ 
            notify();
        }
        return honeypot;
        
    }
}

