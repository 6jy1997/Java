public class BinaryTreeDemo {

    public static void main(String[] args) {

        // 创建二叉树

        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1,"LJY");
        HeroNode node2 = new HeroNode(2,"LJY");
        HeroNode node3 = new HeroNode(3,"LJY");
        HeroNode node4 = new HeroNode(4,"LJY");
        HeroNode node5 = new HeroNode(5,"LJY");

        binaryTree.setRoot(root);

        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);

        System.out.println();


        binaryTree.preOrder();
        binaryTree.infixOrder();
        binaryTree.postOrder();


    }
}


class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root){
        this.root = root;
    }
    public void preOrder(){
        if(this.root!= null){
            this.root.preOrder();
        }else System.out.println("NULL");
    }
    public void infixOrder(){
        if(this.root!= null){
            this.root.infixOrder();
        }else System.out.println("NULL");
    }
    public void postOrder(){
        if(this.root!= null){
            this.root.postOrder();
        }else System.out.println("NULL");
    }


}

class HeroNode{

    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no,String name){
        this.no = no;
        this.name = name;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历方法

    public void preOrder(){
        System.out.println(this);//先输出父节点
//        递归左子树
        if(this.left!= null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }

    //中序遍历
    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }

    //后序遍历
    public void postOrder(){
        if(this.left!=null){
            this.left.postOrder();
        }
        if(this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }


    public HeroNode preOrderSearch(int no){
        if(this.no ==no){
            return this;
        }
        HeroNode resNode = null;
        if(this.left != null){
            resNode = this.left.preOrderSearch(no);

        }
        if(resNode!= null){
            return resNode;
        }

        if(this.right!= null){
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }



    public HeroNode postOrderSearch(int no) {
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.postOrderSearch(no);

        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }

        if (this.no == no) {
            return this;
        }
        return resNode;
    }


    public void delNode(int no){

        if(this.left !=null && this.left.no ==no){
            this.left = null;
            return;
        }
        if(this.right !=null && this.right.no ==no){
            this.right = null;
            return;
        }
        if(this.left != null){
            this.left.delNode(no);
        }

        if(this.right != null){
            this.right.delNode(no);
        }
    }


}
