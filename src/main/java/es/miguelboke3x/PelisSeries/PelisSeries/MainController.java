package es.miguelboke3x.PelisSeries.PelisSeries;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value ="/")
	public String getHomepage() {
		return "home.html";
	}
	@RequestMapping(value = "/verPeliculas")
	public String getPaginaPeliculas(Model model) { 
			//Obtener los datos
			GestorPeliculas gp = new GestorPeliculas();
			ArrayList<Pelicula> peliculas = gp.getPeliculas();
			model.addAttribute("peliculas", peliculas);
			return "Pelis.html";
		}
	@RequestMapping(value = "/verSeries")
	public String getPaginaSeries() {
		return "Series.html";
		
	}
}