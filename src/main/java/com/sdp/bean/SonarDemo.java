package com.sdp.bean;


public class SonarDemo {
	int a;
	int b;
	
	SonarDemo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void addition()
	{
		System.out.println("Addition: "+(a + b));
	}

	public static void main(String[] args) {
		
		SonarDemo add =new SonarDemo(10,20);
		add.addition();
		
	}

}
