package DAY_33_encopsulation;

public class E03 {
	
	private int num=12;
	private String name="Emine";
	private char Initial='J';
	private boolean old=true;//ya�l� m� anlam� nda
	
	
	//bu class da set ve get methodlar�na sahip oldu�umuz i�in bu class a ful encapsulation diyebilir miyiz
	//diyemeyiz ��nk� initial in get ve set i yok
	
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
	
	
	//datatype boolean oldu�unda getter() methodunun ismi GET ile de�il is ile ba�lar--- set te sorun yok ondaki boolean yine set
	public boolean isOld() {
		return old;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
			

}
