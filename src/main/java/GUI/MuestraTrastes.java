package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MuestraTrastes {
	JLabel traste1, traste2, traste3, traste4, traste5, traste6, traste7, 
	traste8, traste9, traste10, traste11, traste12, traste13, traste14, 
	traste15, traste16, traste17, traste18, traste19, traste20;
	
	JTextField valor1, valor2, valor3, valor4, valor5, valor6, valor7, 
	valor8, valor9, valor10, valor11, valor12, valor13, valor14, valor15, 
	valor16, valor17, valor18, valor19, valor20;

	Controller cntrl;
	
	/**
	 * Constructor de la clase MuestraTrastes.
	 * @param cntr = controlador.
	 */
	public MuestraTrastes(Controller cntr){
		this.cntrl = cntr;
		inicializaTrastes();
		inicializaValores();
	}

	/**
	 * Crea el panel de herramientas, contiene los objetos y los listeners.
	 * @return panel = panel que contiene los elementos y listeners.
	 */
	public JPanel panel() {
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder(""));	
		GridBagConstraints c = new GridBagConstraints();
		
		c.insets = new Insets(4, 4, 4, 4);
		c.fill = GridBagConstraints.BOTH;
		
		///////////
		//TRASTES//
		///////////
		c.gridy = 0; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste1 ,c);
		
		c.gridy = 1; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste2 ,c);
		
		c.gridy = 2; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste3 ,c);
		
		c.gridy = 3; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste4 ,c);
		
		c.gridy = 4; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste5 ,c);
		
		c.gridy = 5; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste6 ,c);
		
		c.gridy = 6; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste7 ,c);
		
		c.gridy = 7; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste8 ,c);
		
		c.gridy = 8; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste9 ,c);
		
		c.gridy = 9; c.gridx = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste10 ,c);
		
		c.gridy = 0; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste11 ,c);
		
		c.gridy = 1; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste12 ,c);
		
		c.gridy = 2; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste13 ,c);
		
		c.gridy = 3; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste14 ,c);
		
		c.gridy = 4; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste15 ,c);
		
		c.gridy = 5; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste16 ,c);
		
		c.gridy = 6; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste17 ,c);
		
		c.gridy = 7; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste18 ,c);
		
		c.gridy = 8; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste19 ,c);
		
		c.gridy = 9; c.gridx = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.traste20 ,c);
		

		c.anchor = GridBagConstraints.CENTER;
		c.ipadx = 60;
		
		///////////
		//VALORES//
		///////////
		c.gridy = 0; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor1 ,c);
		
		c.gridy = 1; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor2 ,c);
		
		c.gridy = 2; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor3 ,c);
		
		c.gridy = 3; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor4 ,c);
		
		c.gridy = 4; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor5 ,c);
		
		c.gridy = 5; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor6 ,c);
		
		c.gridy = 6; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor7 ,c);
		
		c.gridy = 7; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor8 ,c);

		c.gridy = 8; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor9 ,c);
		
		c.gridy = 9; c.gridx = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor10 ,c);

		c.gridy = 0; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor11 ,c);

		c.gridy = 1; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor12 ,c);

		c.gridy = 2; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor13 ,c);

		c.gridy = 3; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor14 ,c);

		c.gridy = 4; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor15 ,c);

		c.gridy = 5; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor16 ,c);

		c.gridy = 6; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor17 ,c);

		c.gridy = 7; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor18 ,c);

		c.gridy = 8; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor19 ,c);

		c.gridy = 9; c.gridx = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(this.valor20 ,c);
		panel.setVisible(true);

		return panel;
	}
	
	/**
	 * Método auxiliar a la constructora que inicializa los JLabel.
	 */
	public void inicializaTrastes() {
		this.traste1 = new JLabel("Traste 1:");
		this.traste2 = new JLabel("Traste 2:");
		this.traste3 = new JLabel("Traste 3:");
		this.traste4 = new JLabel("Traste 4:");
		this.traste5 = new JLabel("Traste 5:");
		this.traste6 = new JLabel("Traste 6:");
		this.traste7 = new JLabel("Traste 7:");
		this.traste8 = new JLabel("Traste 8:");
		this.traste9 = new JLabel("Traste 9:");
		this.traste10 = new JLabel("Traste 10:");
		this.traste11 = new JLabel("Traste 11;");
		this.traste12 = new JLabel("Traste 12:");
		this.traste13 = new JLabel("Traste 13:");
		this.traste14 = new JLabel("Traste 14:");
		this.traste15 = new JLabel("Traste 15:");
		this.traste16 = new JLabel("Traste 16:");
		this.traste17 = new JLabel("Traste 17:");
		this.traste18 = new JLabel("Traste 18:");
		this.traste19 = new JLabel("Traste 19:");
		this.traste20 = new JLabel("Traste 20:");
	}
	
	/**
	 * Método auxiliar a la constructora que inicializa los JTextField.
	 */
	public void inicializaValores() {
		this.valor1 = new JTextField();
		this.valor1.setEditable(false);	
		this.valor1.setBorder(BorderFactory.createEmptyBorder());	
		this.valor2 = new JTextField();
		this.valor2.setEditable(false);
		this.valor2.setBorder(BorderFactory.createEmptyBorder());	
		this.valor3 = new JTextField();
		this.valor3.setEditable(false);
		this.valor3.setBorder(BorderFactory.createEmptyBorder());	
		this.valor4 = new JTextField();
		this.valor4.setEditable(false);	
		this.valor4.setBorder(BorderFactory.createEmptyBorder());	
		this.valor5 = new JTextField();
		this.valor5.setEditable(false);
		this.valor5.setBorder(BorderFactory.createEmptyBorder());	
		this.valor6 = new JTextField();
		this.valor6.setEditable(false);	
		this.valor6.setBorder(BorderFactory.createEmptyBorder());	
		this.valor7 = new JTextField();
		this.valor7.setEditable(false);	
		this.valor7.setBorder(BorderFactory.createEmptyBorder());	
		this.valor8 = new JTextField();
		this.valor8.setEditable(false);
		this.valor8.setBorder(BorderFactory.createEmptyBorder());	
		this.valor9 = new JTextField();
		this.valor9.setEditable(false);	
		this.valor9.setBorder(BorderFactory.createEmptyBorder());	
		this.valor10 = new JTextField();
		this.valor10.setEditable(false);
		this.valor10.setBorder(BorderFactory.createEmptyBorder());	
		this.valor11 = new JTextField();
		this.valor11.setEditable(false);	
		this.valor11.setBorder(BorderFactory.createEmptyBorder());	
		this.valor12 = new JTextField();
		this.valor12.setEditable(false);
		this.valor12.setBorder(BorderFactory.createEmptyBorder());	
		this.valor13 = new JTextField();
		this.valor13.setEditable(false);
		this.valor13.setBorder(BorderFactory.createEmptyBorder());	
		this.valor14 = new JTextField();
		this.valor14.setEditable(false);
		this.valor14.setBorder(BorderFactory.createEmptyBorder());	
		this.valor15 = new JTextField();
		this.valor15.setEditable(false);
		this.valor15.setBorder(BorderFactory.createEmptyBorder());	
		this.valor16 = new JTextField();
		this.valor16.setEditable(false);
		this.valor16.setBorder(BorderFactory.createEmptyBorder());	
		this.valor17 = new JTextField();
		this.valor17.setEditable(false);
		this.valor17.setBorder(BorderFactory.createEmptyBorder());	
		this.valor18 = new JTextField();
		this.valor18.setEditable(false);	
		this.valor18.setBorder(BorderFactory.createEmptyBorder());	
		this.valor19 = new JTextField();
		this.valor19.setEditable(false);
		this.valor19.setBorder(BorderFactory.createEmptyBorder());	
		this.valor20 = new JTextField();
		this.valor20.setEditable(false);
		this.valor20.setBorder(BorderFactory.createEmptyBorder());	
	}

}
