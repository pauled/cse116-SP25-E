package week5;

public class LinkedListNode<G> {
    private G value;
    private LinkedListNode next;

    public LinkedListNode(G val,LinkedListNode next){
        this.value=val;
        this.next=next;
    }
    public G getValue(){
        return this.value;
    }
    public String toString(){
        String out="";
        out+=this.value+" ";
        if (this.next!=null){
            out+=this.next.toString();
        }
        return out;
    }
    public int size(){
        System.out.println("size-val:"+this.value);
        if (this.next==null){
            return 1;
        } else {
            int temp=this.next.size();
            System.out.println("size-val:"+this.value+" temp:"+temp);
            return temp+1;
        }
    }
    public void append(LinkedListNode toAdd){
        if (this.next==null){
            this.next=toAdd;
        } else {
            this.next.append(toAdd);
        }
    }


    public boolean insert(int loc,LinkedListNode toAdd) {
        if (loc==1){
            toAdd.next=this.next;
            this.next=toAdd;
            return true;
        } else if (loc<1 || this.next==null){
            return false;
        } else {
            return this.next.insert(loc-1,toAdd);
        }
    }
    /*
    1) write a size method that returns the size of the linked list
    2) write an append method that appends teh linked list node that is
    the argument
    3) write a find method that returns a node if found and null otherwise
    4) write an insert method that takes a node and a location and returns
    true if it can be inserted and false otherwise
     */

    public static void main(String[] args) {
        LinkedListNode<Double> first=new LinkedListNode<>(1.0,null);
        first=new LinkedListNode<>(2.0,first);
        first=new LinkedListNode<>(3.0, first);
        String out=first.toString();
        System.out.println(out);
        System.out.println(first.size());
    }
}
