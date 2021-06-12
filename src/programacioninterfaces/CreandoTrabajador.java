/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioninterfaces;

/**
 *
 * @author yo_BM
 */
public class CreandoTrabajador {
    
    public static void main(String[] args) {
    
    Herramienta herramienta = new Martillo();
    
    Trabajador trabajador = new Trabajador();
    
    trabajador.setHerramienta(herramienta);
        
    System.out.println("El nombre de la herramienta del trabajador es "+ trabajador.getHerramienta().getNombre());
    }
}
