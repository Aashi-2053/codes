 //count path for sum
    int countPath(Node node,int sum){
        List<Integer> path=new LinkedList<>();

        return helper4(node,sum,path);
    }
    int helper4(Node node,int sum,List<Integer> path){
        if (node==null)return 0;

        path.add(node.val);
        int c=0,s=0;

        //paths
        ListIterator<Integer> pathItr=path.listIterator(path.size());
        while (pathItr.hasPrevious()){
            s+= pathItr.previous();
            if(s==sum)c++;
        }
        c+=helper4(node.left,s,path)+helper4(node.right,s,path);
        //backtrack
        path.remove(path.size()-1);
        return c;
    }
 //path sum with path

    List<List<Integer>> findPaths(Node node,int sum){
        //O(logn)
        List<List<Integer>> paths=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
         helper5(node,sum,path,paths);
         return paths;
    }
   void helper5(Node node,int sum,List<Integer> path, List<List<Integer>> paths) {
       if (node == null) return;

       path.add(node.val);

       if (node.val == sum && node.left == null && node.right == null) {
           paths.add(new ArrayList<>(path));
       } else {
           helper5(node.left, sum - node.val, path, paths);
           helper5(node.right, sum - node.val, path, paths);
       }

       path.remove(path.size() - 1);
   }

