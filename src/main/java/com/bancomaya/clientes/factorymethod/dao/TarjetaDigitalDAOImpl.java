package com.bancomaya.clientes.factorymethod.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bancomaya.clientes.factorymethod.DBFactory;
import com.bancomaya.clientes.factorymethod.IDBAdapter;
import com.bancomaya.clientes.factorymethod.entity.TarjetaDigital;



public class TarjetaDigitalDAOImpl implements TarjetaDigitalDAO{

	private IDBAdapter dbAdapter;

	public TarjetaDigitalDAOImpl() {
		dbAdapter = DBFactory.getDefaultDBAdapter();
	}

	
	@Override
	public TarjetaDigital guardarTarjetaDigital(TarjetaDigital tarjetaDigital) {
		Connection connection = dbAdapter.getConnection();

		try {
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO tarjetasDigitales (banco, cliente,numero,fechaVencimiento) VALUES (?,?,?,?)");
			
			statement.setString(1, tarjetaDigital.getBanco());
			statement.setString(2, tarjetaDigital.getCliente());
			statement.setString(3, tarjetaDigital.getNumero());
			statement.setString(4, tarjetaDigital.getFechaVencimiento());
			
			statement.executeUpdate();

			return tarjetaDigital;

		} catch (SQLException e) {
			e.printStackTrace();

			return tarjetaDigital;
		}
	}

	@Override
	public List<TarjetaDigital> obtenerTarjetaDigitales() {
		Connection connection = dbAdapter.getConnection();
		List<TarjetaDigital> tarjetasList = new ArrayList<>();

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT id, banco, cliente,numero,fechaVencimiento FROM tarjetasDigitales");

			ResultSet tarjetaResult = statement.executeQuery();

			while (tarjetaResult.next()) {
				tarjetasList.add(
						new TarjetaDigital(tarjetaResult.getInt(1), tarjetaResult.getString(2), tarjetaResult.getString(3), tarjetaResult.getString(4), tarjetaResult.getString(5)));
			}

			return tarjetasList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			
		}
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
