package Invoice;
import java.util.Scanner;

public class Invoice 
{
  private String  Partno;
  private String partdescription;
  private int itemqyt;
  private double price;



public Invoice() {
	super();
	// TODO Auto-generated constructor stub
}

public Invoice(String partno, String partdescription, int itemqyt, double price) {
	super();
	Partno = partno;
	this.partdescription = partdescription;
	this.itemqyt = itemqyt;
	this.price = price;
}

public String getPartno() {
	return Partno;
}

public void setPartno(String partno) {
	Partno = partno;
}

public String getPartdescription() {
	return partdescription;
}

public void setPartdescription(String partdescription) {
	this.partdescription = partdescription;
}

public int getItemqyt() {
	return itemqyt;
}

public void setItemqyt(int itemqyt) {
	this.itemqyt = itemqyt;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public void Invoiceamount()
{
	System.out.println("invoiceamount= "+itemqyt*price);
}
public void acceptinvoice()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Partno= ");
	this.Partno=sc.nextLine();
	System.out.println("Enter partdescription= ");
	this.partdescription=sc.nextLine();
	if(itemqyt<=0)
	{
	   this.setItemqyt(0);
	}
	System.out.println("Enter item quantity= ");
	this.itemqyt=sc.nextInt();
	if(price<=0) 
	{
		this.setPrice(0.0);
	}	
	System.out.println("Enter price= ");
	this.price=sc.nextDouble();
			
}

public void displayinvoice()
{
	System.out.println("partrno="+Partno+","+"partdescription="+partdescription+","+"itemqyt="+itemqyt+","+"price= "+price);
}
}

  
  
  
