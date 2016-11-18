
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
        Direttore d = new Direttore ("Adolf","Hitler");
        GregorianCalendar g = new GregorianCalendar ();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat();
        Biglietto b = new Biglietto(p);
        b.setPrezzo(k);
        System.out.println(b.getPrezzo());
        System.out.println(i.getNome()+" "+i.getCognome());
        System.out.println(i.getCodImpiegato());
        System.out.println (g.get(Calendar.DATE));
        System.out.println(sdf.format(g.getTime()));
        System.out.println (g.get(Calendar.DATE));
       System.out.println(a.getNome());
       System.out.println(a.getSpecie());
    }
}
