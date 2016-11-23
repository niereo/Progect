/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niereo
 */
public class Pupazzo {
    private float prezzo; 
    //construttore dato il prezzo crea un pupazzo
    public Pupazzo(float p){
        this.prezzo = p;
    }
    //ritorna il prezzo di un pupazzo
    public float getPrezzo(){
        return this.prezzo;
    }
    //permette di cambiare il prezzo dei pupazzi
    public void setPrezzo(float p){
        this.prezzo = p;
    }
}
