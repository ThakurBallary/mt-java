package crudcollectionswithuserdefinedobjectsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagementSystem {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Product> productList = new ArrayList<Product>();
	Product p = null;
	public void addProduct(Product p) {
		productList.add(p);
	}
	public void showProducts() {
		System.out.println("List of products......");
		for(int i = 0;i<productList.size();i++) {
				System.out.println(productList.get(i).getProductId()
						+ "\t" + productList.get(i).getProductName()
						+ "\t" + productList.get(i).getProductPrice());
		}
	}
	public Product readProductDetails(Product p) {
		
		System.out.println("Enter the product details");
		System.out.println("Enter the product id");
		sc.nextLine();
		p.setProductId(sc.nextLine());
		System.out.println("Enter the product name");
		p.setProductName(sc.nextLine());
		System.out.println("Enter the product price");
		p.setProductPrice(sc.nextFloat());
		return p;
		
	}
	
	public Product findProductById(String pid) {
		Product p12 = new Product();
		for(int i = 0;i<productList.size();i++) {
			if((productList.get(i).getProductId().equals(pid))) {
				p12 = productList.get(i);
			}
		}
		return p12;
		
	}
	
	public String removeProduct(Product pr) {
		if(productList.remove(pr)) {
			return "Product removed successfully";
		}else {
			return "no product found to remove";
		}
	}
	
	public void sortProductsByPrice() {
		Collections.sort(productList,new PriceComparator());
		System.out.println("List of products......");
		for(int i = 0;i<productList.size();i++) {
				System.out.println(productList.get(i).getProductId()
						+ "\t" + productList.get(i).getProductName()
						+ "\t" + productList.get(i).getProductPrice());
		}
	}
	
	
	
	public void showProductOperations() {
		char ch = 'y';
		while (ch=='y') {
			
			System.out.println("Enter the Operation name to execute .....");
			System.out.println("1.to add product");
			System.out.println("2.list all products");
			System.out.println("3.to delete the product");
			System.out.println("4.to update product");
			System.out.println("5.to sort products by price");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				p = new Product();
				addProduct(readProductDetails(p));
				break;
			case 2:
				showProducts();
				break;
			case 3:
				System.out.println("Enter the product id to remove...");
				String pid = sc.next();
				Product p1 = findProductById(pid);
				System.out.println(removeProduct(p1));
				break;
			case 5:
				sortProductsByPrice();
				break;
			default:
				break;
			}
			
			System.out.println("do you want to continue....");
			ch = sc.next().charAt(0);
		}
	}
}
