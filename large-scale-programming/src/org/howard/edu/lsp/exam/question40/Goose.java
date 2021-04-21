/**
 * 
 */
package org.howard.edu.lsp.exam.question40;

/**
 * @author bostic
 *
 */
public class Goose extends Animal implements Flying {

	@Override
	public void fly() {
		System.out.println("Goose flies.");
	}
	
	public void speak() {
		System.out.println("This Goose speaks.");
	}
	

	public void move() {
		System.out.println("The goose moves forward.");
	}

}
