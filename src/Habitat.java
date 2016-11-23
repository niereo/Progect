/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.GregorianCalendar;
/**
 *
 * @author niereo
 */
public class Habitat {
  private final String specie; 
  public GregorianCalendar dataUltimaPulizia;
  public GregorianCalendar dataUltimoPasto;
//costrutttore di habitat
public Habitat(String s, GregorianCalendar a,GregorianCalendar b){
    this.specie = s;
    this.dataUltimaPulizia = a;
    this.dataUltimoPasto = b;
}  
//ritorna la specie che vive in questo habitat
  public String getSpecie(){
      return this.specie;
  }
  //ritorna la data dell'ultima pulizia dell'habitat
  public GregorianCalendar getDataUltimaPulizia(){
       return this.dataUltimaPulizia;
  }
  //ritorna la data dell'ultimo pasta rervito nell'habiat 
  public GregorianCalendar getDataUltimoPasto(){
      return this.dataUltimoPasto;
  }
}
