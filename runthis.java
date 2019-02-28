import java.util.Scanner;
public class runthis {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String the = sc.nextLine();
	switch(the) {
		case "Declan" : 
		case "Justin" :
		case "Ryan" :
			System.out.println("You are stupid");
			break;
		case "Sarah" :
			System.out.println("You arrr awesome");
			break;
		default :
			System.out.println("Get better at typing your name loser.");
	}

	}
}
