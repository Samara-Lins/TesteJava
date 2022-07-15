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
					+ "[1] Soma\n[2] Subtração\n"+
					"[3] Multiplicação\n[4] Divisão\n"+
					"[5] Porcentagem\n[6] Potência\n"+
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
				System.out.println("Raiz no índice "+b+" de"
						+ " "+a+" = "
						+ Operacoes.raiz(a, b));
				break;
			case 8:
				System.out.println("Novo valor de A:");
				a = ler.nextInt();
				System.out.println("Novo valor de B:");
				b = ler.nextInt();
			default:
				System.out.println("Operação inválida,"
						+ " por favor digite novamente.");
			}
		}
	}
}
