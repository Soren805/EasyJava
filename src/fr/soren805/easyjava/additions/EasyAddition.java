package fr.soren805.easyjava.additions;

public class EasyAddition {
	
	private int result = 0;
	private int totResult = 0;
	private String msg = null;
	
	public int doAdd(int a, int b) {
		totResult = result = a + b;
		this.msg = "Result for " + a + " + " + b + " = " + result;
		System.out.println(msg);
		return totResult;
	}
	
	public void changeAddResult(String msg) {
		this.msg = msg;
	}

}
