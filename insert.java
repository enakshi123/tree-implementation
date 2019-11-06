 class BinarySearchTree { 
  
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    Node insert(Node node,int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        
        if(key < node.data){
            node.left = insert(node.left, key);
        }else if(key > node.data){
            node.right = insert(node.right, key);
        }
        return node;
    }
     public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
        Node treenode=new Node(treenode,70);
        treenode=tree.insert(treenode,50); 
        treenode=tree.insert(treenode,30); 
        treenode=tree.insert(treenode,20); 
        treenode=tree.insert(treenode,40); 
        treenode=tree.insert(treenode,70); 
        treenode=tree.insert(treenode,60); 
        treenode=tree.insert(treenode,80); 
        }
        }
