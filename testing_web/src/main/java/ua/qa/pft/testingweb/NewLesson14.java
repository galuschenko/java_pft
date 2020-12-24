package ua.qa.pft.testingweb;

public class NewLesson14 {
    static class TreeNode {
        int value;
        TreeNode leftchild;
        TreeNode rightchild;

        public TreeNode(TreeNode leftchild, TreeNode rightchild, int value) {
            this.leftchild = leftchild;
            this.rightchild = rightchild;
            this.value = value;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(
                new TreeNode(
                        null,
                        new TreeNode(null, null, 4),
                        2),
                new TreeNode(
                        new TreeNode(null, null, 5),
                        null,
                        3),
                1);

        int summ = root.value;              //1
        summ = summ + root.leftchild.value;       //2
        summ = summ + root.leftchild.rightchild.value;//4
        summ = summ + root.rightchild.value; //3
        summ = summ + root.rightchild.leftchild.value;   // 5

        System.out.println(summ);

        int summ2 = getValue(root);
        System.out.println(summ2);

    }

    public static int getValue(TreeNode root) {
        int summ = root.value;

        if (root.leftchild != null) {
            summ = summ + getValue(root.leftchild);
        }

        if (root.rightchild != null) {
            summ = summ + getValue(root.rightchild);
        }

        return summ;
    }

}
