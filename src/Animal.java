
public class Animal {
	String especie;
	int idade;
	String familia;
	
	public Animal(String especie,int idade,String familia) {
		this.especie = especie;
		this.idade = idade;
		this.familia = familia;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public void fazerSom(Animal animal) {
		System.out.println("*Som de animal");
	}
}
