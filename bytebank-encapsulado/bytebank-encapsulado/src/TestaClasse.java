
public class TestaClasse {

	public static void main(String[] args) {
		
		Cliente gabriel = new Cliente();
		Conta contaDoGabriel = new Conta();
		
		contaDoGabriel.setTitular(gabriel);
		
		contaDoGabriel.getTitular().setCpf("333.333.333-33");
		contaDoGabriel.getTitular().setNome("Gabriel");
		contaDoGabriel.getTitular().setProfissao("Estudante");
		
		contaDoGabriel.setAgencia(1517);
		contaDoGabriel.setNumero(23);
		
		contaDoGabriel.deposita(300);
		contaDoGabriel.saca(150);
		
		System.out.println(contaDoGabriel.getAgencia());
		System.out.println(contaDoGabriel.getNumero());
		System.out.println(contaDoGabriel.getSaldo());
	}
}
