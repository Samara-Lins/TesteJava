
public class AnimalDomestico extends Animal{
	String nome;
	String raca;
	boolean pedigree;
	
	AnimalDomestico(String especie, int idade, String familia,
			String nome,String raca,boolean pedigree) {
		super(especie,idade,familia);
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
	
	@Override
	public void fazerSom(Animal animal) {
		switch (animal.getEspecie()) {
		case "cachorro":
			System.out.println("*latido");
			break;
		case "gato":
			System.out.println("*miado");
			break;
		case "papagaio":
			System.out.println("Louro quer biscoito");
			break;
		case "porco":
			System.out.println("*guincho");
			break;
		case "vaca":
			System.out.println("*mugido");
			break;
		default:
			System.out.println("Não conheço esse animal");
			break;
		}
		
	}
}

	

