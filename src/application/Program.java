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

		System.out.println(seller);
		System.out.println("\n Teste 2 seller findbyDepartment");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj2 :list) {
			System.out.println(obj2);
		}
	}

}
