
public class conta {
	
		int numero;
		double saldo;
		double limite;
		String dono;
		double dinheiro;
		
		void sacar(double quantidade) {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
		}
		
}
