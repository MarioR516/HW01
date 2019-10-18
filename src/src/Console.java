package src;

import java.util.List;
import java.util.Scanner;

//// A console class to interact with the user
public final class Console { 
	public final static Scanner sc = new Scanner(System.in);
	
	public static int Range(String txt, int min, int max)
	{
        StringBuilder prompt = new StringBuilder(txt);
        prompt.append(" (");
        prompt.append(min);
        prompt.append('-');
        prompt.append(max);
        prompt.append("): ");
        System.out.print(prompt);
        return sc.nextInt();
	}
	
	public static <T> int getChoice(List<T> options)
	{
        System.out.println("\nOptions:");
        for (int choice = 0; choice < options.size(); choice++) {
            System.out.println(choice + ". " + options.get(choice));
        }
        return Console.Range("Enter an option", 0, options.size() - 1);
	}
			
}
