package BuilderDesignPattern.WithOptionalParams;

public class Product {

	// Mandatory :-
	private String name;
	private int price;
	// Optional :-
	private String location;
	private String hashCode;

	private Product(Builder b) {
		this.name = b.getName();
		this.price = b.getPrice();
		this.location = b.getLocation();
		this.hashCode = b.getHashCode();
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getLocation() {
		return location;
	}

	public String getHashCode() {
		return hashCode;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		// Mandatory :-
		private String name;
		private int price;
		// Optional :-
		private String location;
		private String hashCode;

		public Product build() {
			if (this.name == null || this.name.length() == 0) {
				throw new RuntimeException("Please enter valid name");
			}
			if (this.price <= 0) {
				throw new RuntimeException("Please enter valid price");
			}
			return new Product(this);

		}

		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public int getPrice() {
			return price;
		}

		public Builder setPrice(int price) {
			this.price = price;
			return this;
		}

		public String getLocation() {
			return location;
		}

		public Builder setLocation(String location) {
			if (location == null || location.length() == 0) {
				throw new RuntimeException("Please enter valid Location");
			}
			this.location = location;
			return this;
		}

		public String getHashCode() {
			return hashCode;
		}

		public Builder setHashCode(String hashCode) {
			if (hashCode == null || hashCode.length() == 0) {
				throw new RuntimeException("Please enter valid HashCode");
			}
			this.hashCode = hashCode;
			return this;
		}
	}
}
