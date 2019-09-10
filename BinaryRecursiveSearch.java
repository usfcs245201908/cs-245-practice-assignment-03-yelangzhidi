public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "Binary Recursive Search";
    }

    @Override
    public int search(int[] arr, int target) {
        return searchRecursive(arr, target, 0, arr.length-1);
    }
    public int searchRecursive(int[] arr, int target, int low, int high){
        if (low > high)
            return -1;
        int mid = (low + high)/2;
        if (target == arr[mid])
            return mid;
        if (target > arr[mid])
            return searchRecursive(arr, target, mid +1, high);
        else
            return searchRecursive(arr, target, low, mid-1);

    }

}
