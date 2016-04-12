import java.util.Random;
import java.util.Scanner;

public class diceRoll {
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");
		Scanner scan = new Scanner(System.in);
		int sides, roll1, roll2;
		System.out.print("Roll the dice? (y/n): ");
		String input = scan.nextLine();
		while (input.equalsIgnoreCase("y")) {						//creates loop for game as long as user agrees
			System.out.print("How many sides do the dice have?: "); //asks for input for number of sides
			sides = scan.nextInt();									//applies sides to use in rollDice method

			roll1 = rollDice(sides);								//rolls dice twice, stores value of rolls
			roll2 = rollDice(sides);								//in order to determine console comments

			System.out.println(roll1);
			System.out.println(roll2);								//prints the value of rolls and continues 
																	//if value to print if value is 'craps'
			if (roll1 + roll2 == 2) {								//'snake eyes' or 'box cars'
				System.out.println("SNAKE EYES!");
			} else if (roll1 == 6 && roll2 == 6) {
				System.out.println("BOX CARS");
			} else if (roll1 + roll2 == 11 || roll1 + roll2 == 7) {
				System.out.println("CRAPS!");
			}

			System.out.print("Roll again? (y/n): ");
			input = scan.next();
		}
		System.out.println("Thank you for playing!");
		scan.close();
	}

	public static int rollDice(int x) {
		int dice = random.nextInt(x) + 1;
		return dice;
	}
}
