

/*Approach: Take an example of dictionary where words are placed in an alphabetical order like from A-Z.
Place three pointers...start, end and middle indices. If the req key is less than the middle element
--> go left and discard the entire right part, if the req key is greater than mid element then go right and
 discard the left. Keep track of the start, enda and mid indices everytime.
*/

/*Binary works only when the input array is kind of sorted i.e fully sorted or partially sorted
Fully Sorted: 82938, 89990, 989882, 827837, 283728923
Partially Sorted: 62,28973, 8237872, 878,900,9882,987283
*/

int binarySearch(int arr[], int key){
    int n = arr.length;
    int start = 0;
    int end = n-1;
    int mid = (start + end)/2;
    
    while(start<=end){
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid]<key){
            start = mid+1;
            mid = (start + end)/2;
        }
        else if(arr[mid]>key){
            end = mid-1;
            mid = (start + end)/2;
        }
    }
    return -1;
}

/* TIME COMPLEXITY: 
O(log n)   Why--> we are discarding half of the array at once. In the first iteration array size becomes half.
and in the second iteration array size is 1/4th.....and soon. Size reaches 1 at the last point.

n/2 >> n/4 >> n/8 >>...... >>1         (kth times = n/2^k).

so n/2^k in terms of log is log n base 2. Therefore O(log n) is the time Complexity.

SPACE COMPLEXITY:
O(1) why --> because we are not using any extra space.
*/


