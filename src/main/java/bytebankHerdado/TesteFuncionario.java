package bytebankHerdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente kelwyn = new Gerente();
        kelwyn.setNome("Kelwyn Fagundes");
        kelwyn.setCpf("222.222.222-22");
        kelwyn.setSalario(2500.00);

        System.out.println(kelwyn.getNome());
        System.out.println(kelwyn.getBonificacao());
    }
}
