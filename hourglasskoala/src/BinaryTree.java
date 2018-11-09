public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = new TreeNode("A");
    }

    public void createBinaryTree() {
        TreeNode treeNodeB = new TreeNode("B");
        TreeNode treeNodeC = new TreeNode("C");
        TreeNode treeNodeD = new TreeNode("D");
        TreeNode treeNodeE = new TreeNode("E");
        TreeNode treeNodeF = new TreeNode("F");
        TreeNode treeNodeG = new TreeNode("G");
        root.setLeft(treeNodeB);
        root.setRight(treeNodeC);
        treeNodeB.setLeft(treeNodeD);
        treeNodeB.setRight(treeNodeE);
        treeNodeC.setLeft(treeNodeF);
        treeNodeC.setRight(treeNodeG);

    }

    /**
     * @ 前序: 根节点->左子树->右子树
     */
    public void preNode(TreeNode node) {
        System.out.print(node.getVal());
        if (node.getLeft() != null) {
            preNode(node.getLeft());
        }
        if (node.getRight() != null) {
            preNode(node.getRight());
        }

    }

    /**
     * @ 中序: 左子树->根节点->右子树
     */
    public void inNode(TreeNode node) {
        if (node.getLeft() != null) {
            inNode(node.getLeft());
        }
        System.out.print(node.getVal());
        if (node.getRight() != null) {
            inNode(node.getRight());
        }

    }

    /**
     * @ 后序: 左子树->右子树->根节点
     */
    public void postNode(TreeNode node) {
        if (node.getLeft() != null) {
            postNode(node.getLeft());
        }
        if (node.getRight() != null) {
            postNode(node.getRight());
        }
        System.out.print(node.getVal());
    }

    /**
     * @param node
     * @return 二叉树的高度
     */
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }


    /**
     * @param node
     * @return 二叉树节点个数
     */
    public int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSize = getSize(node.getLeft());
        int rightSize = getSize(node.getRight());
        return leftSize + rightSize + 1;
    }


    public static void main(String args[]) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preNode(binaryTree.root);
        System.out.println("------------");
        binaryTree.inNode(binaryTree.root);
        System.out.println("------------");
        binaryTree.postNode(binaryTree.root);
        System.out.println("------------");
        System.out.println(binaryTree.getHeight(binaryTree.root));
        System.out.println("------------");
        System.out.println(binaryTree.getSize(binaryTree.root));
    }


}
