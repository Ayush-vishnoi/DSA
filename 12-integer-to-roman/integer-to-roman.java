class Solution {
    public String intToRoman(int num) {
        String roman="";
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] letters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                roman=roman+letters[i];
                num=num-value[i];
            }
        }
        return roman;
    }
}