public class MenuInfantil extends Menu {
	private String seleccionRegalo;

	public MenuInfantil() {
		super();
	}

	public MenuInfantil(String seleccionPrincipal, String seleccionBebida, String seleccionPostre, String seleccionRegalo,
			double totalImporte) {
		super(seleccionPrincipal, seleccionBebida, seleccionPostre, totalImporte);
		this.seleccionRegalo = seleccionRegalo;
	}

	public String getSeleccionRegalo() {
		return seleccionRegalo;
	}

	public void setSeleccionRegalo(String seleccionRegalo) {
		this.seleccionRegalo = seleccionRegalo;
	}
	
	

	
	
	
}
