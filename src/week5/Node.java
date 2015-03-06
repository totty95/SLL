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
public class Node {
    protected Node next;
    protected Object data;
    
    protected Node(Object d, Node n){
        data = d;
        next = n;
    }
    
    protected Node(Object d){
        data = d;
        next = null;
    }
}
