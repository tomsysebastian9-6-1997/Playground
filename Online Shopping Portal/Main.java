public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Users us = new Users();
      Customers cu1=new Customers();
      Customers cu2=new Customers();
      Suppliers su1=new Suppliers();
      Suppliers su2=new Suppliers();
      cu1.displayProfileDetails("Saakshi",9000000000L);
      cu2.displayProfileDetails("Rahul",9000000001L);
      su1.displayProfileDetails("ABC Traders",8000000000L);
      su2.displayProfileDetails("XYZ Enterprises",8000000900L);
      cu1.editAddress("Saakshi","Bangalore");
      cu1.editAddress("Saakshi","Coimbatore");
      su1.editAddress("ABC Traders","Mumbai");
      su1.editAddress("ABC Traders","Delhi");
      cu1.placeOrder();
      su1.increaseStockLevel("ABC Traders",15);
      su2.increaseStockLevel("XYZ Enterprises",17);
    }	
}

class Users {
		//write the logic for the class Users	

}

class Customers extends Users{
		//write the logic for the class Customers
   int id,itemsStock;
 String name,shippingAddress,orderHistory,str,billingAddress,paymentStatus,dateOfBirth;
  float feedbackRating;
   char gender;
  long mobileNumber;
public void editAddress(String name,String shippingAddress)
 {
  this.name=name;
    this.shippingAddress=shippingAddress; 
    System.out.println(name+", "+shippingAddress);
    //System.out.println(name+", "+shippingAddress);
 }
public void placeOrder()
 {
  System.out.println("Order placed successfully!");
 }
  public void displayProfileDetails(String name,long mobileNumber)
  {
    this.name=name;
    this.mobileNumber=mobileNumber; 
    System.out.println(name+", "+mobileNumber);
  }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  long mobileNumber;
    String name,billingAddress;
int itemStock;
  public void editAddress(String name,String billingAddress)
 {
  this.name=name;
    this.billingAddress=billingAddress; 
    System.out.println(name+", "+billingAddress);
 }
 public void increaseStockLevel(String name,int itemStock)
 {
   this.name=name;
   this.itemStock=itemStock;
   System.out.println(name+", "+itemStock);
 }
  public void displayProfileDetails(String name,long mobileNumber)
  {
    this.name=name;
    this.mobileNumber=mobileNumber; 
    System.out.println(name+", "+mobileNumber);
  }
}