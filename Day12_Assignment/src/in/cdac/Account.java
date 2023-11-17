package in.cdac;

import java.io.Serializable;

public class Account implements Serializable
{
	private int acno;
	private String name;
	private double bal;
	
	public Account()
	{
		acno=0;
		name="xxx";
		bal=0;
	}
	public Account(int acno, String name, double bal)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", bal=" + bal + "]";
	}
	public int getAcno(){
		return acno;
	}
	public String getName(){
		return name;
	}
	public double getBal(){
		return bal;
	}
	public void setAcno(int acno1){
		this.acno=acno1;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setBal(double bal){
		this.bal=bal;
	}
	public void deposit(double amt) 
	{
		this.bal =this.bal + amt;
	}
	public void withdraw(double amt)
	{
		this.bal =this.bal - amt;
	}
		
}