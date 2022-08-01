package Frame;

public class Shop {
	int price;
	String name;
	int count;
	String coodiInfo;
	String image;

	public Shop(String name, int price, String coodiInfo) {
		this.price = price;
		this.name = name;
		this.coodiInfo = coodiInfo;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCoodiInfo() {
		return coodiInfo;
	}

	public void setCoodiInfo(String coodiInfo) {
		this.coodiInfo = coodiInfo;
	}

	public void minusCount(int count) {
		this.count -= count;
	}

	@Override
	public String toString() {
		return "< " + name + " > °¡°Ý : " + price + "¿ø";
	}

}
