
public class TesteHeranca {
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Junior Santos");
		p1.setCpf("546.898.741-36");
		p1.setSexo('M');
		
		System.out.println("Pessoa \n" + p1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Larissa");
		a1.setCpf("785.456.352-89");
		a1.setSexo('F');
		a1.setCurso("Medicina");
		a1.setAnoIngresso(2024);
		
		System.out.println("Aluno \n" + a1.toString());
		
		Professor prof = new Professor();
		prof.setNome("Alex");
		prof.setCpf("735.459.452-89");
		prof.setSexo('M');
		prof.setDepartamento("Exatas");
		prof.setAnoAdmissao(2019);
		
		System.out.println("Professor \n" + prof.toString());
		
		ProfessorDoutor prod = new ProfessorDoutor();
		prod.setNome("Junior");
		prod.setCpf("135.959.352-12");
		prod.setSexo('M');
		prod.setDepartamento("Exatas");
		prod.setAnoAdmissao(2019);
		prod.setInstituicaoDoutorado("Positivo");
		prod.setObtencaoTitulo("Mestrado");
		
		System.out.println("Professor Doutor \n" + prod.toString());
	}

}
