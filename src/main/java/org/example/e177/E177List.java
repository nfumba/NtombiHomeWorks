package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
            ArrayList<String> chatMessages = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            // Input chat messages
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter message " + (i + 1) + ": ");
                chatMessages.add(scanner.nextLine());
            }

            // Remove specific messages
            chatMessages.remove(0); // Remove 1st message
            chatMessages.remove(1); // Remove 3rd message (now at index 1)
            chatMessages.remove(2); // Remove 5th message (now at index 2)

            // Print remaining messages
            for (String message : chatMessages) {
                System.out.print(message + " ");
            }
        }
    }

