
public interface Iconta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir1(double valor, Iconta contaDestino);
	
	void imprimirExtrato();

	void transferir(double valor, Iconta contaDestino);
}