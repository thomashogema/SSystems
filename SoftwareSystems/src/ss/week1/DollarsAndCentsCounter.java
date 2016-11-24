package ss.week1;

public class DollarsAndCentsCounter {
	
	private int dollars;
	private int cents;
	
		
	public int dollars(){
		return dollars;		
	}
	
	public int cents(){
		return cents;
	}
	
	public void add(int dollars, int cents){
		if(dollars >=0 && cents >=0){
			this.dollars = dollars + this.dollars;
			
			while (cents + this.cents >= 100){
				this.dollars++;
				cents = cents - 100;
				System.out.println("while uitgeoverd");
			} 
			this.cents = this.cents + cents;
		} else {
			System.err.println("Negatieve waarde ingevoerd");
	}

}
	public void reset(){
		dollars = 0;
		cents = 0;
	}
}
