package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class VentaCoche {

	private LocalDateTime fechaCompra;
	private Cliente cliente;
	private Vendedor vendedor;
	private Concesionario concesionari;

	public void vender(String NombresComprador, String cedula, LocalDateTime fechaCompra, String NombreVendedor,
			String CodigoVenta, String TipoCoche, String Concesionaria) {
		this.fechaCompra = LocalDateTime.now();
		Cliente clienteobj = new Cliente();
		clienteobj.setNombres(NombresComprador);
		clienteobj.setCedula(cedula);

		Vendedor vendedorobj = new Vendedor();
		vendedorobj.setNombreVendedor(NombreVendedor);
		vendedorobj.setIdentificadorVenta(CodigoVenta);

		Concesionario concesionariaobj = new Concesionario();
		concesionariaobj.setTipoCoche(TipoCoche);
		concesionariaobj.setNombreConcesionario(Concesionaria);
		this.concesionari = concesionariaobj;

		if (TipoCoche.equals("MAZDA")) {
			System.out.println();
			System.out.println("ESTA VENTA --");
			System.out.println("APLICA DESCUENTO");
		} else {
			System.out.println("No aplica descuento");
		}

		this.cliente = clienteobj;
		this.vendedor = vendedorobj;
		this.concesionari = concesionariaobj;

		this.GuardarVenta(this);
	}

	private void GuardarVenta(VentaCoche ventaCoche) {
		System.out.println("Guardando ventaa....");
		System.out.println(ventaCoche);
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Concesionario getConcesionari() {
		return concesionari;
	}

	public void setConcesionari(Concesionario concesionari) {
		this.concesionari = concesionari;
	}

	@Override
	public String toString() {
		return "VentaCoche [fechaCompra=" + fechaCompra + "," + cliente + "," + vendedor
				+ "," + concesionari + "]";
	}

}
