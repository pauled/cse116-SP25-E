package week8;

import week7.Comparator;
import week7.IntDecreasing;

public class BST <A>{
    private BinaryTreeNode<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.comparator=comparator;
        root=null;
    }
    public void insert(A value){
        if (this.root==null){
            this.root=new BinaryTreeNode<>(value,null,null);
        } else {
            this.insertHelper(this.root,value);
        }
    }
    public void insertHelper(BinaryTreeNode<A> node,A toInsert){
        if (comparator.compare(toInsert,node.value)){
            if (node.left==null){
                node.left=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                this.insertHelper(node.left,toInsert);
            }
        } else {
            if (node.right==null){
                node.right=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                insertHelper(node.right,toInsert);
            }
        }
    }
    public boolean find(A value){
        if (this.root==null){
            return false;
        } else {
            return this.findHelper(this.root,value);
        }
    }
    public boolean findHelper(BinaryTreeNode<A> node,A toFind){
        if (node.value.equals(toFind)){
            return true;
        } else if (this.comparator.compare(toFind,node.value)){
            if (node.left==null){
                return false;
            } else {
                return findHelper(node.left,toFind);
            }
        } else {
            if (node.right==null){
                return false;
            } else {
                return findHelper(node.right,toFind);
            }
        }
    }


    public static void main(String[] args) {
        BST<Integer> bst=new BST<>(new IntDecreasing());

        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        bst.insert(-10);



        System.out.println(bst.root.inOrderTraversal(bst.root));
        System.out.println(bst.find(4));
        System.out.println(bst.find(2));
        System.out.println(bst.find(-7));
    }
}
