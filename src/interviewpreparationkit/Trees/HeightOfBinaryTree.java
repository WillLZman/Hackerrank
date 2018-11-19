package interviewpreparationkit.Trees;

import javafx.scene.Node;

public class HeightOfBinaryTree {
    public static int height(Node root) {
        // Write your code here.
        int leftHeight = 0;
        int rightHeight = 0;
        if(root == null){
            return -1;
        }
        if(root.left != null){
            leftHeight =1 + height(root.left);
        }
        if(root.right != null){
            rightHeight = 1+ height(root.right);
        }return (Math.max(leftHeight,rightHeight));
    }
}
