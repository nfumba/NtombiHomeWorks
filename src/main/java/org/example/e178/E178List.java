package org.example.e178;
import java.util.ArrayList;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {
        ArrayList<String> groceryItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input grocery items
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            groceryItems.add(scanner.nextLine());
        }

        // Remove duplicates
        for (int i = 0; i < groceryItems.size(); i++) {
            for (int j = i + 1; j < groceryItems.size(); j++) {
                if (groceryItems.get(i).equals(groceryItems.get(j))) {
                    groceryItems.remove(j);
                    j--;
                }
            }
        }

        // Print unique items
        for (String item : groceryItems) {
            System.out.print(item + " ");
        }
    }
}

