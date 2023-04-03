package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("Teste 1 by id ");
		
		Seller seller = sellerDao.findByid(3);

	
	
	
		System.out.println("\n Teste3  seller findall");
		
		List<Seller> list = sellerDao.findAll();
		for (Seller obj3 :list) {
			System.out.println(obj3);
		}
	
	}

}
