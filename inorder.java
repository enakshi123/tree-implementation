public void inorder(Node node)
   {

       if(node==null)
       {
           return ;
       }
       inorder(node.left);
       System.out.pritn(node.data);
       inorder(node.right);
   }
