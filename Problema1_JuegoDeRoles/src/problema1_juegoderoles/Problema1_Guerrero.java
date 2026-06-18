/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_juegoderoles;

/**
 *
 * @author LOQ
 */
public class Problema1_Guerrero extends Problema1_Personaje {
    public Problema1_Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Problema1_Personaje enemigo) {
        System.out.println("+ " + nombre + " ataca con su espada a " + enemigo.getNombre());
        enemigo.defender(30);
        subirNivel();
    }

    @Override
    public void defender(int dano) {
        int danoReducido = dano - 10;
        if (danoReducido < 0) {
            danoReducido = 0;
        }
        vida -= danoReducido;
        System.out.println("- " + nombre + " bloquea parte del daño. Recibe " + danoReducido + " de daño. Vida: " + vida);
    }
}

