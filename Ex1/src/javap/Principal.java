package javap;
import javax.swing.*;
public class Principal {
	public static void main(String args[]) {
		int N; int soma;
		controle ctr = new controle();
		N = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de N"));
		soma = ctr.soma(N);
		JOptionPane.showMessageDialog(null, "a soma dos N primeiros numeros naturais foi de: " + soma);
	}

}
