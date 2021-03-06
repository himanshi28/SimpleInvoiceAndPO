import java.util.ArrayList;
import java.util.Random;

public class Client {

	Random random = new Random();

	private String name;
	private int number;
	public ArrayList<Item> items;

	// Constructor which initializes an ArrayList of Class type Item when called,
	// also generates random invoice number
	public Client() {
		this.items = new ArrayList<Item>();
		this.number = invoiceGenerator();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return this.number;
	}

	// Random number generator for invoice number
	public int invoiceGenerator() {
		int i = 0;
		int invoiceNumber = 0;
		while (i < 6) {
			invoiceNumber += random.nextInt(100000);
			i++;
		}
		return invoiceNumber;

	}

}
