package cursojava.classesexecutaveis;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
						   // 0   1    2
		double[] valores = {8.5,9.6,100.0};
		String[] teste = {"teste","9.8","7","contado"};
		String[] valoress = new String[4];
		
		//exemplos de tipo de array abaixo
		int[] inteiro = new int[10];
		float[] floate = new float[10];
		
		valoress[0] = "alex";
		valoress[1] = "90";
		valoress[2] = "teste 3 posicao";
		valoress[3] = "9.5";
	
		for (int pos = 0; pos < valoress.length; pos++) {
			
			System.out.println("Valor na posição " + (pos + 1) + " é = " + valoress[pos]);
		}
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter? ");
		
		//Array pode ser de todos os tipos de dados e objetos tbém
		//Array sempre deve ter a quantidade de posições definidas
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		/*notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;*/
		
		for (int pos = 0; pos < notas.length; pos++) {
			
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + (pos + 1));
			notas[pos] = Double.valueOf(valor);
			
		}
		
		for (int pos = 0; pos < notas.length; pos++) {
			
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
	}

}
