public class segregate0and1 {
    void segregate0and1(int[] arr) {
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=arr.length;j>i-1;j--)
            {
                if(arr[i]==0 && arr[j]==1)
                {
                    continue;
                }
                else if(arr[i]!=0)
                {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else if(arr[j]!=1)
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return;
    }
}
