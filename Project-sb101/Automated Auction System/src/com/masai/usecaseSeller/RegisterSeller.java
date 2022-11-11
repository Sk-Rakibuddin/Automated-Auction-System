package com.masai.usecaseSeller;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImp;



public class RegisterSeller {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Seller Name:");
		String sname= sc.next();
		
		
		System.out.println("Enter Seller Email:");
		String email= sc.next();
		
		System.out.println("Enter Seller password:");
		String password= sc.next();
		
		
		SellerDao dao=new SellerDaoImp();
		
		
		
	    String result=dao.registerSeller(sname, email, password);
	    
	    System.out.println(result);

	}

}