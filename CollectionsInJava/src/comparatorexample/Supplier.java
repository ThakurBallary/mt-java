package comparatorexample;

import java.util.Comparator;

public class Supplier  {
	
	private int supplierId;
	private String supplierName;
	private String supplierMobNo;
	private String supplierCity;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Supplier(int supplierId, String supplierName, String supplierMobNo, String supplierCity) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierMobNo = supplierMobNo;
		this.supplierCity = supplierCity;
	}


	

	public int getSupplierId() {
		return supplierId;
	}



	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}



	public String getSupplierName() {
		return supplierName;
	}



	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}



	public String getSupplierMobNo() {
		return supplierMobNo;
	}



	public void setSupplierMobNo(String supplierMobNo) {
		this.supplierMobNo = supplierMobNo;
	}



	public String getSupplierCity() {
		return supplierCity;
	}



	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((supplierCity == null) ? 0 : supplierCity.hashCode());
		result = prime * result + supplierId;
		result = prime * result + ((supplierMobNo == null) ? 0 : supplierMobNo.hashCode());
		result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier other = (Supplier) obj;
		if (supplierCity == null) {
			if (other.supplierCity != null)
				return false;
		} else if (!supplierCity.equals(other.supplierCity))
			return false;
		if (supplierId != other.supplierId)
			return false;
		if (supplierMobNo == null) {
			if (other.supplierMobNo != null)
				return false;
		} else if (!supplierMobNo.equals(other.supplierMobNo))
			return false;
		if (supplierName == null) {
			if (other.supplierName != null)
				return false;
		} else if (!supplierName.equals(other.supplierName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierMobNo="
				+ supplierMobNo + ", supplierCity=" + supplierCity + "]";
	}




}
