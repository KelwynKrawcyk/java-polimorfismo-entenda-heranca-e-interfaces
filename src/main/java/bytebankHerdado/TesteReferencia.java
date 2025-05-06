package bytebankHerdado;

public class TesteReferencia {
    public static void main(String[] args) {
        //referencia            objeto
        Funcionario g1 = new Gerente();
        g1.setNome("Joao");
        //g1 é referenciado como funcionario, não acessa autentica (polimorfismo)
        //g1.autentica("2222");
        System.out.println(g1.getNome());
    }
}
