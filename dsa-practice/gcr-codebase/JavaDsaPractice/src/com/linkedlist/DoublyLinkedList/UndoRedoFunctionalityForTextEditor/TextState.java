package com.linkedlist.DoublyLinkedList.UndoRedoFunctionalityForTextEditor;

//Node class representing a text state
class TextState{
 String content;
 TextState prev;
 TextState next;

 TextState(String content){
     this.content = content;
     this.prev = null;
     this.next = null;
 }
}
