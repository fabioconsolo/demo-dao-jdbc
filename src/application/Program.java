package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Department obj = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("Teste 1 by id ");
		
		Seller seller = sellerDao.findByid(3);

	
	
	
		System.out.println("\n Teste 3  seller findall");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, obj);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
		System.out.println("Enter id for delete:");
		int id =sc.nextInt();
		sellerDao.deleteByid(id);
		System.out.println("Delete completed");
		sc.close();
	}

	
	
}
