package streammethods;

import java.util.Objects;

public class LapPrice {
	int price;

	public LapPrice(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LapPrice other = (LapPrice) obj;
		return price == other.price;
	}
	
	

}
