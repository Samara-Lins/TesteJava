
public class Main {
	public static void main(String[] args) {
		AnimalDomestico pet1 = new AnimalDomestico("Mel","pêlo-curto inglês",false);
		pet1.setEspecie("porquinho-da-índia");
		pet1.setIdade(1);
		pet1.setFamilia("mamíferos");
		System.out.println(pet1.getNome()+"\t"+pet1.getEspecie()+
		pet1.getIdade()+" anos"+pet1.getRaca());
	}
}
