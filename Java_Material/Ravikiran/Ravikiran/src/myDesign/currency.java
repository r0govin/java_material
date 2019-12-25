package myDesign;

public interface currency {
        public void setSymbol();
}

class rupee implements currency {

	public void setSymbol() {
		System.out.println("Rs");		
	}
	
}

class SGUSD implements currency{
	
	public void setSymbol() {
		System.out.println("SGUSD");		
	}
	
}

class USD implements currency{
	
	public void setSymbol() {
		System.out.println("USD");		
	}
}