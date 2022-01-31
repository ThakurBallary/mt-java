package comparatorexample;

import java.util.Comparator;

public class NameComparator implements Comparator<Supplier>{

	@Override
	public int compare(Supplier s1, Supplier s2) {
		// TODO Auto-generated method stub
		return s1.getSupplierName().compareTo(s2.getSupplierName());
	}

}
