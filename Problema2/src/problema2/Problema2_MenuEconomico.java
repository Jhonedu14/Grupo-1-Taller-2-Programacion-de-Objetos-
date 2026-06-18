package problema2;

public class Problema2_MenuEconomico extends Problema2_Menu {
    private double porcentajeDescuento;

    public Problema2_MenuEconomico(String nombrePlato, int valorInicial, double descuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = descuento;
    }

    @Override
    public void calcularValorMenu() {
        valor = valorInicial - (valorInicial * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return "\n"
                + "\nMenú Económico\n"
                + "---------------\n"
                + "Plato: " + nombrePlato + "\n"
                + String.format("Valor del menú: %.2f\n", valor)
                + String.format("Valor Inicial: %.2f\n", valorInicial)
                + String.format("%% Descuento: %.2f%%\n", porcentajeDescuento);
    }
}
