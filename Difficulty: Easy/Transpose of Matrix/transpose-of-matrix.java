class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<mat.length;j++){
                temp.add(mat[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}