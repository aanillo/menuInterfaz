import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame extends JFrame {
	
	private JButton btnMenuAdulto;
	private JButton btnMenuInfantil;
	private JButton btnSalir;
	private Menu[] menus = new Menu[12];
	private int numMenus = 0;
	private double importeTotal = 0;
	             
	public Frame() {
		super("Elige una opción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		
		btnMenuAdulto = new JButton("Menú adulto");
		URL url = getClass().getResource("/images/icono_menu.png");
        ImageIcon icon = new ImageIcon(url);
        btnMenuAdulto.setIcon(icon);
        btnMenuAdulto.setHorizontalTextPosition(SwingConstants.CENTER);
        btnMenuAdulto.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnMenuAdulto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameMenu menu = new FrameMenu();
            }
        });
        add(panel, BorderLayout.CENTER);
        panel.add(btnMenuAdulto, BorderLayout.WEST);
        
        btnMenuInfantil = new JButton("Menú infantil");
		URL url2 = getClass().getResource("/images/icono_menu_infantil.png");
        ImageIcon icon2 = new ImageIcon(url2);
        btnMenuInfantil.setIcon(icon2);
        btnMenuInfantil.setHorizontalTextPosition(SwingConstants.CENTER);
        btnMenuInfantil.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnMenuInfantil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameMenuInfantil menu = new FrameMenuInfantil();
            }
        });
        panel.add(btnMenuInfantil, BorderLayout.EAST);
       
        
        JPanel panelSalir = new JPanel();
        add(panelSalir, BorderLayout.SOUTH);
        ManejadorEventos manejador = new ManejadorEventos();
        btnSalir = new JButton("Finalizar operaciones");
        btnSalir.addActionListener(manejador);
        panelSalir.add(btnSalir);
        
		
		setVisible(true);
	}
	
	private class ManejadorEventos implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
        	Object obj=evento.getSource();
			if(obj==btnSalir){	
				int totalMenus = 0;
	        	importeTotal = 0;
	        	
	        	for (Menu m : FrameMenu.getMenu()) {
	        		totalMenus++;
	        		importeTotal += m.getTotalImporte();
	        	}
	        	
	        	for (MenuInfantil m : FrameMenuInfantil.getMenu()) {
	        		totalMenus++;
	        		importeTotal += m.getTotalImporte();
	        	}
	        	
	        	JOptionPane.showMessageDialog(null, "Número total de menús: " + totalMenus + "\nImporte total: " + importeTotal + " €", "Información", JOptionPane.INFORMATION_MESSAGE);
	        	System.exit(0);
			} 
        }
    } 
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
	}

}
