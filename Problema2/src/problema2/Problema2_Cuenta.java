package problema2;

import java.util.ArrayList;

public class Problema2_Cuenta {

    private String cliente;
    private ArrayList<Problema2_Menu> listaMenu;
    private double iva = 0.12;
    private double subtotal;
    private double total;

    public Problema2_Cuenta(String cliente, ArrayList<Problema2_Menu> listaMenu) {
        this.cliente = cliente;
        this.listaMenu = listaMenu;
    }

    public void calcularSubtotal() {
        subtotal = 0;
        for (Problema2_Menu m : listaMenu) {
            m.calcularValorMenu();
            subtotal += m.getValorMenu();
        }
    }

    public void calcularTotal() {
        total = subtotal + (subtotal * iva);
    }

    @Override
    public String toString() {
        String calculo = "Cliente: " + cliente + "\n";
        for (Problema2_Menu m : listaMenu) {
            calculo += m.toString() + "\n";
        }

        calculo += String.format("Subtotal: %.2f\n", subtotal);
        calculo += String.format("IVA (12%%): %.2f\n", subtotal * iva);
        calculo += String.format("Total a pagar: %.2f\n", total);
        return calculo;
    }
}
