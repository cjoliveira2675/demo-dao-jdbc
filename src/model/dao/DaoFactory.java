package model.dao;

public class DaoFactory {
	
	public static SellerDao createSelerDao() {
		return new SellerDaoJDBC();
	}
}
