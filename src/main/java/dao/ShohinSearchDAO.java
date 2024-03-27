package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.data.ShohinRecord;

public class ShohinSearchDAO {
	private final String URL ="jdbc:postgresql://localhost:5432/shop";
	private final String USER ="postgres";
	private final String PASSWORD ="root";
	
	public List<ShohinRecord> select(){
		List<ShohinRecord> shohinList = new ArrayList<>();
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try{
			Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
			
			
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}
}
