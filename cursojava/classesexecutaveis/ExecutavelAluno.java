package cursojava.classesexecutaveis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.javadoc.ThrowsTag;

import cursojava.excessao.ExcessaoProcessarNotas;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class ExecutavelAluno {
	public static void main(String [] args) {
		
		try {
			//lerArquivos();
			//try {
				//File fil = new File("c://lines.txt");  // um teste pra uma excessao
				//Scanner scanner = new Scanner(fil);
			//}catch (FileNotFoundException e) {
		//		throw new ExcessaoProcessarNotas(e.getMessage());
		//	}
			
		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");
		
		//Secretario secretario = new Secretario(); // trabalhando diretamente com o objeto
	//	PermitirAcesso secretario = new Secretario();
	//	secretario.setLogin(login);
	//	secretario.setSenha(senha); // metodo mais fácil de fazer a autenticação diretamento com o objeto secretario
		
		//PermitirAcesso permitirAcesso = new Secretario(login, senha); // Vou travar o contrato somente quem realmente tem o contrato legitimo
		
	//	if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { // se true acessa senão não acessa  // secretario tbém pode autenticar
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tbém*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
	/*	List<Aluno> alunosRecuperacao = new ArrayList<Aluno>(); //acima tem uma outra forma de usar as listas
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>(); */
		
		for (int qtd = 1; qtd <=1 ; qtd++) { // quantidade de alunos
			/*Aluno ainda não existe na memória*/
			Aluno aluno1;
			/*new Aluno() é uma instancia (Criação de objeto)*/
			aluno1 = new Aluno() ;
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno? " +qtd);
			String idade = JOptionPane.showInputDialog("Qual a idade? ");
			String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
			String rg = JOptionPane.showInputDialog("Qual o RG? ");
			String cpf = JOptionPane.showInputDialog("Qual o cpf? ");
			String mae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
			String pai = JOptionPane.showInputDialog("Qual o nome do pai? ");
			String dtMatriula = JOptionPane.showInputDialog("Qual a data da matricula? ");
			String serie = JOptionPane.showInputDialog("Qual a serie? ");
			String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? "); 
			
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(dtMatriula);
			aluno1.setSerie(serie);
			aluno1.setNomeEscola(nomeEscola); 
			
			
		/*	aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
			aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
			aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
			aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
			aluno1.getDisciplina().setDisciplina1(disciplina1);
			aluno1.getDisciplina().setDisciplina2(disciplina2);
			aluno1.getDisciplina().setDisciplina3(disciplina3);
			aluno1.getDisciplina().setDisciplina4(disciplina4); 
			Disciplina disciplina01 = new Disciplina();  
			disciplina01.setDisciplina("Banco de dados");
			disciplina01.setNota(9);
			aluno1.getDisciplina().add(disciplina01);
			
			Disciplina disciplina02 = new Disciplina();
			disciplina02.setDisciplina("estrutura de dados");
			disciplina02.setNota(8);
			aluno1.getDisciplina().add(disciplina02);
			
			Disciplina disciplina03 = new Disciplina();
			disciplina03.setDisciplina("java web");
			disciplina03.setNota(8);
			aluno1.getDisciplina().add(disciplina03);
			
			Disciplina disciplina04 = new Disciplina();
			disciplina04.setDisciplina("algoritimos");
			disciplina04.setNota(7);
			aluno1.getDisciplina().add(disciplina04);*/
			
			for (int pos = 1; pos <= 4; pos++) { // quantidade de disciplina por aluno
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " +pos+ " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " +pos+ " ?");
				Disciplina disciplina02 = new Disciplina();
				disciplina02.setDisciplina(nomeDisciplina);
				disciplina02.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplina().add(disciplina02);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			if (escolha == 0) {
				int posicao = 1;
				while (escolha == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover) - posicao);
				/*	for (int pos = 0; pos <= aluno1.getDisciplina().size(); pos++) {
						System.out.println(aluno1.getDisciplina().get(pos));
					}*/
					System.out.println("Média do aluno é = " + aluno1.getMediaNota());
					escolha = JOptionPane.showConfirmDialog(null, "Continuar a remover");
					posicao++;
				}
			}
	//		System.out.println("aqui o erro");
			alunos.add(aluno1);
		}	
		
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("jean")) { /*não mostrar o jean independe de maiusculo ou minusculo*/
				alunos.remove(aluno);
				break;
			}else {
					System.out.println("Aluno: " + aluno.getNome());
					System.out.println("Idade: " + aluno.getIdade());
					System.out.println("Data de nascimento: " + aluno.getDataNascimento());
					System.out.println("RG: " + aluno.getRegistroGeral());
					System.out.println("CPF: " + aluno.getNumeroCpf());
					System.out.println("Nome da mãe: " + aluno.getNomeMae()); 
					System.out.println("Nome do pai: " + aluno.getNomePai());
					System.out.println("Data da matricula: " + aluno.getDataMatricula());
					System.out.println("Nome da escola: " + aluno.getNomeEscola());
					System.out.println("Serie: " + aluno.getSerie()); 
					for (int pos = 0 ; pos <= 3; pos++) {
						System.out.println(aluno.getDisciplina().get(pos));
					}
					System.out.println("Média do aluno é = " + aluno.getMediaNota());
				//	System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
					System.out.println("Resultado 2 = " + (aluno.getAlunoAprovado2()));
					System.out.println("-----------------------------------------------------------------");
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("Data de nascimento: " + aluno.getDataNascimento());
			System.out.println("RG: " + aluno.getRegistroGeral());
			System.out.println("CPF: " + aluno.getNumeroCpf());
			System.out.println("Nome da mãe: " + aluno.getNomeMae()); 
			System.out.println("Nome do pai: " + aluno.getNomePai());
			System.out.println("Data da matricula: " + aluno.getDataMatricula());
			System.out.println("Nome da escola: " + aluno.getNomeEscola());
			System.out.println("Serie: " + aluno.getSerie()); 
			System.out.println("Suas materias são: ");
			/*for (int pos = 0 ; pos <= 3; pos++) {
				System.out.println(aluno.getDisciplina().get(pos));
			}*/
			for (Disciplina disciplina : aluno.getDisciplina()) {
				System.out.println(disciplina.getDisciplina());
			}
			System.out.println("Média do aluno é = " + aluno.getMediaNota());
		//	System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			System.out.println("Resultado 2 = " + (aluno.getAlunoAprovado2()));
			System.out.println("-----------------------------------------------------------------");
			
		}
		
		for (int pos = 0; pos < alunos.size(); pos++) { // trocar nome de objeto por outro nome de objeto 
			
			Aluno aluno = alunos.get(pos);
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(98);
				trocar.getDisciplina().add(disciplina);
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
				
			}
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("-----------------------------------------------------------");
			
		//	for (Disciplina disc : aluno.getDisciplina()) { outro jeito mais fácil de percorrer uma lista
			for (int posd = 0; posd < aluno.getDisciplina().size(); posd++) {
				Disciplina disc = aluno.getDisciplina().get(posd);//--------incrementado a mais no codigo com a nova forma de percorrer a lista
				System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
			}
			
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				//alunosAprovados.add(aluno);
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
			//	alunosRecuperacao.add(aluno);
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				//alunosReprovados.add(aluno);
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("------------------ Listas dos Aprovados -----------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno = " + aluno.getNome()+ "Resultado = " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
		}
		System.out.println("------------------ Listas dos Reprovados -----------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = " + aluno.getNome()+ "Resultado = " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
		}
		System.out.println("------------------ Listas dos Recuperação -----------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = " + aluno.getNome()+ "Resultado = " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
		}
		
		/*Agora temos um objeto real na memória*/
		/*aluno2 é uma referencia para o objeto Aluno*/
		Aluno aluno2 = new Aluno(); /*Aqui será o pedro*/
		Aluno aluno3 = new Aluno(); /*Aqui será o alex*/
		aluno3.setNome("alex"); 
		aluno2.setNome("pedro");
		aluno2.setIdade(32);
		aluno2.setDataNascimento("02/07/1989");
		aluno2.setRegistroGeral("111.111.111.11");
		aluno2.setNumeroCpf("222.222.222-22");
		aluno2.setNomeMae("claudia");
		aluno2.setNomePai("carlos");
		aluno2.setDataMatricula("11/06/2017");
		aluno2.setSerie("4");
		aluno2.setNomeEscola("max colin");
		
		Aluno aluno4 = new Aluno("Maria"); 
		Aluno aluno5 = new Aluno("Jean", 35);/*inicializando o construtor da classe*/
		
		JOptionPane.showMessageDialog(null, aluno2.getNome() + " " + aluno2.getIdade() + " " + aluno2.getDataNascimento() + " " + aluno2.getRegistroGeral() + " " + aluno2.getNumeroCpf() + " " + aluno2.getNomeMae() + " " + aluno2.getNomePai() + " " + aluno2.getDataMatricula() + " " + aluno2.getNomeEscola() + " " + aluno2.getSerie());
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString());/*toString Descrição do objeto na memória traz os valores de todos os atributos*/
		aluno = new Aluno();
		System.out.println(aluno);/*funciona com o sem o toString*/
		
		System.out.println(alunos.toString());
		Aluno aluno1 = new Aluno();
		aluno1 = new Aluno();
		aluno1.setNome("alex");
		
		aluno2 = new Aluno();
		aluno2.setNome("alex");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
			
		}else {
			System.out.println("Alunos não são iguais");
		}
		
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		}catch (NumberFormatException e) {
				StringBuilder saida = new StringBuilder();
				e.printStackTrace();// imprime erro no console
				
				for (int i = 0; i < e.getStackTrace().length; i ++) {
					
					saida.append("\n Classe do erro " + e.getStackTrace()[i].getClassName());
					saida.append("\n Metodo do erro " + e.getStackTrace()[i].getMethodName());
					saida.append("\n Linha do erro " + e.getStackTrace()[i].getLineNumber());
					saida.append("\n Class " + e.getClass().getName());

				}
				
				JOptionPane.showMessageDialog(null, "erro de conversão de numeros" + saida.toString());
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opaa um null pointer exception" + e.getClass());
		}catch (Exception
				e) {
			e.printStackTrace(); 
			JOptionPane.showMessageDialog(null, "erro da excessao customizadas : " + e.getClass().getName());
		}finally { //sempre é executado ocorrendo erro ou não
			//Finally sempre é usado qdo precisa executar um processo acontecendo erro ou não no sistema
			JOptionPane.showMessageDialog(null, "obrigado por aprender java comigo");
		}
	}
	public static void lerArquivos () throws ExcessaoProcessarNotas {
		try {
			File fil = new File("c://lines.txt");  // um teste pra uma excessao
			Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExcessaoProcessarNotas(e.getMessage());
		}
	}
}
