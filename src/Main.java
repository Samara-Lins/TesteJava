
public class Main {
	
	public static void imprimir(AnimalDomestico pet) {
		System.out.println(pet.getNome()+"\t"+
	pet.getEspecie()+"\t"+pet.getIdade()+" anos");
		System.out.print(pet.getRaca()+
				"\tPedigree: ");
		if (pet.isPedigree()) {
			System.out.println("SIM");
		} else {System.out.println("N�O");}
	}
	public static void main(String[] args) {
		AnimalDomestico pet1 = new AnimalDomestico("Porquinho-da-�ndia",1,"mam�feros","Mel","p�lo-curto ingl�s",false);
		Main.imprimir(pet1);
		pet1.fazerSom(pet1);
		AnimalSelvagem bicho1 = new AnimalSelvagem("lobo",5,"mam�feros","alfa",false,"predador");
		bicho1.fazerSom(bicho1);
	}
}
