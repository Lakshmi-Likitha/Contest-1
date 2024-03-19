class Solution {
    public boolean checkPerfectNumber(int num) {
        int div = 1;
        if(num == 1){
            return false;
        }
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                int var = num / i;
                if(var == i){
                    div = div + i;
                } 
                else{
                    div = div + var + i;
                }
            }
        }
        if(div ==  num){
            return true;
        }
    return false;
    }
}
