package es.miguelboke3x.PelisSeries.PelisSeries;

public class Pelicula {
	private String titulo;
	private String urlImagen;
	private String sinopsis;
	private int anyoEstreno;
	

	public Pelicula() {
		super();
	}


	public Pelicula(String titulo, String urlImagen, String sinopsis, int anyoEstreno) {
		this.titulo = titulo;
		this.urlImagen = urlImagen;
		this.sinopsis = sinopsis;
		this.anyoEstreno = anyoEstreno;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getUrlImagen() {
		return urlImagen;
	}


	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}


	public String getSinopsis() {
		return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}


	public int getAnyoEstreno() {
		return anyoEstreno;
	}


	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}

	
	

	}