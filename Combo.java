public class Combo {
    private Burguer burguer;
    private Bebida bebida;
    private Sobremesa sobremesa;


    public void criarCombo(int tipo) {
        if (tipo == 1) { 
            burguer = Burguer.criarBurguerGrande();
            bebida = Bebida.criarBebidaGrande();
            sobremesa = Sobremesa.criarSobremesaGrande();
        } else if (tipo == 2) { 
            burguer = Burguer.criarBurguerPequeno();
            bebida = Bebida.criarBebidaPequena();
            sobremesa = Sobremesa.criarSobremesaPequena();
        } else {
            System.out.println("Opção inválida!");
        }
    }

    @Override
    public String toString() {
        return "Combo:\n" + (burguer != null ? burguer.toString() : "Nenhum burguer") + "\n" +
               (bebida != null ? bebida.toString() : "Nenhuma bebida") + "\n" +
               (sobremesa != null ? sobremesa.toString() : "Nenhuma sobremesa");
    }
}
