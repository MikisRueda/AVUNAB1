package edu;

import java.util.Iterator;

public interface ListInterface {

    /*
    essential operations
    */
    public boolean isEmpty();

    public int getSize();

    public void clear();

    public Object getHead();

    public Object getTail();

    public ListNode search(cliente object);

    public boolean add(cliente object);

    public boolean insert(ListNode node, cliente object);

    public boolean insert(cliente ob, cliente object);

    public boolean insertHead(cliente object);

    public boolean insertTail(cliente object);

    public boolean remove(ListNode node);

    public boolean remove(cliente object);

    /*
    expansion operations
     */
    public boolean contains(cliente object);

    public Iterator<ListNode> iterator();

    public Object[] toArray();

    public Object[] toArray(Object[] object);

    public Object getBeforeTo();

    public ListNode getBeforeTo(ListNode node);

    public Object getNextTo();

    public Object getNextTo(ListNode node);

    public List subList(ListNode from, ListNode to);

    public List sortList();

}
