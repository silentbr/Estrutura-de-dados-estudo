package javap;

public class controle {
	public int soma(int N) {
		if (N <= 0) { //parada se N == 0 ou negativo
			return 0;
		} else {
			return N + soma(N - 1); //os passos ficaram definidos para somar N ao numero anterior
		}
	}
}
