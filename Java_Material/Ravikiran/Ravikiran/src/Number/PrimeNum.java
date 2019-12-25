package Number;

public class PrimeNum {
	public static void main(String arg[]){
		
		PrimeNum pr = new PrimeNum();
		System.out.println("The number is prime: " + pr.checkPrime(4));
	}
	
	public boolean checkPrime(int val){
		for (int i = 2 ; i < val/2 ; i ++){
			if (val/i == 0) 
				return false;
		}
		return true ;
	}
}
