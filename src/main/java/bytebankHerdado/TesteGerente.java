package bytebankHerdado;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Kelwyn");
        g1.setCpf("222.222.444-45");
        g1.setSalario(5000);

        System.out.println(g1.getNome());
        System.out.println(g1.getBonificacao());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);

    }
}
