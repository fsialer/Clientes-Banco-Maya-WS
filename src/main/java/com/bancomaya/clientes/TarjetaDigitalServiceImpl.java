package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.factorymethod.dao.TarjetaDigitalDAO;
import com.bancomaya.clientes.factorymethod.dao.TarjetaDigitalDAOImpl;
import com.bancomaya.clientes.factorymethod.entity.TarjetaDigital;


@WebService(endpointInterface="com.bancomaya.clientes.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{
	
	TarjetaDigitalDAO dao = new TarjetaDigitalDAOImpl();
	
	private static List<TarjetaDigital> tarjetas=new ArrayList<TarjetaDigital>();

	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjetaDigital) {
		
//		  tarjetaDigital.setId(tarjetas.size()+1); 
//		  tarjetas.add(tarjetaDigital);
		 
		return dao.guardarTarjetaDigital(tarjetaDigital);
		
	}

	@Override
	public List<TarjetaDigital> obtenerTarjetaDigitales() {
//		return tarjetas;
		return dao.obtenerTarjetaDigitales();
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
