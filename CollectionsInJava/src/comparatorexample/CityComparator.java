package comparatorexample;

import java.util.Comparator;

public class CityComparator implements Comparator<Supplier> {

	@Override
	public int compare(Supplier s1, Supplier s2) {
		// TODO Auto-generated method stub
		return s1.getSupplierCity().compareTo(s2.getSupplierCity());
	}

}
