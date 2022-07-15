import java.util.Scanner;

public class Calculadora implements Operacoes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int menu = 2022;
		System.out.println("Valor de A: ");
		int a = ler.nextInt();
		System.out.println("Valor de B: ");
		int b = ler.nextInt();
		while (menu != 0) {
			System.out.println("Escolha do menu:\n"
					+ "[1] Soma\n[2] Subtra��o\n"+
					"[3] Multiplica��o\n[4] Divis�o\n"+
					"[5] Porcentagem\n[6] Pot�ncia\n"+
					"[7] Raiz\n[8] Novos valores");
			menu = ler.nextInt();
			switch (menu) {
			case 0:
				System.out.println("ENCERRANDO...");
				break;
			case 1:
				System.out.println(a+" + "+b+" = "
						+ Operacoes.soma(a, b));
				break;
			case 2:
				System.out.println(a+" - "+b+" = "
						+ Operacoes.subtracao(a, b));
				break;
			case 3:
				System.out.println(a+" x "+b+" = "
						+ Operacoes.multiplicacao(a, b));
				break;
			case 4:
				System.out.println(a+" / "+b+" = "
						+ Operacoes.divisao(a, b));
				break;
			case 5:
				System.out.println(b+"% de "+a+" = "
						+ Operacoes.porcentagem(a, b));
				break;
			case 6:
				System.out.println(a+" ^ "+b+" = "
						+ Operacoes.potencia(b, a));
				break;
			case 7:
				System.out.println("Raiz no �ndice "+b+" de"
						+ " "+a+" = "
						+ Operacoes.raiz(a, b));
				break;
			case 8:
				System.out.println("Novo valor de A:");
				a = ler.nextInt();
				System.out.println("Novo valor de B:");
				b = ler.nextInt();
			default:
				System.out.println("Opera��o inv�lida,"
						+ " por favor digite novamente.");
			}
		}
	}
}
