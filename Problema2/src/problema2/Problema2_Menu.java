package problema2;

public abstract class Problema2_Menu {
    protected String nombrePlato;
    protected double valor;
    protected double valorInicial;

    public Problema2_Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract void calcularValorMenu();

    public double getValorMenu() {
        return valor;
    }

    @Override
    public String toString() {
        return "Menu{" + "nombrePlato=" + nombrePlato + ", valor=" + valor + '}';
    }
}
