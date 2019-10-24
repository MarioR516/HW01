package src;

import java.util.ArrayList;
import java.util.List;

public class Dice {
	private final int MAX= 6;   // Maximum face value
	private int faceValue;		// current value on the die
	public static List<String> sides;
	
	// Constructor that initializes face value and ArrayList
	public Dice(int value) {
		faceValue = value;
		sides = new ArrayList<>();
	}
	
	// roll function that rolls the die and returns result
	public int roll() {
		
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}
	
	// mutator setFaceValue that converts Integer value to String
	public void setFaceValue(String value) {
		value = String.valueOf(faceValue);
	}
	
	// A face value accessor
	public int getFaceValue() {
		return faceValue;
		
	}
	
	// returns a string of the dice
	public String toString() {	
		String result = Integer.toString(faceValue);
		return result;
	}
	
	// Creates five die objects by adding values to the array sides
	// and rolls them
	public void RollDice(String[] args){
		
		sides.add("Invertebrate");
		sides.add("Seed");
		sides.add("Fish");
		sides.add("Fruit");
		sides.add("Rodent");
		sides.add("Invertebrate_Seed");
		
		Dice die = new Dice(6);
		
		for (int k = 0; k < sides.size(); k++) {
			int x = die.roll();
			switch(x) {
				case 1:
					die.setFaceValue("Invertebrate");
					break;
				case 2:
					die.setFaceValue("Seed");
					break;
					
				case 3:
					die.setFaceValue("Fish");
					break;
					
				case 4:
					die.setFaceValue("Fruit");
					break;
					
				case 5:
					die.setFaceValue("Rodent");
					break;
					
				case 6:
					die.setFaceValue("Invertebrate_Seed");
			}
		}
	}
}
