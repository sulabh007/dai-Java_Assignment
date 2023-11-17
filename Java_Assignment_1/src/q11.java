//Write a program for matchstick game between the computer and the user.  
//Your program should ensure that the computer always wins. 
//Rules for the game are as follows:				
//a. There are 21 matchsticks									
//b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.					C. Player is given the chance to pick the sticks first then the computer picks the sticks.		d. Whoever is forced to pick up the last matchstick loses the game.
import java.util.Scanner;
public class q11 {

	public static void main(String[] args) {
		int choice=0, match=21, cc=0;
		Scanner sc = new Scanner(System.in);
		while(match>0) {
			if (match!= 1) {
				System.out.println("Enter your choice of matches to remove between 1 and 4 :");
				choice = sc.nextInt();
				cc = 5 - choice;
				System.out.println("Player Selected :"+choice);
				System.out.println("Computer Selected :"+cc);
				match = match - choice -cc;
				System.out.println("Remaning Matches:"+match);
			}
			else {
				System.out.println("Computer Won");
				break;
			}
		}
	}
}
