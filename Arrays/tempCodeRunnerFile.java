public static int searchBinary(int num[], int target){
        int start = 0;
        int end = num.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==target){
                return mid;
            }if(num[mid]>target){
                end = mid-1;
            }else{
                end = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {-1,0,3,5,9};
        int target = 5;
        System.out.println(searchBinary(num, target));
    }