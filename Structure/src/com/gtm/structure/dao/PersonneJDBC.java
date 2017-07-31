package com.gtm.structure.dao;

//import java.sql.SQLException;
//import java.sql.Statement;

import com.gtm.structure.metier.Personne;

/**
 * Classe DAO
 * @author malbranche
 * @version 1.0
 *
 */
public class PersonneJDBC {

	public void ajouterPersonne(Personne p) {
		
		System.out.println("J'ajoute la personne " + p + " en base de données");
	}
	
	public void modifierPersonne(Personne p) {
				
		System.out.println("Je modifie la personne " + p + " en base de données");
	}
	
	public void supprimerPersonne(Personne p) {
		
		System.out.println("Je supprime la personne " + p + " de la base de données");		
	}
	
	public Personne lirePersonne(Personne p) {
		
		System.out.println("Je lis la personne " + p + " en base de données");
		
		return p;
	}
	
	// con is a Connection object and dbName is the name of the database
	
//	  To execute the SQL query, such as those specified by the String createString, use a Statement object. To create a Statement object, call the method Connection.createStatement from an existing Connection object. To execute a SQL query, call the method Statement.executeUpdate.
//
//All Statement objects are closed when the connection that created them is closed. However, it is good coding practice to explicitly close Statement objects as soon as you are finished with them. This allows any external resources that the statement is using to be released immediately. Close a statement by calling the method Statement.close. Place this statement in a finally to ensure that it closes even if the normal program flow is interrupted because an exception (such as SQLException) is thrown.
//
//Note: You must create the SUPPLIERS table before the COFFEES because COFFEES contains a foreign key, SUP_ID that references SUPPLIERS.
//	  
//	 
//	public void createTable() throws SQLException {
//	    String createString =
//	        "create table " + dbName +
//	        ".SUPPLIERS " +
//	        "(SUP_ID integer NOT NULL, " +
//	        "SUP_NAME varchar(40) NOT NULL, " +
//	        "STREET varchar(40) NOT NULL, " +
//	        "CITY varchar(20) NOT NULL, " +
//	        "STATE char(2) NOT NULL, " +
//	        "ZIP char(5), " +
//	        "PRIMARY KEY (SUP_ID))";
//
//	    Statement stmt = null;
//	    try {
//	        stmt = con.createStatement();
//	        stmt.executeUpdate(createString);
//	    } catch (SQLException e) {
//	    	System.out.println(e);
//	    } finally {
//	        if (stmt != null) { stmt.close(); }
//	    }
//	}	
	
}
