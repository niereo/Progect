/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niereo
 */
public class Cappellino {
    private float prezzo; 
    //construttore dato il prezzo crea un cappellino
    public Cappellino(float p){
        this.prezzo = p;
    }
    //ritorna il prezzo di un cappellino
    public float getPrezzo(){
        return this.prezzo;
    }
    //permette di cambiare il prezzo dei cappellini
    public void setPrezzo(float p){
        this.prezzo = p;
    }
}
