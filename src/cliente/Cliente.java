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
public class Cliente {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
  Bicicleta bc = new BicicletaModificada();
  bc.setColor("Azul");
  bc.setDiametro("26");
  System.out.println(bc.verBicicleta());
  
  Bicicleta bc2 = bc.clone();
  bc2.setColor("rojo");
  bc2.setDiametro("29");
  
  System.out.println(bc2.verBicicleta());
    }
    
}

