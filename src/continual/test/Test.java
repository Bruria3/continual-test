/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continual.test;

import continual.test.Program.Operator;

public class Test {

    private int calc(int num1, int num2, Operator operator) {
        if (operator.equals(Operator.AND)) {
            return num1 & num2;
        }
        if (operator.equals(Operator.OR)) {
            return num1 | num2;
        }
        return num1 ^ num2;
    }

    public int getResult(Item item, int leftIndex, int rightIndex, int[] input, int n) {
        // System.out.println("left index: " + leftIndex + " index left: " + rightIndex);
        if (rightIndex - leftIndex == 1) {
            return calc(input[rightIndex], input[leftIndex], item.getOperator());
        }
        return calc(getResult(item.getLeft(), leftIndex, rightIndex - n, input, n / 2),
                getResult(item.getRight(), leftIndex + n, rightIndex, input, n / 2), item.getOperator());
    }

}
