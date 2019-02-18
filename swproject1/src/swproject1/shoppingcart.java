package swproject1;

public class shoppingcart {

	public shoppingcart() {
		prodcount=0;
	}
    public int prodcount;
	public int total_value;

	public void add(book bok) {
		prodcount+=bok.amount;
		total_value+= bok.price;
	}

}
