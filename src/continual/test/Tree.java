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
public class Tree {

    private Item head;

    public Tree(Item item) {
        this.head = item;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

}
