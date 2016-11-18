/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto
 */
public class Direttore {
    private final String nome;
    private final String cognome;
     
    public Direttore(String n,String c)
    {
      this.nome = n;
      this.cognome = c;
      System.out.println ("Il direttore dello zoo è " + c +" "+  n);
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
