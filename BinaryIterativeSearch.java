public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "Binary iterative Search";
    }

    @Override
    public int search(int[] arr, int target) {
        // Binary Search with Iterative way Function
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if (target == arr[mid])
                return mid;
            if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
