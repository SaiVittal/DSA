

/*  Approach: Input given is an array and a key, to find the index we need to traverse through the entire
array, once found the key return the index of that array element.
 */

int linearSearch(int[] arr, int key){
    int n = arr.length;
    for(int i=0; i<n; i++){
        if(arr[i] == key){
            return i;
        }
    }
    return -1;
}

/* TIME COMPLEXITY: 
O(n) --> why: Since we are traversing from starting to the ending, it depends on the length of the array i.e n.
SPACE COMPLEXITY:
O(1) why since no extra space is used.
*/
