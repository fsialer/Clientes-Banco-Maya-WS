package com.bancomaya.clientes.factorymethod.dao;

import java.util.List;

import com.bancomaya.clientes.factorymethod.entity.TarjetaDigital;

public interface TarjetaDigitalDAO {
	public TarjetaDigital guardarTarjetaDigital(TarjetaDigital tarjetaDigital);
	
	public List<TarjetaDigital> obtenerTarjetaDigitales();
	
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta);
	
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombre);
}
