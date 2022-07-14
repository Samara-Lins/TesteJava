
public class AnimalDomestico extends Animal{
	String nome;
	String raca;
	boolean pedigree;
	
	AnimalDomestico(String nome,String raca,boolean pedigree) {
		this.nome = nome;
		this.raca = raca;
		this.pedigree = pedigree;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}
}

	

