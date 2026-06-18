/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_juegoderoles;

/**
 *
 * @author LOQ
 */
public class Problema1_Mago extends Problema1_Personaje {
    public Problema1_Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Problema1_Personaje enemigo) {
        System.out.println("o " + nombre + " lanza un hechizo a " + enemigo.getNombre());
        enemigo.defender(25);
        subirNivel();
    }

    @Override
    public void defender(int dano) {
        vida -= dano;
        System.out.println("- " + nombre + " recibe " + dano + " de daño mágico. Vida: " + vida);
    }
}

