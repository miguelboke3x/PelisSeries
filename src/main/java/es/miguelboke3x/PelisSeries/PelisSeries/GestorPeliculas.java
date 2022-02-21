package es.miguelboke3x.PelisSeries.PelisSeries;

import java.util.ArrayList;

public class GestorPeliculas {
	public ArrayList<Pelicula> getPeliculas() {
		ArrayList<Pelicula> carteleras  = new ArrayList<Pelicula>();
		carteleras.add(new Pelicula("MUERTE EN EL NILO","https://www.cinesa.es/Manager/Peliculas/muerteenelnilo/cartelera.jpg", "SINOPSIS\r\n"
				+ "Vuelven las pesquisas del célebre detective Hércules Poirot (Kenneth Branagh). Esta vez, durante un viaje en crucero por el Nilo, Poirot deberá investigar el misterioso asesinato de una joven heredera sin explicación aparente.", 2022));
		carteleras.add(new Pelicula("UNCHARTED", "https://es.web.img2.acsta.net/c_310_420/pictures/22/01/13/15/49/5165456.jpg", "SINOPSIS\r\n"
				+ "Película no recomendada a menores de 12 años.\r\n"
				+ "Esta adaptación de la exitosa serie de videojuegos creada por Naughty Dog es una precuela de la saga, en descubriremos los detalles de cómo el joven cazarrecompensas Nathan Drake (Tom Holland) llegó conocer a su mentor y amigo Victor Sullivan (Mark Wahlberg).", 2022));
		carteleras.add(new Pelicula("SAW V","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQj24DgZotPYJS_AIW_sGY9DkuHkyzl-FatP50s84ft2ukQQ31G", "SINOPSIS\r\n"
				+ "Película no recomendada a menores de 18 años\r\n"
				+ " parece que Hoffman es el único heredero del poder del asesino del puzle. Pero no puede cometer más errores y debe eliminar toda amenaza. Las trampas se multiplican y se cierran, inexorablemente, como escrúpulos..",2008 ));
		carteleras.add(new Pelicula("HARRY POTTER Y EL MISTERIO DEL PRINCIPE","https://es.web.img2.acsta.net/c_310_420/medias/nmedia/18/67/05/06/19138964.jpg","sombra demoniaca de Voldemort se cierne cada vez más sobre el universo de los Muggle y el mundo de la magia. Hogwarts ha dejado de ser un remanso de paz, el peligro ronda en el corazón del castillo... Harry para su combate final,",2009));
		carteleras.add(new Pelicula("CENICIENTA","https://es.web.img3.acsta.net/c_310_420/pictures/14/11/19/16/01/398307.jpg","SINOPSIS: El clásico cuenta la historia de una hermosa joven que vive con su madrastra y las dos hijas de ésta. Ella es destinada a las más molestas tareas de la casa, hasta que un día acudirá al lugar un príncipe y la madrastra encerrará a la muchacha, mientras sus hijas se aprestan a conocer al recién llegado.", 2015));
		carteleras.add(new Pelicula("ALIEN","https://pasionporelcine.net/wp-content/uploads/2013/01/Poster-Alien-1979-critica-pel%C3%ADcula.jpg","Sinopsis\r\n"
				+ "De regreso a la Tierra, la nave de carga Nostromo interrumpe su viaje y despierta a sus siete tripulantes. El ordenador central, MADRE, ha detectado la misteriosa transmisión de una forma de vida desconocida, procedente de un planeta cercano aparentemente deshabitado. La nave se dirige entonces al extraño planeta para investigar el origen de la comunicación.", 1979));
		
		
		
		
		return carteleras;
	}

}
