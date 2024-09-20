public class Burguer extends Produto {
    private int gramas;

    public Burguer(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public static Burguer criarBurguerGrande() {
        return new Burguer("Burguer Grande", 15.00, 400);
    }

    public static Burguer criarBurguerPequeno() {
        return new Burguer("Burguer Pequeno", 10.00, 200);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + gramas + "g";
    }
}
