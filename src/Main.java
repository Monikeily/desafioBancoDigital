
public class Main {
	
	public static void main(String[] args) {
		Cliente monikeily = new Cliente();
		monikeily.setNome("monikeily");
		
						
		Contas cc = new ContaCorrente(monikeily);
		cc.depositar(100);
		
		Contas poupanca = new ContaPoupanca(monikeily);
		cc.transferir(50, poupanca);
		
		new Pagamentos(monikeily);
		poupanca.pagar(20);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
