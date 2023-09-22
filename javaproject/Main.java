import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many random passwords do you want generated?");
		int total = sc.nextInt();
		System.out.print("How many characters long do you want your random passwords to be? ");
		int length = sc.nextInt();

		String[] randomPasswords = new String[total];

		// loop through total number of passwords
		for (int i = 0; i < total; i++) {
			// Generate one random password
			String randomPassword = "";
			for (int j = 0; j < length; j++) {
				randomPassword += randomCharacter();
			}
			randomPasswords[i] = randomPassword;
		}
		printPasswords(randomPasswords);

	}

	public static void printPasswords(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// '0'-'9'=>48-55 in ASCII
	// 'A'-'B'=>65-98
	// 'a'-'b'=>97-122
	public static char randomCharacter() {
		int rand = (int) (Math.random() * 94);
		if (rand <= 14) {
			int ascii = rand + 33;
			return (char) ascii;
		} else if (rand <= 24) {
			int ascii = rand + 33;
			return (char) ascii;

		} else if (rand <= 31) {
			int ascii = rand + 33;
			return (char) ascii;
		} else if (rand <= 57) {
			int ascii = rand + 33;
			return (char) ascii;
		} else if (rand <= 63) {
			int ascii = rand + 33;
			return (char) ascii;
		} else if (rand <= 89) {
			int ascii = rand + 33;
			return (char) ascii;
		} else {
			int ascii = rand + 33;
			return (char) ascii;
		}

	}
}