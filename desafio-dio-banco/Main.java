public class Main {
    public static void main(String[] args) {

        Cliente Ursulino = new Cliente();
        Ursulino.setNome("Ursulino");

        Conta cc = new ContaCorrente(Ursulino);
    
       Conta poupanca = new ContaPoupanca(Ursulino);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
