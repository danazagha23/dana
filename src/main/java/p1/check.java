package p1;

public class check {
private int total=0;
    
	public void add(int itemCount, int itemPrice) {
	     
		total+= (itemCount*itemPrice);
		
	}

	public int totalprice() {
		  
		return total;
	}

}