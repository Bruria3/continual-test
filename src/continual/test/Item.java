/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continual.test;

import continual.test.Program.Operator;

public class Item {

    private Operator operator;
    private Item left;
    private Item right;

    public Item(Operator o, Item left, Item right) {
        this.operator = o;
        this.right = right;
        this.left = left;
    }

    public Item(Operator o) {
        this.operator = o;
    }

    public Item getLeft() {
        return left;
    }

    public Item getRight() {
        return right;
    }

    public void setLeft(Item left) {
        this.left = left;
    }

    public void setRight(Item right) {
        this.right = right;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

}
