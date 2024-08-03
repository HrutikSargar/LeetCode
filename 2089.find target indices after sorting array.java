class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int smaller=0;
        int larger =0;
        ArrayList<Integer> data =new ArrayList<>();
        for(int a:arr){
            if(a<target){
                smaller++;
            }else if(a>target){
                larger++;
            }
        }

        // 1,2,5,2,3
        // 1,2,2,3,5
        //smallerElement=1;
        //largerElement=2;
        //length=5

        for(int a=smaller;a<arr.length-larger;a++){
            data.add(a);
        }
        return data;
    }
}
