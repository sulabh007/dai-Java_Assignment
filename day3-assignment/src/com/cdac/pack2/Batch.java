package com.cdac.pack2;

public class Batch {
	private int BatchStrength;
	private String CourceName;
	public Batch()
	{
		this.BatchStrength=000;
		CourceName="xxx";
	}
	public Batch( String CourceName, int bathcstrength)
	{
		this.CourceName=CourceName;
		this.BatchStrength=bathcstrength;
		System.out.println("Batch [ CourceName = " + CourceName + ", BatchStrength = " + BatchStrength+"]");
	}

}
