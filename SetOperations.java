//KRISTINE JOY C. HOMBRE 
//BSCS 2B

import java.util.*;

public class SetOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for set A
        System.out.println("Enter elements of set A separated by spaces:");
        String[] inputA = scanner.nextLine().split(" ");
        Set<Integer> setA = new HashSet<>();
        for (String num : inputA) {
            setA.add(Integer.parseInt(num));
        }

        // Input for set B
        System.out.println("Enter elements of set B separated by spaces:");
        String[] inputB = scanner.nextLine().split(" ");
        Set<Integer> setB = new HashSet<>();
        for (String num : inputB) {
            setB.add(Integer.parseInt(num));
        }

        // Menu for operations
        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Union (A U B)");
            System.out.println("2. Intersection (A n B)");
            System.out.println("3. Difference (A - B and B - A)");
            System.out.println("4. Subset Check (A ⊆ B and B ⊆ A)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Union (A ∪ B)
                    Set<Integer> union = new HashSet<>(setA);
                    union.addAll(setB);
                    System.out.println("Union (A U B): " + union);
                    break;
                
                case 2:
                    // Intersection (A ∩ B)
                    Set<Integer> intersection = new HashSet<>(setA);
                    intersection.retainAll(setB);
                    System.out.println("Intersection (A n B): " + intersection);
                    break;
                
                case 3:
                    // Difference (A - B and B - A)
                    Set<Integer> differenceAminusB = new HashSet<>(setA);
                    differenceAminusB.removeAll(setB);
                    System.out.println("Difference (A - B): " + differenceAminusB);

                    Set<Integer> differenceBminusA = new HashSet<>(setB);
                    differenceBminusA.removeAll(setA);
                    System.out.println("Difference (B - A): " + differenceBminusA);
                    break;
                
                case 4:
                    // Subset Check (A ⊆ B and B ⊆ A)
                    boolean isSubsetAinB = setB.containsAll(setA);
                    boolean isSubsetBinA = setA.containsAll(setB);
                    System.out.println("Is A a subset of B (A ⊆ B)? " + isSubsetAinB);
                    System.out.println("Is B a subset of A (B ⊆ A)? " + isSubsetBinA);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the program.");
                    break;
                
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
