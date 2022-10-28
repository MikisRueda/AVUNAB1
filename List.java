package edu;

import java.util.Iterator;

import static java.lang.System.*;
import java.util.*;

public class List implements ListInterface, Iterable<ListNode> {

    private ListNode inode;
    private int size;

    public ListNode head;
    public ListNode tail;

    Scanner entrada = new Scanner(System.in);

    public List() {
        clear();
    }

    /*
    ok
     */
    public List(cliente object) {
        add(object);
    }

    /*
    ok
     */
    public boolean isEmpty() {
        return head == null;
    }

    /*
    ok
     */
    @Override
    public int getSize() {
        return size;
    }

    /*
    ok
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /*
    ok
     */
    @Override
    public Object getHead() {
        return head;
    }

    /*
    ok
     */
    @Override
    public Object getTail() {
        return tail;
    }

    /*
    ok
     */
    @Override
    public ListNode search(cliente object) {
        Iterator<ListNode> i = this.iterator();
        ListNode inode;
        while ((inode = i.next()) != null) {
            if (inode.getObject().toString().equals(object.toString())) {
                return inode;
            }
        }
        return null;
    }

    /*
    ok
     */
    @Override
    public boolean add(cliente object) {
        return insertTail(object);
    }

    /*
    ok
     */
    @Override
    public boolean insert(ListNode node, cliente object) {
        try {
            if (node.next == null) {
                add(object);
            } else {
                ListNode newNode = new ListNode(object);
                newNode.next = node.next;
                node.next = newNode;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean insert(cliente ob, cliente object) {
        try {
            if (ob != null) {
                ListNode node = this.search(ob);
                if (node != null) {
                    return insert(node, object);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean insertHead(cliente object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
            } else {
                head = new ListNode(object, head);
            }
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean insertTail(cliente object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
            } else {
                tail.next = new ListNode(object);
                tail = tail.next;
            }
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean remove(ListNode node) {
        return true;
    }

    /*
    ok
     */
    @Override
    public boolean remove(cliente object) {
        return false;

    }

    @Override
    public boolean contains(cliente object) {
        return false;
    }


    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }

    /*
    ok
     */
    @Override
    public ListNode getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        return null;
    }

    @Override
    public List sortList() {
        return null;
    }

    @Override
    public Iterator<ListNode> iterator() {
        inode = head;
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return inode.next != null;
            }

            @Override
            public ListNode next() {
                if (inode != null) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
    }

    public void rec(ListNode node) {
        if (node.next != null) {
            rec(node.next);
            // <- ;) ->
        }
        out.println(node.toString());
    }

    public void chequearAbordaje(){
        ListNode temp = new ListNode();
        temp = this.head;

        for(int i=0; i <this.size; i++){
            cliente current = new cliente();
            current = temp.getObject();

            System.out.println("------ Datos del cliente ------");
            System.out.println("Nombre: " + current.nombre_cliente);
            System.out.println("Apellidos: " + current.apellido_cliente);
            System.out.println("Tipo de cliente: " + current.tiket.categoria);
            System.out.println("Numero de tickete: " + current.tiket.numeroTiket);
            System.out.println("Asiento Asignado: " + current.tiket.puesto);

            System.out.println("El cliente " + current.nombre_cliente + " ¿Ya abordo? (YES/NO)");
            String confirmacion = entrada.next();

            if(confirmacion.toUpperCase().equals("YES")){
                current.abordaje = "YES";

            }else if(confirmacion.toUpperCase().equals("NO")){
                current.abordaje = "NO";
            }else{
                System.out.println("EL VALOR NO ES VALIDO");
            }

        }
    }

    public void listaPasajeros(){
        ListNode temp = new ListNode();
        temp = this.head;

        for(int i=0; i <this.size; i++){
            cliente current = new cliente();
            current = temp.getObject();

            System.out.println("------ Datos del cliente ------");
            System.out.println("Nombre: " + current.nombre_cliente);
            System.out.println("Apellidos: " + current.apellido_cliente);
            System.out.println("Tipo de cliente: " + current.tiket.categoria);
            System.out.println("Numero de tickete: " + current.tiket.numeroTiket);
            System.out.println("Asiento Asignado: " + current.tiket.puesto);
            System.out.println("ABORDÓ: " + current.abordaje);
            System.out.println("");

            temp = temp.next;
        }
    }

}
