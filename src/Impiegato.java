/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto
 */
public class Impiegato {
    private final String nome;
    private final String cognome;
    private final String codImpiegato;
    private boolean impegnato;
    public Impiegato(String n,String c,String cod)
    {
     this.nome = n;
     this.cognome = c;
     this.codImpiegato = cod;
     this.impegnato = false;
    System.out.println("ho aggiunto un impiegato di nome " + n +" "+  c + " che ha come codice: "+cod);
      }
    public String getNome()
    {
        return this.nome;
        
    }
     public String getCognome()
    {
        return this.cognome;
        
    }
      public String getCodImpiegato()
    {
        return this.codImpiegato;
        
    }
}
