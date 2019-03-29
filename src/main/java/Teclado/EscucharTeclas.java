package Teclado;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EscucharTeclas extends JFrame implements KeyListener{
	JLabel ayuda1, ayuda2, ayuda3, ayuda4, ayuda5, ayuda6, ayuda7, ayuda8, ayuda9, ayuda10, ayuda11, ayuda12, ayuda13, ayuda14, ayuda15;
	JFrame frame;
	
	/**
	 * Constructora de la clase EscucharTeclas.
	 */
	public EscucharTeclas() {
		this.ayuda1 = new JLabel("Desarrollado por: Alberto Casas");
		this.ayuda2 = new JLabel("");
		this.ayuda3 = new JLabel("Inserte un valor mayor que 0.");
		this.ayuda4 = new JLabel("Todas las distancias se dan en cm.");
		this.ayuda5 = new JLabel("");
		this.ayuda6 = new JLabel("Calculamos la proporción usando");
		this.ayuda7 = new JLabel("la razón geométrica del semitono");
		this.ayuda8 = new JLabel("(1,059463094), y cada traste usando");
		this.ayuda9 = new JLabel("la fórmula del divisor constante.");
		this.ayuda10 = new JLabel("p = (l / (l - (l / 1,059463094)))");
		this.ayuda11 = new JLabel("(Ahora aplicamos recursión)");  
		this.ayuda12 = new JLabel("t = l / p  || l = l - t");
		this.ayuda13 = new JLabel("con p = proporción, l = longitud de mastil,");
		this.ayuda14 = new JLabel("t = longitud del traste");
		this.ayuda15 = new JLabel("");
	}
	
	/**
	 * @Override
	 * Indica que ocurre cuando se presiona una tecla y crea un frame.
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_F1) {
			this.frame = new JFrame("Ayuda");
			this.frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			this.frame.setResizable(false);
			this.frame.setSize(280, 380);
			this.frame.setLocationRelativeTo(null);
			this.frame.add(panel());
			this.frame.setVisible(true);
		}
	}
	
	/**
	 * Crea el panel con los objetos y los listeners.
	 * @return panel = panel que contiene los elementos y listeners.
	 */
	public JPanel panel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder(""));	
		GridBagConstraints c = new GridBagConstraints();
		
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 0;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda1, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 1;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda2, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 2;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda3, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 3;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda4, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 4;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda5, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 5;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda6, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 6;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda7, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 7;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda8, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 8;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda9, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 9;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda10, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 10;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda11, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 11;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda12, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 12;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda13, c);
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0; c.gridy = 13;
		c.gridwidth = 1; c.gridheight = 1;
		c.weightx = 1; c.weighty = 1;
		panel.add(ayuda14, c);
		


		panel.setVisible(true);
		
		return panel;
	}

	/**
	 * @Override
	 * Indica que ocurre cuando se suelta una tecla, en este caso no se usa.
	 */
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @Override
	 * Indica que ocurre cuando se pulsa una tecla, en este caso no se usa.
	 */
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}


