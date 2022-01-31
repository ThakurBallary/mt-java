package comparatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import collectionswithuserdefinedobjects.Student;

public class SupplierMain {
	
	public static void main(String[] args) {
		ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
		
		supplierList.add(new Supplier(123,"Raj","36565656","Mumbai"));
		supplierList.add(new Supplier(124,"Rajesh","13231231","Vishakapatnam"));
		supplierList.add(new Supplier(121,"Raju","34242424","Hyderabad"));
		supplierList.add(new Supplier(122,"Ramu","45453535","Bangalore"));
		
		System.out.println("list of suppliers before sorting");
		Iterator<Supplier> supplierItr = supplierList.iterator();
		System.out.println("Supplier Data ..........");
		System.out.println("=========================================================================");
		System.out.println("SupplierId" + "\t" + "SupplierName" + "\t" +"SupplierCity");
		System.out.println("=========================================================================");

		while(supplierItr.hasNext()) {
			Supplier st11 = supplierItr.next();
			System.out.println(st11.getSupplierId()+ "\t\t" +st11.getSupplierName()+ "\t\t" +st11.getSupplierCity());
		}
		
		//System.out.println("data before  sorting ....." + studentData);
				Collections.sort(supplierList,new CityComparator());

		System.out.println("list of suppliers after sorting");
		Iterator<Supplier> supplierItr11 = supplierList.iterator();
		System.out.println("Supplier Data ..........");
		System.out.println("=========================================================================");
		System.out.println("SupplierId" + "\t" + "SupplierName" + "\t" +"SupplierCity");
		System.out.println("=========================================================================");

		while(supplierItr11.hasNext()) {
			Supplier st11 = supplierItr11.next();
			System.out.println(st11.getSupplierId()+ "\t\t" +st11.getSupplierName()+ "\t\t" +st11.getSupplierCity());
		}

		
		System.out.println("list of suppliers before sorting based on name..........");
		Iterator<Supplier> supplierItr123 = supplierList.iterator();
		System.out.println("Supplier Data ..........");
		System.out.println("=========================================================================");
		System.out.println("SupplierId" + "\t" + "SupplierName" + "\t" +"SupplierCity");
		System.out.println("=========================================================================");

		while(supplierItr123.hasNext()) {
			Supplier st11 = supplierItr123.next();
			System.out.println(st11.getSupplierId()+ "\t\t" +st11.getSupplierName()+ "\t\t" +st11.getSupplierCity());
		}
		
		//System.out.println("data before  sorting ....." + studentData);
				Collections.sort(supplierList,new NameComparator());

		System.out.println("list of suppliers after sorting");
		Iterator<Supplier> supplierItr121 = supplierList.iterator();
		System.out.println("Supplier Data ..........");
		System.out.println("=========================================================================");
		System.out.println("SupplierId" + "\t" + "SupplierName" + "\t" +"SupplierCity");
		System.out.println("=========================================================================");

		while(supplierItr121.hasNext()) {
			Supplier st11 = supplierItr121.next();
			System.out.println(st11.getSupplierId()+ "\t\t" +st11.getSupplierName()+ "\t\t" +st11.getSupplierCity());
		}

		
	}

}
