package fr.soren805.easyjava.print;

public class EasyPrint {
	
	@SuppressWarnings("unused")
	private String msg = null;
	
	public String print(String msg) {
		this.msg = msg;
		System.out.println(msg);
		return msg;
	}

	public void changeMsg(String msg) {
		this.msg = msg;
	}

}
