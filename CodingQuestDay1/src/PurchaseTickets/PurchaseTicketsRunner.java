package PurchaseTickets;

import java.io.IOException;

public class PurchaseTicketsRunner {
	public static void main(String[] args) throws IOException {
		PurchaseTickets test = new PurchaseTickets("C:\\Users\\suvan\\Desktop\\CS3 labs\\CodingQuestDay1\\src\\PurchaseTickets\\data.dat");
		System.out.println(test.getCheapest());
		
	}
}
