package cursojava.classesexecutaveis;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
						  
		Aluno aluno = new Aluno();
		aluno.setNome("Jean Zadoreski");
		aluno.setNomeEscola("Dom Jaime");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		
		double[] notas = {8.6,7.5,8.9,7.4};  
		double[] notasLogica = {8.6,7.5,8.9,7.4};
		
		disciplina.setNota(notas);
		aluno.getDisciplina().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplina().add(disciplina2);
		
		Aluno[] arrayAluno = new Aluno[1];
		arrayAluno[0] = aluno;
		for (int posicao = 0; posicao < arrayAluno.length; posicao ++) {
			
			System.out.println("Nome do aluno: " + arrayAluno[posicao].getNome());
			
			for (Disciplina d : arrayAluno[posicao].getDisciplina() ) {
				System.out.println("Nome da disciplina: " + d.getDisciplina());
				for (int posNotas = 0; posNotas < d.getNota().length; posNotas ++) {
					System.out.println("A nota número : " + posNotas + " é igual = " + d.getNota()[posNotas]);
				}
			}
		}
		
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso = " + aluno.getNomeEscola());
		System.out.println("----------Disciplina do aluno ---------");
		for (Disciplina disc : aluno.getDisciplina()) {
			
			System.out.println("Disciplina : " + disc.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			double notaMax = 0.0;
			double notaMenor = 0.0;
			for (int pos = 0 ; pos < disc.getNota().length; pos++) {
				System.out.println("Nota = " + (pos+1) + " é igual = " + disc.getNota()[pos]);
				if (pos == 0) {
					notaMax = disc.getNota()[pos];
					notaMenor = disc.getNota()[pos];
				}else
					if (disc.getNota()[pos] > notaMax) {
						notaMax = disc.getNota()[pos];						
					}else
						if (disc.getNota()[pos] < notaMenor) {
							notaMenor = disc.getNota()[pos];
						}
			}
			System.out.println("A maior nota da disciplina = " + disc.getDisciplina() + " e de valor : " + notaMax);
			System.out.println("A menor nota da disciplina = " + disc.getDisciplina() + " e de valor : " + notaMenor);
		}
		
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
		double[] notass = new double[Integer.parseInt(posicoes)];
		
		/*notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;*/
		
		for (int pos = 0; pos < notass.length; pos++) {
			
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + (pos + 1));
			notass[pos] = Double.valueOf(valor);
			
		}
		
		for (int pos = 0; pos < notass.length; pos++) {
			
			System.out.println("Nota " + (pos + 1) + " é = " + notass[pos]);
		}
	
	
	}

}
