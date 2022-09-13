package com.iq.model;

public class NetworkTest {
	public static void main(String[] args) {
		
//		Network air=new AirtelNetwork(); //tightly coupled
//		air.sms();
//		air.callRates();
//		air.dataPlans();
//		
//		Network jio=new JioNetwork();
//		jio.callRates();
		
		Container con=new Container();
		con.getNetwork("network");
	}

}
