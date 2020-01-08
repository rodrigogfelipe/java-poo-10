package aula_10;

public class Aula10 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Rodrigo");
		p2.setNome("Joana");
		p3.setNome("Francisco");
		p4.setNome("Dayse");
		
		p1.setSexo("M");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		p2.setCurso("Informatica");
		p3.setSalario(2.500f);
		p4.setSetor("Estoque");
		
		
		
		
	}

}
