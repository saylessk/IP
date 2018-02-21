import java.util.*;
public class Game {
		static int money;
		static String name;
		static Scanner in = new Scanner(System.in);
		static Random random = new Random();
		public static void main(String[] args) {
			System.out.println("Please enter your name...");
			name = in.nextLine();
			System.out.println("Welcome " + name + ".");
			money = 8000000;
			System.out.println("You have: $" + money);
			rollDice();
		}
		
		/* Boolean: True or false, 0 or 1, data types, 1 bit in size
		
			byte: 8-bit signed two's complement integer, used for saving memory in large arrays. Value -128 to 127
			
			char:
			short: 16-bit signed two's complement integer. used to save memory in large arrays, value -32,768 to 32,767
			
			int:  32-bit signed two's complement integer, value -2^31 to (2^31)-1
			
			long: a 64-bit two's complement integer. value -2^63 to (2^63)-1
			
			float: single-precision 32-bit IEEE 754 floating point. Use a float instead of double if you need to save memory in large arrays of floating point numbers.
				
			double: designed especially for scientific calculations, where approximation errors are acceptable. 64-bit
			
			variable: a piece of memory that can contain a data value.
		
		*/
		
		public static void rollDice() {
			System.out.println("You have: $" + money);
			System.out.println("What number would you like to bet on? (1-6)?");
			int betRoll = in.nextInt();
			System.out.println("How much would you like to bet?");
			int betMoney = in.nextInt();
			while (betMoney > money)
			{
				System.out.println("You don't have enough funds. You have: $" + money + "left. Please enter your bet.");
				betMoney = in.nextInt();
			}
			int dice;
			dice = random.nextInt(6)+1;
			if (betRoll == dice)
			{
				System.out.println("You won! You win: $" + betMoney*6 + "!");
				money += betMoney*6;
			}
			else {
				System.out.println("You lost!");
				money-=betMoney;
			}
			//Had to make 0 inclusive or else it will allow player to play without any money
			if (money <= 0)
			{
				System.out.println("You lost all of your money!");
			}
			else
			{
				rollDice();
			}
			
		}
	
	
	
	
	
}
