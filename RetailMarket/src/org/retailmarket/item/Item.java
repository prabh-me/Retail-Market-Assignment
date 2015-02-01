package org.retailmarket.item;

import java.util.Scanner;

public class Item {

	String itemName=new String();
	String itemPrice=new String();
	String itemQuantity=new String() ;
	
	Item(){
		itemName=null;
		itemPrice=null;
		itemQuantity=null;
		
	}

	static int numberOfItems;
	public static void main(String[] args) {
		
		
		int i,k=0,count=0;
		float f1,f2,sumQuantity=0,sumTotal=0;
		String itemEntry=new String();
		Scanner market=new Scanner(System.in);
		
		System.out.println("Enter the total number of items to be added");
		numberOfItems=market.nextInt();
		 Item[] items=new Item[numberOfItems];	
		System.out.println("\nEnter the items in the following format in any order (All fields mandatory) \n -name <item name> \n " +
				"-price <item price> \n -quantity <item quantity> :\n");
		for(i=0;i<numberOfItems;)
		{  
			itemEntry=market.nextLine();
			if(k==count){
			items[i] = new Item();
			
			}
			if(itemEntry.startsWith("-name")) {
				
				items[i].itemName=itemEntry;
		
				count++;
			}
			if(itemEntry.startsWith("-price")) {
				
				items[i].itemPrice=itemEntry;
				count++;
			}
			if(itemEntry.startsWith("-quantity")) {
				
				items[i].itemQuantity=itemEntry;
				count++;
			}
			
			if(count==3)
			{
				i++;
				count=0;
				k=0;
				System.out.println("\n");
			}
		}
		
	System.out
			.println("-----------------------------------------------------------------------------------------");
	System.out.println("\t \tWelcome to Coop Retail Market");
	System.out
	.println("-----------------------------------------------------------------------------------------");
    System.out.println("Item Name \t   Price (Rs.) \t Quantity (Kg.) \t Total (P*Q) \n");
    try{
    	for(i=0;i<numberOfItems;i++)
    
    { 
    	System.out.print(items[i].itemName.substring(5) + " \t\t " + items[i].itemPrice.substring(6)
    			+ " \t \t "+ items[i].itemQuantity.substring(9));
    	 f1 = Float.parseFloat(items[i].itemPrice.substring(6));
    	 f2 = Float.parseFloat(items[i].itemQuantity.substring(9));
    	 System.out.println("\t\t\t "+f1*f2);
    }
    }
    catch(NullPointerException e){
    	System.out.println("Wrong input format, enter again");
    }
    for(i=0;i<numberOfItems;i++)
    {
    	sumQuantity=sumQuantity+Float.parseFloat(items[i].itemQuantity.substring(9));
    	f1 = Float.parseFloat(items[i].itemPrice.substring(6));
   	    f2 = Float.parseFloat(items[i].itemQuantity.substring(9));
    	sumTotal=sumTotal+ (f1*f2);
    }
    System.out
	.println("-----------------------------------------------------------------------------------------");
 
    System.out.println(" \t\t\t\t "+sumQuantity+" \t\t\t "+sumTotal);
		
		market.close();
		
	}
	
	
}
