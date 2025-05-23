package bytebankHerdado;

public class Gerente extends Funcionario implements Autenticavel{

    public AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando método bonificacao gerente");
        return super.getSalario();
    };

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
