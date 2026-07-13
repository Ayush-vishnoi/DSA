class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        String num="123456789";
        for(int i=0;i<num.length();i++){
            for(int j=i+1;j<=num.length();j++){
                int ans=Integer.parseInt(num.substring(i, j ));
                if(ans<=high && ans>=low) res.add(ans);
            }
        }
        Collections.sort(res);
        return res;
    }
}