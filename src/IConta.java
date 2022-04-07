
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void emprestimo(double valor);
	
	void imprimirExtrato();

}
