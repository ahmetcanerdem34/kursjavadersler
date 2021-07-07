package DAY_33_encopsulation;

public class E03 {
	
	private int num=12;
	private String name="Emine";
	private char Initial='J';
	private boolean old=true;//yaþlý mý anlamý nda
	
	
	//bu class da set ve get methodlarýna sahip olduðumuz için bu class a ful encapsulation diyebilir miyiz
	//diyemeyiz çünkü initial in get ve set i yok
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//datatype boolean olduðunda getter() methodunun ismi GET ile deðil is ile baþlar--- set te sorun yok ondaki boolean yine set
	public boolean isOld() {
		return old;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
			

}
