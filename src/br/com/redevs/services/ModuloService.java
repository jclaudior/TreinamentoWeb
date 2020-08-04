package br.com.redevs.services;

import java.util.ArrayList;
import java.util.List;

import br.com.rdevs.model.Modulo;
import br.com.redevs.dao.ModuloDAO;

public class ModuloService {
	public  List<Modulo> listar(){
		List<Modulo> listaModulo =  new ArrayList<Modulo>();
		try{
			ModuloDAO moduloDAO = new ModuloDAO();
			listaModulo = moduloDAO.consultarModulos();
		}catch(Exception e){
			e.printStackTrace();
		}
		return listaModulo;
	}
}
