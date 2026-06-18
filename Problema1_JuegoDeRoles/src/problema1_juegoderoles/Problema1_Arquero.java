/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_juegoderoles;

/**
 *
 * @author LOQ
 */
    public class Problema1_Arquero extends Problema1_Personaje {
    public Problema1_Arquero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Problema1_Personaje enemigo) {
        System.out.println("-> " + nombre + " dispara una flecha a " + enemigo.getNombre());
        enemigo.defender(20);
        subirNivel();
    }

    @Override
    public void defender(int dano) {
        int danoReducido = dano - 5;
        if (danoReducido < 0) danoReducido = 0;
        vida -= danoReducido;
        System.out.println("- " + nombre + " esquiva parcialmente. Recibe " + danoReducido + " de daño. Vida: " + vida);
    }
}

