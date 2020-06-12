package CheckOutPackage;

import java.util.Scanner;

public class CheckOutClass {
	
	void Checkout(int Price, int Items, int Last) {
		int TotalPrice=Price;
		int TotalItems= Items;
		int NoOfshop=Last;	
		
		if(TotalPrice >= 20000 && TotalItems > 10 || NoOfshop >= 5 && NoOfshop <=10 ) {
			System.out.println("You get 20% Discount");
		}
		if(TotalPrice < 20000 && TotalItems <= 10 ||  NoOfshop >= 1 && NoOfshop <4) {
			System.out.println("You get 10% Discount");
		}
		else
			System.out.println("You didn't get any discount");
	}
@SuppressWarnings({ "unused", "resource" })
public static void main(String args [])
{
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the total price of bill");
	int price =input.nextInt();
	System.out.println("Enter the total Number of items");
	int items =input.nextInt();
	System.out.println("Enter the Number Time you shop last month");
	int voucher =input.nextInt();
}
}
