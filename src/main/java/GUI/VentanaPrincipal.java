package GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Teclado.EscucharTeclas;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	private Herramientas herramientas;
	private MuestraTrastes muestraTrastes;
	EscucharTeclas a;
	
	/**
	 * Constructora de la clase VentanaPrincipal
	 */
	public VentanaPrincipal() {
		super("Calcula trastes");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(280, 380);
		this.setLocationRelativeTo(null);
		
		a = new EscucharTeclas();
		this.addKeyListener(a);

		iniGUI();
		setFocusable(true);
		this.setVisible(true);
	}
	
	/**
	 * Inicializa la GUI y añade los elementos al JFrame.
	 */
	public void iniGUI() {
		Controller cntrl = new Controller();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		this.setContentPane(mainPanel);
		this.muestraTrastes = new MuestraTrastes(cntrl);
		JPanel t = this.muestraTrastes.panel();		
		mainPanel.add(t, BorderLayout.CENTER);
		this.herramientas = new Herramientas(cntrl, this. muestraTrastes);
		JPanel h = this.herramientas.panel();	
		mainPanel.add(h, BorderLayout.NORTH);
		
	}
	
}
