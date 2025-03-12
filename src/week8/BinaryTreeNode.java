package week8;

public class BinaryTreeNode <A>{
    public A value;
    public BinaryTreeNode<A> left;
    public BinaryTreeNode<A> right;

    public BinaryTreeNode(A value, BinaryTreeNode<A> left, BinaryTreeNode<A> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public String preOrderTraversal(BinaryTreeNode node){
        /*
        top left right
         */
        if (node==null){
            return "null ";
        }
        //fill me in
        String out="";
        out+=node.value.toString()+" ";
        out+=preOrderTraversal(node.left);
        out+=preOrderTraversal(node.right);
        return out;
    }
    //post order: left right top
    public String postOrderTraversal(BinaryTreeNode node){
        /*
        top left right
         */
        if (node==null){
            return "";
        }
        //fill me in
        String out="";
        out+=postOrderTraversal(node.left);
        out+=postOrderTraversal(node.right);
        out+=node.value.toString()+" ";
        return out;
    }
    //in order: left top right
    public String inOrderTraversal(BinaryTreeNode node){
        /*
        top left right
         */
        if (node==null){
            return "";
        }
        //fill me in
        String out="";
        out+=inOrderTraversal(node.left);
        out+=node.value.toString()+" ";
        out+=inOrderTraversal(node.right);
        return out;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(5,null,null);
        root.left=new BinaryTreeNode<>(2,null,null);
        root.right=new BinaryTreeNode<>(8,null,null);
        root.left.left=new BinaryTreeNode<>(-3,null,null);
        root.left.right=new BinaryTreeNode<>(4,null,null);
        root.right.left=new BinaryTreeNode<>(7,null,null);
        root.right.right=new BinaryTreeNode<>(14,null,null);
        System.out.println(root.preOrderTraversal(root));
        System.out.println(root.postOrderTraversal(root));
        System.out.println(root.inOrderTraversal(root));
    }
}
