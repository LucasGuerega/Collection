package model;

public class dvd {
	private String Titulo;
	private String SubTitulo;
	private String Formato;
	private int Duração;
	private String Genero;
	private String Classificacao;
	private int Volume;

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getSubTitulo() {
		return SubTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		SubTitulo = subTitulo;
	}

	public String getFormato() {
		return Formato;
	}

	public void setFormato(String formato) {
		Formato = formato;
	}

	public int getDuração() {
		return Duração;
	}

	public void setDuração(int duração) {
		Duração = duração;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getClassificacao() {
		return Classificacao;
	}

	public void setClassificacao(String classificacao) {
		Classificacao = classificacao;
	}

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		Volume = volume;
	}

}
