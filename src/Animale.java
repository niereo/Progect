/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//cinesi merda ma ab è peggio
/**
 *
 * @author niereo
 */
public class Animale {
    private final String nome;
    private final String specie;
    private final Boolean malato;
    public Animale(String n,String s ){
        this.nome = n;
        this.specie = s;
        this.malato = false;
        System.out.println("ho aggiunto un " + s + " di nome " + n );
        
    }
}
