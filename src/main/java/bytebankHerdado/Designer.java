package bytebankHerdado;

public class Designer extends Funcionario {
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método da bonificacao do Designer");
        return 200;
    }
}
