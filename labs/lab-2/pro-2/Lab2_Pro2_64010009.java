import java.util.Scanner;

public class Lab2_Pro2_64010009 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int player_action, computer_action;

		while (true) {

			System.out.print("scissor (0), rock (1), paper (2): ");
			player_action = scanner.nextInt();

			if (player_action >= 0 && player_action <= 2) break;
			System.out.println("ERROR: input out of range");
		}
		scanner.close();

		computer_action = (int) (Math.random() * 3);

		String player_str, computer_str, win_str;

		if (player_action == 0) player_str = "scissor";
		else if (player_action == 1) player_str = "rock";
		else player_str = "paper";

		if (computer_action == 0) computer_str = "scissor";
		else if (computer_action == 1) computer_str = "rock";
		else computer_str = "paper";

		if (player_str.equals(computer_str)) win_str = " too. It is a draw";
		else if (player_str.equals("scissor") && computer_str.equals("paper") ||
				player_str.equals("paper") && computer_str.equals("rock")) win_str = ". You win";
		else win_str = ". Computer win";

		System.out.println("The computer is " + computer_str + ". You are " + player_str + win_str);
	}
}
