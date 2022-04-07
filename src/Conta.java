
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double taxa;
	
	

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	
	public void sacar() {
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar() {
		
	}
	
	public void transferir() {
		
	}
	
	public void emprestimo() {
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}

	@Override
	public void emprestimo(double valor) {
		this.saldo += valor;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("N�mero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
