// Login plus display  menu in our main function
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		System.out.println("   ______      __  __                   _______                  __                       ");
		System.out.println("  / ____/___ _/ /_/ /_  ____ ___  __   / ____(_)___  ___  ____  / /__  _  _____  _____    ");
		System.out.println(" / /   / __ `/ __/ __ \\/ __ `/ / / /  / /   / / __ \\/ _ \\/ __ \\/ / _ \\| |/_/ _ \\/ ___/   ");
		System.out.println("/ /___/ /_/ / /_/ / / / /_/ / /_/ /  / /___/ / / / /  __/ /_/ / /  __/>  </  __(__  )     ");
		System.out.println("\\____/\\__,_/\\__/_/ /_/\\__,_/\\__, /   \\____/_/_/ /_/\\___/ .___/_/\\___/_/|_|\\___/____/      ");
		System.out.println("                           /____/                     /_/                                 ");
		
		Scanner scanner = new Scanner(System.in);
		int userOption = 0;
		while(true) {
			System.out.println("1. Search/List movie");
			System.out.println("2. View movie details");
			System.out.println("3. Check seat availability and selection of seat/s.");
			System.out.println("4. Book and purchase ticket");
			System.out.println("5. View booking history");
			System.out.println("6. List the Top 5 ranking by ticket sales OR by overall reviewers’ ratings");
			System.out.println("7. Admin Login");
			System.out.print("Option > ");
			userOption = scanner.nextInt();
			
			switch(userOption) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					break;
			
			}
		}
	}

}
