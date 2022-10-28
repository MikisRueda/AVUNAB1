package edu;

public class ListNode {

    private cliente object;
    public ListNode next;

    public ListNode() {
        this.object = null;
        this.next = null;
    }

    public ListNode(cliente object) {
        this.object = object;
        this.next = null;
    }

    public ListNode(cliente object, ListNode next) {
        this.object = object;
        this.next = next;
    }

    public cliente getObject() {
        return object;
    }

    public void setObject(cliente object) {
        this.object = object;
    }

    public boolean isEquals(Object object) {
        if (this.getObject().toString().equals(object.toString())) {
            return true;
        }
        return false;
    }

    public boolean isEquals(ListNode node) {
        if (this.toString().equals(node.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}