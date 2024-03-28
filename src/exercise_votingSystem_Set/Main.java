package exercise_votingSystem_Set;

import java.util.*;

class Methods {
	HashSet<String> votes = new HashSet<>();

	public void cast_vote(String candidate) {
		votes.add(candidate);
		System.out.println("Your vote is for candidate " + candidate);
	}

	public void count_votes() {
		int totalVotes = votes.size();
		System.out.println("Total amount of votes: " + totalVotes);
		for (String candidate : votes) {
			int candidateVotes = 0;
			for (String vote : votes) {
				if (vote.equalsIgnoreCase(candidate)) {
					candidateVotes++;
					System.out.println(candidate +": " + candidateVotes);
				}
			}
		}

	}

	public void display_vote() {
		System.out.println("Here are the candidates names: ");
		System.out.println();
		for (String candidate : votes) {
			System.out.println(candidate);
		}
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Methods method = new Methods();

		int choice;
		do {
			System.out.println("Voting System Menu:");
			System.out.println("----------------------");
			System.out.println("Choose an option: ");
			System.out.println("1. Cast a vote.");
			System.out.println("2. Count the votes.");
			System.out.println("3. Display the vote counts");
			System.out.println("4. Exit the program.");
			System.out.println("Your option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Your choice is Cast vote.");
				System.out.println("Write the name of your candidate:");
				String candidate = scanner.nextLine();
				method.cast_vote(candidate);
				System.out.println();
				break;

			case 2:
				System.out.println("Your choice is Count the votes.");
				method.count_votes();
				System.out.println();
				break;

			case 3:
				System.out.println("Your choice is Display votes.");
				method.display_vote();
				System.out.println();
				break;

			default:
				System.out.println("Invalid option. Please select a right option.");
			}
		} while (choice != 4);
		System.out.println("Exiting the program.");
		
		scanner.close();

	}

}
