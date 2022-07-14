
public class Carro {
	String marca;
	String modelo;
	double valor;
	String cor;
	double volumeTanque;
	
	Carro(String modelo, String cor,double volumeTanque) {
		this.modelo = modelo;
		this.cor = cor;
		this.volumeTanque = volumeTanque;
	}
	
	Carro(String marca,String modelo,double valor,
			String cor,double volumeTanque) {
		this.marca =  marca;
		this.modelo = modelo;
		this.valor = valor;
		this.cor = cor;
		this.volumeTanque = volumeTanque;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVolumeTanque() {
		return volumeTanque;
	}

	public void setVolumeTanque(double volumeTanque) {
		this.volumeTanque = volumeTanque;
	}

	public void finalize() {
		this.finalize();
	}
	
	public double pagamento(long numeroCartao,int senha,int litros,
			double precoGasolina) {
		System.out.println("Processando...");
		System.out.println("Transação aceita");
		System.out.print("Valor da compra: R$");
		return litros * precoGasolina;
	}
	double pagamento(int litros, double precoGasolina) {
		System.out.print("Valor total a pagar: R$");
		return litros * precoGasolina;
	}
	
	public double encherTanque(double precoGasolina) {
		return volumeTanque * precoGasolina;
	}
	public static void main(String[] args) {
		Carro carro1 = new Carro("Ferrari","Corcel",1225687.30,"vermelho",45);
		System.out.println("Encher o tanque vai custar R$"+carro1.encherTanque(4.98));
		carro1.pagamento(1223415744,0,36,4.59);
		carro1.pagamento(50,3.64);
	}
} 
