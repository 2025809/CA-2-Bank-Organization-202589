/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
package bankapp;

public enum MenuOption {
    SORT(1, "Sort a Dummy List of People"),
    SEARCH(2, "Search in the List and Return Relevant Information"),
    ADD_RECORD(3, "Add Records"),
    CREATE_BINARY_TREE(4, "Create Binary Tree"),
    EXIT(5, "Exit");

    private final int option;
    private final String description;

    MenuOption(int option, String description) {
        this.option = option;
        this.description = description;
    }