package Excepciones;

@SuppressWarnings("serial")
public class LongitudNegativa extends Error{
	
	/**
	 * Constructor de la escepci�n LongitudNegativa.
	 * @param s = Mensaje de la Excepci�n.
	 */
	public LongitudNegativa(String s) {
		super(s);
	}

}
