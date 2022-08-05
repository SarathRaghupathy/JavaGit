package org.testing;

public class PartAbstraction extends PartialAbstraction {

@Override
public void clientName() {
	System.out.println("Alison");	
}

@Override
public void clientLoc() {
	System.out.println("chennai");	
}

public static void main(String[] args) {
	PartAbstraction p = new PartAbstraction();
	
	p.clientId();
	p.clientLoc();
	p.clientName();
	
}

}
