package com.puzzle;

public class JavaMemoryPuzzlePolite {

	public static void main(String[] args) {
		JavaMemoryPuzzlePolite jmp = new JavaMemoryPuzzlePolite();
		jmp.f();

	}

	private final int dataSize = (int) (Runtime.getRuntime().maxMemory() * 0.6);

	public void f() {
		{
			System.out.println(dataSize);
			byte[] data = new byte[dataSize];
		}
		
		  /*for(int i = 0; i < 10; i++){
		 System.out.println("Please be so kind and release memory"); }*/
		 
		System.out.println(dataSize);
		byte[] data2 = new byte[dataSize];
	}

}
