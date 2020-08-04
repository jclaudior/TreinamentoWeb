package br.com.redevs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import br.com.rdevs.model.Modulo;


public class ModuloDAO {
	private java.sql.PreparedStatement st;
	private ResultSet rs;
	
	
	private String SQL_LISTAR="select ds_nome, ds_instrutor_titular, ds_instrutor_auxiliar, dt_inicio from tb_modulo";
	
	 
	public List<Modulo> consultarModulos() throws ParseException {
		List<Modulo> listaModulo = new ArrayList<Modulo>();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date date;
//		
//		Modulo modulo1 = new Modulo();
//		modulo1.setDsNome("NIVELAMENTO");
//		modulo1.setDsInstrutorTitular("Ivo");
//		modulo1.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-06-20");
//		modulo1.setDtInicio(date);
//		listaModulo.add(modulo1);
//		
//		Modulo modulo2 = new Modulo();
//		modulo2.setDsNome("HTML/CSS");
//		modulo2.setDsInstrutorTitular("Jonas");
//		modulo2.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-06-27");
//		modulo2.setDtInicio(date);
//		listaModulo.add(modulo2);
//				
//		Modulo modulo3 = new Modulo();
//		modulo3.setDsNome("JAVASCRIPT");
//		modulo3.setDsInstrutorTitular("Jonas");
//		modulo3.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-07-02");
//		modulo3.setDtInicio(date);
//		listaModulo.add(modulo3);
//		
//		Modulo modulo4 = new Modulo();
//		modulo4.setDsNome("POO");
//		modulo4.setDsInstrutorTitular("Ivo");
//		modulo4.setDsInstrutorAuxiliar("Leonardo");
//		date = dateFormat.parse("2020-07-11");
//		modulo4.setDtInicio(date);
//		listaModulo.add(modulo4);
//		
//		Modulo modulo5 = new Modulo();
//		modulo5.setDsNome("Java");
//		modulo5.setDsInstrutorTitular("Leonardo");
//		modulo5.setDsInstrutorAuxiliar("Ivo");
//		date = dateFormat.parse("2020-07-18");
//		modulo5.setDtInicio(date);
//		listaModulo.add(modulo5);
//		
//		Modulo modulo6 = new Modulo();
//		modulo6.setDsNome("DB");
//		modulo6.setDsInstrutorTitular("Leonardo");
//		modulo6.setDsInstrutorAuxiliar("Fabio");
//		date = dateFormat.parse("2020-07-24");
//		modulo6.setDtInicio(date);
//		listaModulo.add(modulo6);
//		
//		Modulo modulo7 = new Modulo();
//		modulo7.setDsNome("Aplicações Web");
//		modulo7.setDsInstrutorTitular("Fabio");
//		modulo7.setDsInstrutorAuxiliar("Ivo");
//		date = dateFormat.parse("2020-07-20");
//		modulo7.setDtInicio(date);
//		listaModulo.add(modulo7);
//		
//		Modulo modulo8 = new Modulo();
//		modulo8.setDsNome("Spring Boot");
//		modulo8.setDsInstrutorTitular("Fabio");
//		modulo8.setDsInstrutorAuxiliar("Ivo");
//		date = dateFormat.parse("2020-08-05");
//		modulo8.setDtInicio(date);
//		listaModulo.add(modulo8);
//		
//		Modulo modulo9 = new Modulo();
//		modulo9.setDsNome("Angular");
//		modulo9.setDsInstrutorTitular("Jonas");
//		modulo9.setDsInstrutorAuxiliar("Fabio");
//		date = dateFormat.parse("2020-08-05");
//		modulo9.setDtInicio(date);
//		listaModulo.add(modulo9);
		try(Connection conn = ConnectorMySqlDAO.getConnection();
			java.sql.PreparedStatement st = conn.prepareStatement(SQL_LISTAR); 
			ResultSet rs = st.executeQuery()){
			
			
			while(rs.next()) {
				Modulo modulo = new Modulo();
				modulo.setDsNome(rs.getString("ds_nome"));
				modulo.setDsInstrutorTitular(rs.getString("ds_instrutor_titular"));
				modulo.setDsInstrutorAuxiliar(rs.getString("ds_instrutor_auxiliar"));
				modulo.setDtInicio(rs.getDate("dt_inicio"));
				
				listaModulo.add(modulo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return listaModulo;
	}
}
