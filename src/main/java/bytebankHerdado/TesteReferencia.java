package bytebankHerdado;

public class TesteReferencia {
    public static void main(String[] args) {
        //referencia            objeto
        //Funcionario g1 = new Gerente();

        //g1 é referenciado como funcionario, não acessa autentica (polimorfismo)
        //g1.autentica("2222");

        Gerente g1 = new Gerente();
        g1.setNome("Joao");
        g1.setSalario(5000);

        Funcionario f = new Funcionario();
        f.setSalario(2000);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setSalario(2000);

        

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
