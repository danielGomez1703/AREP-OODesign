/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.container;

import java.io.Serializable;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author danip
 */
public class LinkedListImp <E> implements List<E>, Serializable {
   Node<E> head;
   Node actual;
   int size;
   /**
    * Agrega un elemento nuevo a la lista
    * @param value
    * @return false si no agrega con exito
    */
   public LinkedListImp (){
       size = 0;
   }
   @Override
   public boolean add (E value)
   {    
       Node<E> newNode = new Node<>(value);
       if (head != null){
          
            Node last = head;
            
           while (last.next !=null){
              last=last.next;       
           }
           last.next = newNode;
       }else{
           head= new Node(value);
           actual=head;
       }
       size++;
       
     return true;
   }
   /**
    *  remueve un objeto de la lInked list
    * @param value
    * @return retorna un booleano en caso de fallo o error en 
    */
   public boolean remove (Object value){
       if (head != null){
           Node last = head;
           Node nextLast= head.next;
           while (nextLast !=null){
               if (nextLast.equals(value)){
                   last.next=nextLast.next;
               }
               last = last.next;
               nextLast= nextLast.next;
           }
           if(head.value.equals(value))
             head = null;
       }else{
           return false;
       }
     return true;
   }
   
   public String toString(){
       String r = "";
       Node last = head;
       while (last !=null){
             r+=" "+last.toString();
             last=last.next;
           }
       return r;
   }
   
   /** 
    * Next retorna el Nodo siguiente en la lista al llegar al final volvera al head, com si fuera circular 
    * @return  Node  siguiente nodo.
    */
   public Node Next(){
      actual =actual.next;
      return actual;
       
   }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int index) {
        if((index<0 && index>=size)){
            throw new IndexOutOfBoundsException();

        }else{
            Node<E> nd = head;
            for (int i=0 ; i<index; i++){
                nd=nd.next;
                
            } 
            return nd.value;
        }
        
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
