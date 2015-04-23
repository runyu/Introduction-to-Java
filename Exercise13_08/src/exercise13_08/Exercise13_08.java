/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise13_08;

/**
 *
 * @author Runyu Wang
 */
public class Exercise13_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    MyStack stack1 = new MyStack();
    stack1.push("S1");
    stack1.push("S2");
    stack1.push("S");

    MyStack stack2 = (MyStack)(stack1.clone());
    stack2.push("S1");
    stack2.push("S2");
    stack2.push("S");

    System.out.println(stack1.getSize());
    System.out.println(stack2.getSize());
    System.out.println(stack1);
    System.out.println(stack2);
    }
}
