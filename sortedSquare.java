public class sortedSquare {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right = nums.length-1;
        int index = nums.length-1;
        int[] result = new int[nums.length-1];
        while(left<=right)
        {
           int leftsq=nums[left]*nums[left];
           int rightsq=nums[right]*nums[right];

           if(leftsq>rightsq)
           {
            result[index--]=leftsq;
            left++;
           }
           else
            if(rightsq>=leftsq)
            {
                result[index--] = rightsq;
                right--;
            }
        }
        return result;

    }
    
}
