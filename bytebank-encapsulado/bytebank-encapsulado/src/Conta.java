

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	void deposita(double valor) {
		saldo += valor;
	}
	
	boolean saca(double valor) {
		if(saldo>=valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	boolean transfere(double valor, Conta outraConta){
		if(saldo>=valor) {
			this.saca(valor);
			outraConta.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
