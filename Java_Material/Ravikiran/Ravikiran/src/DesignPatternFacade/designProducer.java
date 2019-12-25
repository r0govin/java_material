package DesignPatternFacade;

public class designProducer 
{
 
	private Design Model1;
	private Design Model2;
	private Design Model3;
	
	public designProducer() {
		Model1 = new Model1();
		Model2 = new Model2();
		Model3 = new Model3();	
	}
	
	public void getModel1Design()
	{
		Model1.designFun();
	}
	
	public void getModel2Design()
	{
		Model2.designFun();
	}
	public void getModel3Design()
	{
		Model3.designFun();
	}

	
	
	
	
}
