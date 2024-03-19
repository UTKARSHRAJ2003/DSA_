public class SelectionSort {
    public static void selectionsort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            int minpos=turn;
            for(int j=turn+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
                //swap
                int temp=arr[minpos];
                arr[minpos]=arr[turn];
                arr[turn]=temp;
            }
        }
    }
    public static void printarr(int arr[])
    {
        for(int turn=0;turn<arr.length;turn++)
        {
            System.out.print(arr[turn]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
       // printarr(arr);
    }
    
}
