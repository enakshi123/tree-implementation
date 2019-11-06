public void inorder(TREEDS rootlist)
   {
       Node temp=rootlist.root;
       if(rootlist.root==null)
       {
           return;
       }
       inorder(temp.left);
       System.out.pritn(temp.data);
       inorder(temp.right);
   }