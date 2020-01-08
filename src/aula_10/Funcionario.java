package aula_10;

public class Funcionario extends Pessoa {

	private String setor;
	private boolean trabalhando;

	/* Declarando construtor */
	public Funcionario() {
		this.setor = setor;
		this.trabalhando = trabalhando;
	}

	/* GETTERS AND SETTERS */
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	/* Declarando metado */
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;

	}

}
