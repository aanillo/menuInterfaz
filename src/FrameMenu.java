import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameMenu extends JFrame {

	private static List<Menu> menu = new ArrayList<Menu>();
	private JComboBox principal;
	private JComboBox bebida;
	private JComboBox postre;
	private JLabel textoPrincipal;
	private JLabel textoBebida;
	private JLabel textoPostre;
	private JButton btnGuardar;
	
	
	public FrameMenu() {
		super("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		Map<String, Double> mapaPrincipal = new HashMap<String, Double>();
		mapaPrincipal.put("Entrecot", 15.0);
		mapaPrincipal.put("Pez espada", 12.0);
		mapaPrincipal.put("Carrillada", 10.0);
		mapaPrincipal.put("Dorada", 20.0);
		mapaPrincipal.put("Otros", 13.0);
		
		String[] keysPrincipal = mapaPrincipal.keySet().toArray(new String[0]);
		String[] itemsPrincipal = new String[keysPrincipal.length];
		
		for (int i = 0; i < keysPrincipal.length; i++) {
			itemsPrincipal[i] = keysPrincipal[i] + " - " + mapaPrincipal.get(keysPrincipal[i]);
		}

		JComboBox<String> comboBoxPrincipal = new JComboBox<>(itemsPrincipal);
		textoPrincipal = new JLabel("Principal");
		add(textoPrincipal);
		add(comboBoxPrincipal);
	
		
		
		Map<String, Double> mapaBebida = new HashMap<String, Double>();
		mapaBebida.put("Refresco", 1.0);
		mapaBebida.put("Vino", 1.5);
		mapaBebida.put("Otros", 2.0);
		
		
		String[] keysBebida = mapaBebida.keySet().toArray(new String[0]);
		String[] itemsBebida = new String[keysBebida.length];
		
		for (int i = 0; i < keysBebida.length; i++) {
			itemsBebida[i] = keysBebida[i] + " - " + mapaBebida.get(keysBebida[i]);
		}

		JComboBox<String> comboBoxBebida = new JComboBox<>(itemsBebida);
		textoBebida = new JLabel("Bebida");
		add(textoBebida);
		add(comboBoxBebida);
		
		
		Map<String, Double> mapaPostre = new HashMap<String, Double>();
		mapaPostre.put("Fruta", 2.0);
		mapaPostre.put("Helado", 3.5);
		mapaPostre.put("Otros", 4.0);
		
		
		String[] keysPostre = mapaPostre.keySet().toArray(new String[0]);
		String[] itemsPostre = new String[keysPostre.length];
		
		for (int i = 0; i < keysPostre.length; i++) {
			itemsPostre[i] = keysPostre[i] + " - " + mapaPostre.get(keysPostre[i]);
		}

		JComboBox<String> comboBoxPostre = new JComboBox<>(itemsPostre);
		textoPostre = new JLabel("Postre");
		add(textoPostre);
		add(comboBoxPostre);
		
		btnGuardar = new JButton("Guardar selección");
	    btnGuardar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String seleccionPrincipal = (String) comboBoxPrincipal.getSelectedItem();
	            String seleccionBebida = (String) comboBoxBebida.getSelectedItem();
	            String seleccionPostre = (String) comboBoxPostre.getSelectedItem();
	            
	            
	            double importePrincipal = Double.parseDouble(seleccionPrincipal.split(" - ")[1]);
	            double importeBebida = Double.parseDouble(seleccionBebida.split(" - ")[1]);
	            double importePostre = Double.parseDouble(seleccionPostre.split(" - ")[1]);

	            double totalImporte = importePrincipal + importeBebida + importePostre;


	            Menu nuevoMenu = new Menu(seleccionPrincipal, seleccionBebida, seleccionPostre, totalImporte);
	            menu.add(nuevoMenu);

	            
	            dispose(); 
	            Frame frame = new Frame(); 
	            frame.setVisible(true);
	        }
	    });

	    
	    add(btnGuardar);
		
		setVisible(true);
	}


	public static List<Menu> getMenu() {
		return menu;
		// TODO Auto-generated method stub
		
	}
}
