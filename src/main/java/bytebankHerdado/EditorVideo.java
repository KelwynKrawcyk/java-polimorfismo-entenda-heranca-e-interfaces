package bytebankHerdado;

public class EditorVideo extends Funcionario{

    public double getBonificacao() {
        System.out.println("Chamando bonificacao Editor de video");
        return super.getBonificacao() + 100;
    }
}
