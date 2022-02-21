package es.miguelboke3x.PelisSeries.PelisSeries;

public class GestorSeries {
	private String urlImagen;
	private String titulo;
	private String sinopsis;
	private int anyoStreno;
	private String temporadas;
	public GestorSeries() {
	}
	public GestorSeries(String urlImagen, String titulo, String sinopsis, int anyoStreno, String temporadas) {
		this.urlImagen = urlImagen;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.anyoStreno = anyoStreno;
		this.temporadas = temporadas;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public int getAnyoStreno() {
		return anyoStreno;
	}
	public void setAnyoStreno(int anyoStreno) {
		this.anyoStreno = anyoStreno;
	}
	public String getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(String temporadas) {
		this.temporadas = temporadas;
	}
	
	
}
