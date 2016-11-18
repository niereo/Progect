/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author niereo
 */
public class Animale {
    private final String nome;
    private final String specie;
    private final Boolean malato;
    private GregorianCalendar dataUltimaVisita;
    //costruttore della classe Animale
    public Animale(String n,String s ){
        this.nome = n;
        this.specie = s;
        this.malato = false;
        System.out.println("ho aggiunto un " + s + " di nome " + n );
        
    }
    //Metodo che mi ritorna il nome dell'Animale
    public String getNome()
    {
        return this.nome;
    }
    //Restituisce la specie
    public String getSpecie()
    {
        return this.specie;
    }
    
    public GregorianCalendar getDataUltimaVisita()
    {
        return this.dataUltimaVisita;
    }
}
