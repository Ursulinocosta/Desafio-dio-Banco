public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("### extrato Conta Poupança###");
        super.imprimirInfosComuns();
        
    } 


}