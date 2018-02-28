
public class Item {

	private String description;
	private int value;
	private double hst;

	public Item(String description, int value) {
		this.description = description;
		this.value = value;
	}

	public Item() {
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setHst(double hst) {
		this.hst = hst;
	}

	@Override
	public String toString() {
		return this.description + " $" + this.value + " + HST$" + String.format("%.2f", this.hst) + " = TOTAL: $"
				+ (this.value + this.hst);
	}

}
