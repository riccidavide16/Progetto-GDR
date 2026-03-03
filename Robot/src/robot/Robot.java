/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author Utente
 */
public abstract class Robot {
    
       private String id ;
       private int livelloBatteria;
       private boolean stato;
       private int efficcenza;

    public Robot(String id, int livelloBatteria, int efficcenza) {
        this.id = id;
        this.livelloBatteria = livelloBatteria;
        this.stato = false;
        this.efficcenza = efficcenza;
    }
    
    public void accendi() {
        stato = true;
       
    }
    
    public void spegni() {
        stato = false;
    
    }
    
    public void ricaricati() {
        livelloBatteria = 100;
        
    }
    
     public abstract void eseguiCompito();
       
	     
    
}
