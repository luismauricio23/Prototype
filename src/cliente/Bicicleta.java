/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author lmrse
 */
public  abstract class Bicicleta implements Cloneable {
    
    private String color;
    private String diametro;
    
    @Override
  public Bicicleta clone() throws CloneNotSupportedException {
  return (Bicicleta) super.clone();
 }
 
 public abstract String verBicicleta();

    //Getters and Setters
 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public String getDiametro() {
  return diametro;
 }

 public void setDiametro(String diametro) {
  this.diametro = diametro;
 }
    
}
