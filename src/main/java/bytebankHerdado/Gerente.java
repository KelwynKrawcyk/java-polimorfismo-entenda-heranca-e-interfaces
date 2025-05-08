package bytebankHerdado;

public class Gerente extends Funcionario{
    private int senha;

    //metodos
    public boolean autentica (int senha){
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        System.out.println("Chamando método bonificacao gerente");
        return super.getSalario();
    };
}
