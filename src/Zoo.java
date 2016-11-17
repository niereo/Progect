/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niereo
 */
public class Zoo {
    public Zoo(){
        float p = (float) 9.99;
        float k = (float) 5.99;
        System.out.println("zoo");
        Animale a = new Animale("Alex", "leone");
        Impiegato i = new Impiegato ("Franco","Buccia","12345678");
        Biglietto b = new Biglietto(p);
        b.setPrezzo(k);
        System.out.println(b.getPrezzo());
        System.out.println(i.getNome()+" "+i.getCognome());
        System.out.println(i.getCodImpiegato());
    }
}
