
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Poupan�a ***");
		super.imprimirInfosComuns();
	}

	@Override
	public void emprestimo(double valor) {
		
	}
}