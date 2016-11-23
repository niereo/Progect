/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niereo
 */
public class Maglietta {
    private float prezzo; 
    //construttore dato il prezzo crea una maglietta
    public Maglietta(float p){
        this.prezzo = p;
    }
    //ritorna il prezzo di una maglietta
    public float getPrezzo(){
        return this.prezzo;
    }
    //permette di cambiare il prezzo delle magliette
    public void setPrezzo(float p){
        this.prezzo = p;
    }
}
