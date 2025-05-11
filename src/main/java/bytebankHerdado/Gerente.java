package bytebankHerdado;

public class Gerente extends FuncionarioAutenticavel{

    public double getBonificacao() {
        System.out.println("Chamando método bonificacao gerente");
        return super.getSalario();
    };
}
