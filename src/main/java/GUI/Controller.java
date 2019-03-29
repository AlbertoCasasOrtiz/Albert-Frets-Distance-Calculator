package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {
	public final double SEMITONO = 1.059463094;
	double longitud;
	double proporcion;
	double traste;
	
	/**
	 * Calcula la proporci�n de la distancia entre los trastes.
	 * Utilizando la f�rmula p = (l / (l - (l / RGS))) teniendo
	 * p = proporci�n.
	 * l = longitud de mastil.
	 * RGS = 1,059463094 (raz�n geom�trica del semitono.) 
	 * @param prop = Variable donde se guardar� la proporci�n.
	 * @return proporci�n = Proporci�n de la distancia entre los trastes.
	 */
	public double calculaProporci�n(Double prop) {
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
	 * Calcula la longitud de cada traste. Utilizando recursi�n.
	 * Utiliza la f�rmula t = l / p  || l = l - t teniendo
	 * p = proporci�n. 
	 * l = longitud del traste-1 al mastil.
	 * t = longitud del traste.
	 * @param longitud = longitud del traste-1 al mastil.
	 * @param prop = proporci�n.
	 * @return tama�o = longitud del traste.
	 */
	public Double calculaTrastes(double longitud, double prop) {
		double tama�o = longitud / prop;
		this.longitud = longitud - tama�o;
		return tama�o;
	}
	
	/**
	 * Devuelve un mensaje de error en caso de introducir un valor no v�lido.
	 * @param titulo = t�tulo de la ventana.
	 * @param mensaje = mensaje que muestra la ventana.
	 */
	public void reportError(String titulo, String mensaje){
		JFrame report = new JFrame();
		JOptionPane.showMessageDialog(report, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
}
