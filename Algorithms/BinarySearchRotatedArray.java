public class BinarySearchRotatedArray {
    public static void main(String[] args) {
        
    }

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == key) //Found
            return mid;

        if(arr[start] < arr[mid] && arr[mid] < arr[end]){ //Traditional Binary Search
            if(key < arr[mid])
                return binarySearch(arr, start, mid-1, key);
            else
                return binarySearch(arr, mid+1, end, key);
        }
        else if(arr[start] < arr[mid] && arr[mid] > arr[end]){ //Check for rotation in b/w
            if(key < arr[mid] && key < arr[start]){
                return binarySearch(arr, mid+1, end, key);
            }
            else if(key < arr[mid] && key > arr[start]){
                return binarySearch(arr, start, mid-1, key);
            }
        }
        else{
            return binarySearch(arr, start, end, key)
        }
    }
}
