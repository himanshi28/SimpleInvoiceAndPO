import java.util.Scanner;

public class Main implements Financials {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		Financials financials = new Main(); // Interface object
		Client client = new Client();

		System.out.println("Enter the client name:");
		client.setName(reader.nextLine());

		System.out.println("Enter number of items:");
		int numItems = Integer.parseInt(reader.nextLine());

		int count = 0;
		while (count < numItems) {

			// Creates a new object of type Item in each element of ArrayList during each
			// iteration
			client.items.add(new Item());

			System.out.println("Enter description of item #" + (count + 1) + ":");
			String description = reader.nextLine();
			client.items.get(count).setDescription(description);

			System.out.println("Enter value of item #" + (count + 1) + ":");
			int value = Integer.parseInt(reader.nextLine());
			client.items.get(count).setValue(value);

			double hst = financials.hst(value);
			client.items.get(count).setHst(hst);

			count++;
		}

		System.out.println();
		System.out.println();
		System.out.println("INVOICE NUMBER: " + client.getNumber());
		System.out.println("CLIENT NAME: " + client.getName());

		System.out.println();

		for (Item item : client.items) {
			System.out.println(item);
		}

	}

	// Interface method
	final double HST = 0.15;

	@Override
	public double hst(int value) {
		return value * HST;
	}

}
