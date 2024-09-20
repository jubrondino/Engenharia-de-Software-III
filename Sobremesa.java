public class Sobremesa extends Produto {
    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    // Métodos estáticos para criar Sobremesa
    public static Sobremesa criarSobremesaGrande() {
        return new Sobremesa("Sobremesa Grande", 10.00, "Grande");
    }

    public static Sobremesa criarSobremesaPequena() {
        return new Sobremesa("Sobremesa Pequena", 6.00, "Pequena");
    }

    @Override
    public String toString() {
        return super.toString() + " (" + tamanho + ")";
    }
}
