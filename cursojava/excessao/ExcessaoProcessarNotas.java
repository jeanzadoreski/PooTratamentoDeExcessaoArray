package cursojava.excessao;
//teste
public class ExcessaoProcessarNotas extends Exception {
	
	public ExcessaoProcessarNotas(String erro) {
		super("vixx um erro no processamento do arquivo ao processar as notas do aluno" + erro);
	}

}
