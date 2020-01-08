package aula_10;

public class Aluno extends Pessoa {

	private int mat;
	private String curso;

	/* Declarando construtor */
	public Aluno() {
		this.mat = mat;
		this.curso = curso;
	}

	/* GETTERS AND SETTERS */
	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	/* Declarando metados */
	public void cancelarMatricula() {
		System.out.println("Matricula será cancelada");

	}

}
