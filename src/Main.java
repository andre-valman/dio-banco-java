
public class Main {
	public static void main(String[] args) {
		Cliente val = new Cliente();
		val.setNome("Val");
		
		
		Conta cc = new ContaCorrente(val);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(val);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
