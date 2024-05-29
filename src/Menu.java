public class Menu {
	private String seleccionPrincipal;
	private String seleccionBebida;
	private String seleccionPostre;
	private double totalImporte;
	
	public Menu() {
		super();
	}
	

	public Menu(String seleccionPrincipal, String seleccionBebida, String seleccionPostre, double totalImporte) {
		this.seleccionPrincipal = seleccionPrincipal;
		this.seleccionBebida = seleccionBebida;
		this.seleccionPostre = seleccionPostre;
		this.totalImporte = totalImporte;
	}
	

	public String getSeleccionPrincipal() {
		return seleccionPrincipal;
	}

	public void setSeleccionPrincipal(String seleccionPrincipal) {
		this.seleccionPrincipal = seleccionPrincipal;
	}

	public String getSeleccionBebida() {
		return seleccionBebida;
	}

	public void setSeleccionBebida(String seleccionBebida) {
		this.seleccionBebida = seleccionBebida;
	}

	public String getSeleccionPostre() {
		return seleccionPostre;
	}

	public void setSeleccionPostre(String seleccionPostre) {
		this.seleccionPostre = seleccionPostre;
	}


	public double getTotalImporte() {
		return totalImporte;
	}

	public void setTotalImporte(double totalImporte) {
		this.totalImporte = totalImporte;
	}
	
}