
public abstract class Contas implements IConta{
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	
	protected int agencia; 
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	
	public Contas(Cliente cliente) {
		this.agencia = Contas.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
		
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void pagar(double valor) {
		saldo -= valor;
	}

	
	public void depositar(double valor) {
		saldo += valor;
	}

	
	public void transferir(double valor, Contas contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
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
	
	protected void imprimirInforsComuns() {
		System.out.println(String.format("Cliente: %s" , this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d" , this.agencia));
		System.out.println(String.format("Conta: %d" , this.numero));
		System.out.println(String.format("Saldo: %.2f" , this.saldo));
		
		
	}
	
		
}

