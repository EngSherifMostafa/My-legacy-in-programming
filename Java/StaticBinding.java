/*
	object binding with static from declared class
	object binding with instance from initialized class
*/

import java.io.*;

class Main {
	public static void main (String[] args) {
		
		Parent pObj = new Parent();
		Child cObj = new Child();
		Parent pcObj = new Child();

		/********************************************************************/
		
		Parent.staticPrint();	// print "Parent Static"
		Child.staticPrint();	// print "Child Static"
		
		/********************************************************************/
		
		pObj.staticPrint();		// print "Parent Static"
		cObj.staticPrint();		// print "Child Static"
		pcObj.staticPrint();	// print "Parent Static" - static method hiding
		
		/********************************************************************/
		
		pObj.instancePrint();	// print "Parent Instance"
		cObj.instancePrint();	// print "Child Instance"
		pcObj.instancePrint();	// print "Child Instance"
    }
}

class Parent {
	static void staticPrint() {
		System.out.println("Parent Static");
    }
	
	void instancePrint() {
		System.out.println("Parent Instance");
	}
}

class Child extends Parent {
	static void staticPrint() {
		System.out.println("Child Static");
	}

	void instancePrint() {
	    System.out.println("Child Instance");
	}
}