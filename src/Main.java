
public class Main {
	
	public static void imprimir(AnimalDomestico pet) {
		System.out.println(pet.getNome()+"\t"+
	pet.getEspecie()+"\t"+pet.getIdade()+" anos");
		System.out.print(pet.getRaca()+
				"\tPedigree: ");
		if (pet.isPedigree()) {
			System.out.println("SIM");
		} else {System.out.println("NÃO");}
	}
	public static void main(String[] args) {
		AnimalDomestico pet1 = new AnimalDomestico("Porquinho-da-índia",1,"mamíferos","Mel","pêlo-curto inglês",false);
		Main.imprimir(pet1);
	}
}
