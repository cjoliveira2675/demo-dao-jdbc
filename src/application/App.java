package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findAll =====");
		List<Seller> listSelle = sellerDao.findAll();
		for (Seller obj : listSelle) {
			System.out.println(obj);
		}
		
		/*System.out.println("=== TEST 3: seller insert =====");
		seller = new Seller(null, "CJ", "cj@dev.com", new Date(), 3000.0, new Department(2, null));
		sellerDao.insert(seller);
		System.out.println("Inserted! new Id:" + seller.getId());

		System.out.println("=== TEST 4: seller update =====");
		seller = sellerDao.findById(8);
		seller.setName("Belle");
		seller.setEmail("belle@belle.com");
		sellerDao.update(seller);
		System.out.println("Updated seller "+seller);
		
		System.out.println("=== TEST 5: seller delete =====");
		seller = sellerDao.findById(9);
		sellerDao.deleteById(seller.getId());
		System.out.println("Deleted seller "+  seller.getName());*/
		
		System.out.println("\n=== TEST 1: department findById =====");
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll =====");
		List<Department> listDep = depDao.findAll();
		for (Department obj : listDep) {
			System.out.println(obj);
		}
		
		/*System.out.println("=== TEST 3: department insert =====");
		dep = new Department(null, "Utils");
		depDao.insert(dep);
		System.out.println("Inserted! new Id:" + dep.getId());
		
		System.out.println("=== TEST 4: department update =====");
		dep = depDao.findById(6);
		dep.setName("Pets");
		depDao.update(dep);
		System.out.println("Updated department "+dep);
		
		System.out.println("=== TEST 5: department delete =====");
		dep = depDao.findById(7);
		depDao.deleteById(dep.getId());
		System.out.println("Deleted department "+  dep.getName());*/
	}

}
