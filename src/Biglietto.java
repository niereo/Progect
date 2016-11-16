/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niereo
 */
public class Biglietto {
    private float prezzo; //prezzo di un biglietto
    //construttore dato il prezzo crea un biglietto
    public Biglietto(float p){
        this.prezzo = p;
        System.out.println("ho creato un biglietto che costa " + p);
    }
    //ritorna il prezzo di un biglietto
    public float getPrezzo(){
        return this.prezzo;
    }
    //permette di cambiare il prezzo dei biglietti
    public void setPrezzo(float p){
        this.prezzo = p;
    }
}

