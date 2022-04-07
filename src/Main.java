
public class Main {

	public static void main(String[] args) {
	Conta cc = new ContaCorrente();
	cc.emprestimo(1000);
	Conta poupanca = new ContaPoupanca();
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
	}

}
