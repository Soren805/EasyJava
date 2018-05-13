package fr.soren805.easyjava.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EasyMap {
	
	private String firstname = null;
	private String secondname = null;
	private String thirdname = null;
	
	private String msg = "This value doesn't exists!";
	
	public void createHashMap(String firstname, String secondname, String thirdname, Integer firstnum, Integer secondnum, Integer thirdnum) {
		Map<String, Integer> hm = new HashMap<>();
		
		hm.put(firstname, firstnum);
		hm.put(secondname, secondnum);
		hm.put(thirdname, thirdnum);
		
		this.firstname = firstname;
		this.secondname = secondname;
		this.thirdname = thirdname;
	}
	
	public void printHashMapValues() {
		System.out.println(firstname + ", " + secondname + ", " + thirdname);
	}
	
	public void printHashMapValue(String value) {
		if(value == firstname) {
			System.out.println(firstname);
		}else if(value == secondname) {
			System.out.println(secondname);
		}else if(value == thirdname) {
			System.out.println(thirdname);
		}else {
			System.out.println(msg);
		}
	}
	
	public void changeErrorMessage(String msg) {
		this.msg = msg;
	}

}
