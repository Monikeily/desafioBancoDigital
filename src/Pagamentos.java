
public class Pagamentos extends Contas{
	
	public Pagamentos (Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("*** Extrato Pagamentos***");
		super.imprimirInforsComuns();
	}	

}
