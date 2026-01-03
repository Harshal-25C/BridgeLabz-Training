package com.stackandqueue.SortStackUsingRecursion;
import java.util.Stack;

public class SortStackRecursively{

    //Function to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack){

        //Base case: stack is empty
        if (stack.isEmpty()) {
            return;
        }
        //remove top element
        int top = stack.pop();
        //sort remaining stack
        sortStack(stack);
        //Insert element in sorted order
        insertInSortedOrder(stack, top);
    }

    //Helper function to insert element at correct position
    private static void insertInSortedOrder(Stack<Integer> stack, int element){

        //Base case: correct position found
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return;
        }

        //Remove top element
        int top = stack.pop();

        //Recursive call
        insertInSortedOrder(stack, element);

        //Push back the removed element
        stack.push(top);
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);
    }
}
