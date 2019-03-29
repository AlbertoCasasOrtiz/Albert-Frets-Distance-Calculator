package Excepciones;

@SuppressWarnings("serial")
public class LongitudNegativa extends Error{
	
	/**
	 * Constructor de la escepción LongitudNegativa.
	 * @param s = Mensaje de la Excepción.
	 */
	public LongitudNegativa(String s) {
		super(s);
	}

}
