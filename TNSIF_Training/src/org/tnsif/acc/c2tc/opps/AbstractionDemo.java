package org.tnsif.acc.c2tc.opps;

public class AbstractionDemo {
	public static void main(String[] args) {
		MaheshDemo obj=new Ramesh();
		obj.calling();
		obj.aiIntegration();
		obj.satelliteComm();
		obj.healthMonitoring();
		
	}

}
abstract class MaheshDemo{
	void calling() {
		System.out.println("Phone is having calling feature");
	}
	abstract void aiIntegration();
	abstract void satelliteComm();
	abstract void healthMonitoring();
}
abstract class Suresh extends MaheshDemo{

	@Override
	void aiIntegration() {
		System.out.println("Phone is integrated with AIIntegration");
		
	}

	@Override
	abstract void satelliteComm(); 

	@Override
	abstract void healthMonitoring(); 	
}
class Ramesh extends Suresh{

	@Override
	void satelliteComm() {
		System.out.println("Phone is integrated with satelliteComm");
		
	}

	@Override
	void healthMonitoring() {
		System.out.println("Phone is integrated with healthMonitoring");
	}
	
}
