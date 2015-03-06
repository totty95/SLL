/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author 1309400
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n1 = new Node("A");
        LinkedList list = new LinkedList(n1);
        System.out.println(list.toString());
        list.add("B", 1);
        list.add("C", 2);
        list.add("D", 3);
        list.add("E", 4);
        list.add("F", 0);
        System.out.println(list.toString());
    }
    
}
