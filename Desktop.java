package com.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop - desktopSize");

	}
	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
