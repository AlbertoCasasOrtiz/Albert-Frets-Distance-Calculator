package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Teclado.EscucharTeclas;
import Excepciones.LongitudNegativa;

public class Herramientas {
	JButton calcula;
	JTextField inserta;
	JLabel longitud;
	Controller cntrl;
	MuestraTrastes mt;
	KeyListener a;
	
	/**
	 * Constructor de la clase Herramientas.
	 * @param cntr = controlador.
	 * @param mtr = objeto que contiene las celdas donde se guardarán los trastes.
	 */
	public Herramientas(Controller cntr, MuestraTrastes mtr) {
		this.calcula = new JButton("¡Calcula!");
		
		this.inserta = new JTextField();
		this.inserta.setEditable(true);
		this.inserta.setBorder(BorderFactory.createTitledBorder(""));	
		this.cntrl = cntr;
	
		this.mt = mtr;
		this.longitud = new JLabel("Longitud (cm):");
		
		this.a = new EscucharTeclas();
		
	}
	
	/**
	 * Crea el panel de herramientas, contiene los objetos y los listeners.
	 * @return panel = panel que contiene los elementos y listeners.
	 */
	public JPanel panel(){
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder(""));	
		GridBagConstraints c = new GridBagConstraints();
		
		//Insets: Separación entre elemento y borde.
		//Gridx: Posición x en el grid.
		//Gridy: Posicion y en el grid.
		//Gridwidth: Numero de celdas que ocupa a lo ancho.
		//Gridheight: Numero de celdas que ocupa a lo alto.
		//Weightx: Indica como se distribuye el espacio horizontal.
		//Heightx: Indica como se distribuye el espacio vertical.
		
		c.insets = new Insets(4, 4, 4, 4);
		c.anchor = GridBagConstraints.LINE_END;
		c.gridx = 0; c.gridy = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.longitud, c);
		
		this.longitud.addKeyListener(a);
		
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx = 1; c.gridy = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		c.ipadx = 60;
		panel.add(this.inserta, c);
		
		this.inserta.addKeyListener(a);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 1; 
		c.gridwidth = 2; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		c.ipadx = 20;
		panel.add(this.calcula, c);
		
		this.calcula.addKeyListener(a);
		
		this.inserta.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(Double.parseDouble(inserta.getText()) < 0)
						throw new LongitudNegativa("¡Inserta una longitud válida!");
					else{
						calculaListener();
					}
				}catch(NumberFormatException e) {
					cntrl.reportError("Longitud no valida.", "¡Inserta una longitud válida!");
				}catch(StringIndexOutOfBoundsException e){
					cntrl.reportError("Longitud no valida.", "¡Inserta una longitud válida!");
				}catch(LongitudNegativa e){
					cntrl.reportError("Longitud no valida.", e.getMessage());
				}
			}
		});
		
		
		this.calcula.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(Double.parseDouble(inserta.getText()) < 0)
						throw new LongitudNegativa("¡Inserta una longitud válida!");
					else{
						calculaListener();
					}
				}catch(NumberFormatException e) {
					cntrl.reportError("Longitud no valida.", "¡Inserta una longitud válida!");
				}catch(StringIndexOutOfBoundsException e){
					cntrl.reportError("Longitud no valida.", "¡Inserta una longitud válida!");
				}catch(LongitudNegativa e){
					cntrl.reportError("Longitud no valida.", e.getMessage());
				}
			}
		});
		
		panel.setVisible(true);
		return panel;
	}
	
	/**
	 * Método auxiliar a los listeners que calcula la longitud de cada traste.
	 */
	void calculaListener() {
		cntrl.longitud = Double.parseDouble(inserta.getText());
		cntrl.calculaProporción(Double.parseDouble(inserta.getText()));
		mt.valor1.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor2.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor3.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor4.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor5.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor6.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor7.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor8.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor9.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor10.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor11.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor12.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor13.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor14.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor15.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor16.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor17.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor18.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor19.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
		mt.valor20.setText(cntrl.calculaTrastes(cntrl.longitud, cntrl.proporcion).toString().substring(0,4) + " cm");
	}
	
}
