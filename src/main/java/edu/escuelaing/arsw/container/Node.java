/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.container;

/**
 *
 * @author danip
 * @param <E>
 */
public  class Node<E>
{
    
    public  E value;
    public Node next;
    public Node( E val){
        value=val;
        this.next =null;
    }
    
   public String toString(){
       return value.toString();
   }
}
