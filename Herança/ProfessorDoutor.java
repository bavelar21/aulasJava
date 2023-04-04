
public class ProfessorDoutor extends Professor {
	private String obtencaoTitulo;
	private String instituicaoDoutorado;
	
	
	
	public String getObtencaoTitulo() {
		return obtencaoTitulo;
	}
	public void setObtencaoTitulo(String obtencaoTitulo) {
		this.obtencaoTitulo = obtencaoTitulo;
	}
	public String getInstituicaoDoutorado() {
		return instituicaoDoutorado;
	}
	public void setInstituicaoDoutorado(String instituicaoDoutorado) {
		this.instituicaoDoutorado = instituicaoDoutorado;
	}
	
	public String toString() {
		String str = super.toString() + "Ano de obtenção do título: " + obtencaoTitulo + "\n" +
					 "Instituição do Doutorado: " + instituicaoDoutorado + "\n";
		return str;
	}

}
