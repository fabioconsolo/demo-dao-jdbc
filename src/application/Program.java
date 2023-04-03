package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findByid(3);

		System.out.println(seller);
	}

}
