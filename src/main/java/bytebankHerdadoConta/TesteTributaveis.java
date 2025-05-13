package bytebankHerdadoConta;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234,1231);
        cc.saldo = 100;
        SeguroVida seguro = new SeguroVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registrar(cc);
        calc.registrar(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
