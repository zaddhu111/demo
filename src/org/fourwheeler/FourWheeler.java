package org.fourwheeler;

import org.allvehicle.Vehicle;
import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;

public class FourWheeler {
	private void car() {
		System.out.println("List of Four Wheelers are : Car");
	}
	private void bus() {
		System.out.println("                          : Bus");
	}
	private void lorry() {
		System.out.println("                          : Lorry");
	}
	
	public static void main(String[] args) {
		Vehicle V = new Vehicle();
		V.vehicleNecessery();
		TwoWheeler T = new TwoWheeler();
		T.bike();
		T.cycle();
		ThreeWheeler W = new ThreeWheeler();
		W.Auto();
		FourWheeler F = new FourWheeler();
		F.car();
		F.bus();
		F.lorry();
	}

}
