/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Roberto
 */
public class Direttore {
    private final String nome;
    private final String cognome;
    private GregorianCalendar data;
    public Direttore(String n,String c)
    {
      this.nome = n;
      this.cognome = c;
      this.data= data;
      System.out.println ("Il direttore dello zoo è " + n +" "+  c);
      
    }
    public int GregorianCalendar()
    {        
        return  GregorianCalendar.DAY_OF_MONTH;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    public String getCognome()
    {
        return this.cognome;
    }

   
}
