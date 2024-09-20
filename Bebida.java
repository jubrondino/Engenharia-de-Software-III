public class Bebida extends Produto {
    private int ml;

    public Bebida(String descricao, double preco, int ml) {
        super(descricao, preco);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    // Métodos estáticos para criar Bebida
    public static Bebida criarBebidaGrande() {
        return new Bebida("Bebida Grande", 8.00, 500);
    }

    public static Bebida criarBebidaPequena() {
        return new Bebida("Bebida Pequena", 5.00, 300);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + ml + "ml)";
    }
}
