package aula_10;

/*Classe Pessoa é uma SUPERCLASSE outras classes que herdam e indentificadas como SUBCLASSE*/
public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;

	/* Declarando o construtor */
	public Pessoa() {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	/* GETTERS AND SETTERS */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/* Declarando metados */
	public void fazerAniversario() {
		this.idade++;

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
