package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("===Teste Seller Find By Id: ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n ===Teste Seller findByDepartment: ");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findByDepartment(department);
		for (Seller objseller : sellerList) {
			System.out.println(objseller);
		}

		System.out.println("\n ===Teste Seller findAll: ");
		sellerList = sellerDao.findAll();
		for (Seller objseller : sellerList) {
			System.out.println(objseller);
		}
		
		System.out.println("\n ===Teste Seller insertSeller: ");
		Seller newSeller = new Seller (null, "BOB", "teste@teste.com", new Date(), 5000.00,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido novo ID: "+ newSeller.getId());
	}

}
