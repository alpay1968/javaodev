package start;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade orabı";

		Product product1 = new Product();
		// set value
		product1.setName("Delenghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		// set value
		product2.setName("Delenghi Kahve Makinesi");
		product2.setDiscount(6);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("image3.jpg");
		// get
		// System.out.println(product1.name);

		Product product3 = new Product();
		// set value
		product3.setName("Delenghi Kahve Makinesi");
		product3.setDiscount(5);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("image1.jpg");

		// get
		// System.out.println(product1.name);
		System.out.println("<ul>");
		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		IndivualCustomer indivualCustomer= new IndivualCustomer();
		indivualCustomer.setId(1);
		indivualCustomer.setPhone("05355545");
		indivualCustomer.setCustomerNumber("12345");
		indivualCustomer.setFirstName("Alpay");
		indivualCustomer.setLastName("bilgay");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("46545546");
		corporateCustomer.setTaxNumber("45645");
		corporateCustomer.setCustomerNumber("12321");
		
		Customer[]customers = {indivualCustomer,corporateCustomer};
		
		
		
	}

}
