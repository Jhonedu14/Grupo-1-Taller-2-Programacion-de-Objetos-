package problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2_EjecutarMenu {
    public static void main(String[] args) {
        ArrayList<Problema2_Menu> menu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu a la carta: ");
        String platoCarta = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu del dia: ");
        String platoDia = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu de ninos: ");
        String platoNinos = sc.nextLine();
        System.out.print("Ingrese el nombre del plato del menu economico: ");
        String platoEcon = sc.nextLine();
        System.out.println("");
        System.out.println("=== MENU PRINCIPAL ===\n");
        
        menu.add(new Problema2_MenuCarta(platoCarta, 22, 5, 3, 10));
        menu.add(new Problema2_MenuDia(platoDia, 10, 2, 1.5));
        menu.add(new Problema2_MenuNinos(platoNinos, 5, 1, 2));
        menu.add(new Problema2_MenuEconomico(platoEcon, 7, 20));

        Problema2_Cuenta cuenta = new Problema2_Cuenta(name, menu);
        
        cuenta.calcularSubtotal();
        cuenta.calcularTotal();
        
        System.out.println(cuenta);
    }
}
