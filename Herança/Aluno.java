
public class Aluno extends Pessoa {
	private String curso;
	private int anoIngresso;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String cpf, char sexo, String curso, int anoIngresso) {
		super (nome, cpf, sexo);
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public String toString() {
		String str = super.toString() +  
					 "Curso: " + curso + "\n" +
					 "Ano de ingresso: " + anoIngresso;
		return str;
	}
	
	
}
