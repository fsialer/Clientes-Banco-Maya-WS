package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService(endpointInterface="com.bancomaya.clientes.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{
	
	private static List<TarjetaDigital> tarjetas=new ArrayList<TarjetaDigital>();

	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjetaDigital) {
		tarjetaDigital.setId(tarjetas.size()+1);
		tarjetas.add(tarjetaDigital);
		return tarjetaDigital;
	}

	@Override
	public List<TarjetaDigital> obtenerTarjetaDigitales() {
		
		return tarjetas;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
