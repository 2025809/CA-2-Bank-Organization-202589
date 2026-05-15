/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bankapp.app.bankapp;
import java.util.Scanner;
/**
 *
 * @author Hamza
 */
public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Print the menu
            System.out.println("MAIN MENU");
            for (MenuOption option : MenuOption.values()) {
                System.out.println(option);   // uses your toString()
            }

            // Read user choice
            System.out.print("Your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            MenuOption selected = MenuOption.fromInt(choice);
            if (selected == null) {
                System.out.println("Invalid option. Try again.");
                continue;
            }

            switch (selected) {
                case SORT:
                case SEARCH:
                case ADD_RECORD:
                case CREATE_BINARY_TREE:
                    System.out.println("You selected " + selected + " – feature not yet implemented.");
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }

        scanner.close();
    }
}