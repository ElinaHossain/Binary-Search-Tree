import java.util.Scanner;

class Driver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST<Integer, String> bst = new BST<>();

		Integer[] keys = {25, 101, 10, 45, 90, 110, 13, 11, 40, 60, 99, 105, 234, 17, 20, 67, 175};
		for (Integer key : keys) {
			System.out.print("Enter name of book for key " + key + ": ");
			boolean isEmpty = bst.isEmpty();
			System.out.println("Is the List Empty? " + isEmpty);
			String value = sc.nextLine();
			bst.insert(key, value);
		}

		System.out.println("Displaying level 5.");
		bst.displayLevel(5);
		
		System.out.println("Size: " + bst.size());

		System.out.println("Levels: " + bst.levels());
		
		boolean isEmpty = bst.isEmpty();
		System.out.println("Is the List Empty? " + isEmpty);

		System.out.print("Enter a key to search: ");
		Integer searchKey = Integer.parseInt(sc.nextLine());
		boolean searchResult = bst.search(searchKey);
		System.out.println("Search Result for key " + searchKey + ": " + searchResult);

		bst.display();

		System.out.print("Enter a key to delete: ");
		Integer deleteKey = sc.nextInt();
		bst.delete(deleteKey);

		System.out.println("Size: " + bst.size());

		System.out.println("Levels: " + bst.levels());

		searchResult = bst.search(deleteKey);
		System.out.println("Search Result for key " + deleteKey + " after deletion: " + searchResult);

		bst.display();

		bst.displayLevel(5);

		while (true) {
			System.out.println("Options:");
			System.out.println("0: Exit Application");
			System.out.println("1: Insert a book");
			System.out.println("2: Remove a book");
			System.out.println("3: Check if list is empty");
			System.out.println("4: Size of list");
			System.out.println("5: Search key");
			System.out.println("6: Check number of levels");
			System.out.println("7: Display all levels");
			System.out.println("8: Display specific level");

			System.out.print("Enter your option: ");
			int option = sc.nextInt();
			sc.nextLine(); 

			if (option == 0) {
				System.out.println("Exiting Application...");
				break;
			} else if (option == 1) {
				System.out.print("Enter a key to insert: ");
				Integer insertKey = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Enter name of book for key " + insertKey + ": ");
				String name = sc.nextLine();
				bst.insert(insertKey, name);
			} else if (option == 2) {
				System.out.print("Enter a key to remove: ");
				Integer removeKey = sc.nextInt();
				sc.nextLine(); 
				bst.delete(removeKey);
			} else if (option == 3) {
				boolean empty = bst.isEmpty();
				System.out.println("Is the List Empty? " + empty);
			} else if (option == 4) {
				int size = bst.size();
				System.out.println("Size: " + size);
			} else if (option == 5) {
				System.out.print("Enter key to search for: ");
				int searchKeyOption = sc.nextInt();
				sc.nextLine(); 
				boolean found = bst.search(searchKeyOption);
				System.out.println("Search Result for key " + searchKeyOption + ": " + found);
			} else if (option == 6) {
				int treeLevels = bst.levels();
				System.out.println("Number of levels: " + treeLevels);
			} else if (option == 7) {
				bst.display();
			} else if (option == 8) {
				System.out.print("Enter level to display: ");
				int displayLevel = sc.nextInt();
				sc.nextLine(); 
				bst.displayLevel(displayLevel);
			} else {
				System.out.println("Invalid entry.");
			}
		}
	}
}
