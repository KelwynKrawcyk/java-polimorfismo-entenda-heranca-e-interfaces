package bytebankHerdadoConta;

public class CalculadorImposto {

    private double totalImpsoto;

    public void registrar(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImpsoto += valor;
    }

    public double getTotalImposto() {
        return totalImpsoto;
    }
}
