import java.util.*;
//Tree is a Hierarchical Data Structure
//Tree are widely used 
//Tree consists of RootNode(at top),leaf(at bottom)
//Binary Tree is a type of Tree in which a Node can have Maximum 2 Child
//
class TreeYT
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree
    {
        static int idx = -1;
        
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    
    public static void levelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {
            Node curNode = q.remove();
            if(curNode == null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(curNode.data+" ");
                if(curNode.left != null)
                {
                    q.add(curNode.left);
                }
                if(curNode.right != null)
                {
                    q.add(curNode.right);
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        levelOrder(root);
    }
}
