
public class Serie {
	
	//Constantes
	final int TEMPORADAS = 3;
	
	//Atributos de clase
	private String titulo;
	private boolean entregado;
	private int temporadas;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.entregado = false;
		this.temporadas = TEMPORADAS;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	//Métodos de clase
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nTemporadas: " + temporadas + "\nGenero: " + genero + "\nCeador: " + creador + "\n";
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
}
