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
public class BicicletaModificada extends Bicicleta {
    @Override
 public String verBicicleta() {
 
  return "Este es el color: " + this.getColor() + " El diametro es: " + this.getDiametro();
 } 

}
