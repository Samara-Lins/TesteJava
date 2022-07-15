
public interface Operacoes {
	
	public static double soma(double a,double b) {
		double soma = a + b;
		return soma;
	}
	
	public static double subtracao(double a,double b) {
		double subtracao = a - b;
		return subtracao;
	}
	
	public static double multiplicacao(double a,double b) {
		double produto = a * b;
		return produto;
	}
	
	public static double divisao(double a,double b) {
		double divisao = a / b;
		return divisao;
	}
	
	public static double porcentagem(double a,double b) {
		double porcentagem = a * b / 100;
		return porcentagem;
	}
	
	public static double potencia(double a,double b) {
		double potencia = Math.pow(a, b);
		return potencia;
	}
	
	public static double raiz(double a,double b) {
		double raiz = Math.pow(a, 1 / b);
		return raiz;
	}
	
}