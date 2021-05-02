package com.bancomaya.clientes;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService
public interface TarjetaDigitalService {
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjetaDigital);
	
	public List<TarjetaDigital> obtenerTarjetaDigitales();
	
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta);
	
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombre);
}
