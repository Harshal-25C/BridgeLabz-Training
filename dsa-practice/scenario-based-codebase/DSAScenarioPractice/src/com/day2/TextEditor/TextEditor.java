package com.day2.TextEditor;

import java.util.Stack;

public class TextEditor {

    private StringBuilder content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditor(){
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    //Insert text
    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();
        System.out.println("Inserted: "+text);
    }

    //Delete last n characters
    public void delete(int length) {
        if(length>content.length()) return;

        String deletedText = content.substring(content.length()-length);
        content.delete(content.length() - length, content.length());

        undoStack.push(new Action("delete", deletedText));
        redoStack.clear();
        System.out.println("Deleted: "+deletedText);
    }

    //Undo operation
    public void undo() {
        if(undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if(action.type.equals("insert")) {
            content.delete(content.length()-action.text.length(), content.length());
        }else if(action.type.equals("delete")) {
            content.append(action.text);
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    //Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if(action.type.equals("insert")) {
            content.append(action.text);
        }else if(action.type.equals("delete")) {
            content.delete(content.length()-action.text.length(), content.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    public void display() {
        System.out.println("Current Text: "+content);
    }
}
