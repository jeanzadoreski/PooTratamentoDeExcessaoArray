package cursojava.classesexecutaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Jdev - treinamento");
		aluno.setNomeEscola("Jdev - Treinamento");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("54ghfff5gff4");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("administra��o");
		secretario.setNumeroCpf("05285274958");
		secretario.setIdade(18);
		secretario.setNome("Jo�o");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + "- " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno � : " + aluno.salario());
		System.out.println("Salario do diretor � : " + diretor.salario());
		System.out.println("Salario do secretario � : " + secretario.salario());
		
		Pessoa pessoa = new Aluno();
		pessoa = secretario;
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() 
		+ " e o sal�rio � de : " + pessoa.salario());
	}
}
