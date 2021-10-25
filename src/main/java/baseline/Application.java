/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jesse Lekwa
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


class toDoList {
    private toDoListEntry[] entries;
    private String title;

    toDoList(String title){
        //creates a new todo list and returns an error if it is less than 3 characters
    }

    public void changeTitle(String title){
        //for changing the title and returning an error if it is less than 3 characters
    }

    public void addEntry(toDoListEntry newEntry){
        //for adding a new entry to the list
    }

    public String getTitle(){
        //for returning the title of the list
        return null;
    }

    public toDoListEntry getEntry(int index){
        return null;
    }
}


class toDoListEntry {
    private String dueDate;
    private String description;
    private boolean completionStatus;

    toDoListEntry(){
        //for creating a new entry
    }

    public void setDueDate(String newDueDate){
        //for checking if the due dte is in the correct format and returning an error if it isnt
    }

    public void setDescription(String newDescription){
        //Sets the new description for the entry.
    }

    public void toggleCompletion(){
        //for changing the completion status of the entry from true to false
    }

    public String getDueDate(){
        // for returning the due date of the item
        return null;
    }

    public String getDescription(){
        // for returning the description of the item
        return null;
    }

    public boolean getCompletionStatus(){
        //Returns the due date of this item
        return false;
    }
}

class fileReader {
    public toDoList[] readListsFromFile(String filePath){
        //this class will contain the file path that contains the text file with the description and date and it will return the array of the to do list
        return null;
    }
}

class fileWriter {
    public void writeListsToFile(String filePath, toDoList[] saveData){

    }
}

public class Application {

    public static void main(String[] args) {

    }//main function

}

