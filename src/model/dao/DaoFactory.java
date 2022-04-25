package model.dao;

import db.DB;

public class DaoFactory {
	
	public static SellerDao createSelerDao() {
		return new SellerDaoJDBC(DB.getConn());
	}
}
