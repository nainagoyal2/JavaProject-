package oop.InterfaceDemo;


//Multiple inhertiance
public  class NobleHS implements IMA, USMA{

	@Override
	public void physio() {
		System.out.println("NobleHS..........physio()");
		
	}

	@Override
	public void cardio() {
		System.out.println("NobleHS..........Cardio()");
		
	}
	
	public void medical()
	{
		System.out.println("NobleHS..........Medicals()");
	}

	@Override
	public void nero() {
		
		System.out.println("NobleHS..........nero()");
		
	}

	@Override
	public void dental() {
		System.out.println("NobleHS..........dental()");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("NoblesHS......covidTest19()");
		
	}

	



}
