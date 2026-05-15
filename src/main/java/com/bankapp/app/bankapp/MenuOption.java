/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankapp.app.bankapp;

/**
 *
 * @Hamza User
 */
/**
 * An enum representing the main menu options for the application.
 * Each option has a number and a short description.
 */
  
   public enum MenuOption {
        // Menu option 1: Sort a list of people
    SORT(1, "Sort a Dummy List of People"),
     // Menu option 2: Search inside the list
    SEARCH(2, "Search in the List and Return Relevant Information"),
    // Menu option 3: Add new records to the list
    ADD_RECORD(3, "Add Records"),
    
  // Menu option 4: Build a binary tree from the data
    CREATE_BINARY_TREE(4, "Create Binary Tree"),

    // Menu option 5: Exit the program
    EXIT(5, "Exit");

    private final int option;
    private final String description;
    
 /**
     * Constructor for a menu option.
     * @option      the number that represents this option
     * @description the text shown to the user for this option
     */
    
    MenuOption(int option, String description) {
        this.option = option;
        this.description = description;
    }

    /**
     * Returns the option number.
     * @return the integer value of this menu option
     */
    
    public int getOption() { return option; }
    
     /**
     * Converts a user‑entered number into the matching MenuOption.
     * @param choice the number typed by the user
     * @return the matching MenuOption, or null if the number is not valid
     */

    public static MenuOption fromInt(int choice) {
        for (MenuOption m : values()) {
            if (m.option == choice) return m;
        }
        return null;
    }

     /**
     * Returns the option number and its description,
     * exactly as it should appear in the menu.
     * @return a string like "1. Sort a Dummy List of People"
     */
    
    public String toString() {
        return option + ". " + description;
    }
}
    
