class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length){
            return false;
        }
        int [] temp =new int [1002];

        for(int a=0;a<target.length;a++){
            ++temp[target[a]];
        }
        for(int a=0;a<arr.length;a++){
            --temp[arr[a]];
        }
        for(int a=0;a<temp.length;a++){
            if(temp[a]>0){
                return false;
            }
        }
        return true;
    }
}
