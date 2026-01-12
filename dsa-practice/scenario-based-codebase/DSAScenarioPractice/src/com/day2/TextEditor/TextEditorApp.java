package com.day2.TextEditor;

public class TextEditorApp{
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.display();

        editor.delete(6);
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();
    }
}
