/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continual.test;

/**
 *
 * @author USER
 */
public class Program {

    public static enum Operator {
        AND,
        OR,
        XOR
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Item t7 = new Item(Operator.AND);
        Item t6 = new Item(Operator.AND);
        Item t5 = new Item(Operator.AND, t6, t7);
        Item t4 = new Item(Operator.AND);
        Item t3 = new Item(Operator.AND);
        Item t2 = new Item(Operator.AND, t3, t4);
        Item t1 = new Item(Operator.AND, t2, t5);
        // board of binary gates
        int[] numbers = new int[]{1, 1, 1, 1, 0, 1, 1, 1};
        // this initial data was created only for one scenario - n = 3, in other cases we will need to create more data.
        // so all the others input (6, 8, 32) can be tested with a given array, but without a tree (or by looping from 0 to 2^n and in the body create a new node).
        testResult(3, t1, numbers);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("total time: " + totalTime);

//        testResult(6);
//        testResult(8);
//        testResult(32);
    }

    public static void testResult(int n, Item root, int[] numbers) {
        Test test = new Test();
        // the array is ready now for input n as maximum 3, if there is a higher number,
        //     we will need to increase it by creating a loop from 0 to 2^n to get the inputs.
        Tree tree = new Tree(root);
        // if operator is not important and can be given as a random number, then no need to create the tree 
        //    and no need to pass the first parameter to the getResult function, but instead we can either to random an operator for each node,
        //    or to take it from an array, in that case we will use less memory for creating the tree.
        System.out.println("result: " + test.getResult(tree.getHead(), 0, (int) Math.pow(2, n) - 1, numbers, (int) Math.pow(2, n - 1)));

        // complexity
        // for all n inputs the complexity of the algorithm will be O(2^n) because we need to go on each node one time.
        // Thank you:)
    }
}
