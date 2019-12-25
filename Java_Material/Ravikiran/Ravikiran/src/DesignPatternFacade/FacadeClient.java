package DesignPatternFacade;

public class FacadeClient {
	
	public static void main (String arg[])
	
	{
		designProducer dp = new designProducer();
		dp.getModel1Design();
		dp.getModel2Design();
		dp.getModel3Design();	
	}

}
