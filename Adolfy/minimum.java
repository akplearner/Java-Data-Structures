//find minimum of array


int  min(int[] arr){
    int m=arr[0]; //for this case skip its not null
    for(int i=1; i<arr.length;i++){//1(i=1), 7(N-1)+2 ("i<arr.length","i++"", and " . " in arr.length)
        if(m>arr[i]){//2(derreferencing 'arr[i]','>')
            m=arr[i]; //2 (assignment counts "=",derreferencing "arr[i]")
        }
    }
    return m;
}

/*How many operations or how long.
    7(N-1)+2+3+1 = 7N+1 which is linear
/ 


//generics ,write to files, random ,linkedList class