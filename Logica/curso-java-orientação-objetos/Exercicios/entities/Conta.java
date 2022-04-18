package entities;

public class Conta {

		private int conta;
		private String nome;
		private double saldo;
		
		
		public Conta(int n, String nome,double depositoInicial) {
			this.conta = n;
			this.nome = nome;
			addSaldo(depositoInicial);
		}
		
		public Conta(int n, String nome) {
			this.conta = n;
			this.nome = nome;
		}
		public int getConta() {
			return conta;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public double addSaldo(double valor) { // pode se usar void também
			return saldo += valor;
		}
		
		public double saque(double valor) {
			return saldo -= valor + 5.0;
		}
		
		public String toString() {
			return "Acconunt " + conta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f",saldo);
		}
		
}
