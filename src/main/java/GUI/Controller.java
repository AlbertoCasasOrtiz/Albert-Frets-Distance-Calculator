package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {
	public final double SEMITONO = 1.059463094;
	double longitud;
	double proporcion;
	double traste;
	
	/**
	 * Calcula la proporción de la distancia entre los trastes.
	 * Utilizando la fórmula p = (l / (l - (l / RGS))) teniendo
	 * p = proporción.
	 * l = longitud de mastil.
	 * RGS = 1,059463094 (razón geométrica del semitono.) 
	 * @param prop = Variable donde se guardará la proporción.
	 * @return proporción = Proporción de la distancia entre los trastes.
	 */
	public double calculaProporción(Double prop) {
		try{
			proporcion = (prop / (prop - (prop / SEMITONO)));
		}
		catch (NumberFormatException e) {
			   System.err.println("No se puede convertir a numero");
			   e.printStackTrace();
		}
		return proporcion;
	
	}	
	
	/**
	 * Calcula la longitud de cada traste. Utilizando recursión.
	 * Utiliza la fórmula t = l / p  || l = l - t teniendo
	 * p = proporción. 
	 * l = longitud del traste-1 al mastil.
	 * t = longitud del traste.
	 * @param longitud = longitud del traste-1 al mastil.
	 * @param prop = proporción.
	 * @return tamaño = longitud del traste.
	 */
	public Double calculaTrastes(double longitud, double prop) {
		double tamaño = longitud / prop;
		this.longitud = longitud - tamaño;
		return tamaño;
	}
	
	/**
	 * Devuelve un mensaje de error en caso de introducir un valor no válido.
	 * @param titulo = título de la ventana.
	 * @param mensaje = mensaje que muestra la ventana.
	 */
	public void reportError(String titulo, String mensaje){
		JFrame report = new JFrame();
		JOptionPane.showMessageDialog(report, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
}
