package ficheroBinario;

public class Ventas {
	private String cliente;
	private int codigoProducto;
	private int unidadesVendidas;
	private double precioUnitario;

	public Ventas(String cliente, int codigoProducto, int unidadesVendidas, double precioUnitario) {
		this.cliente = cliente;
		this.codigoProducto = codigoProducto;
		this.unidadesVendidas = unidadesVendidas;
		this.precioUnitario = precioUnitario;
	}
	
	

	public Ventas(String cliente) {
		this.cliente = cliente;
	}



	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

}
