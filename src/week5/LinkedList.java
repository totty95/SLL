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
public class LinkedList {
    protected Node first;
    
    public LinkedList(Node f){
        first = f;
    }
    
    @Override
    public String toString(){
        String output = "";
        for(Node curr = this.first; curr != null; curr = curr.next){
            output += curr.data + " ";
        }
        return output;
    }
    
    public int searchList(Object searchData){
        int pos = 0;
        int found = -1;
        for(Node curr = this.first; curr != null; curr = curr.next){
            if(curr.data.equals(searchData)){
                found = pos;
            }
            pos++;
        }
        return found;
    }
    
    public void add(Object elem, int pos){
        Node ins = new Node(elem);
        int currPos = 0;
        for(Node curr = this.first; curr != null; curr = curr.next){
            
            if(pos == currPos+1){
                ins.next = curr.next;
                curr.next = ins;
                break;
            }
            currPos++;
        }
    }
}