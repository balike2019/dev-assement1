package com.findGCFactror;





public class FindHCF {
    /*
  In this solution, we start by checking if the input array is null or empty. If it is,
    we return 0 since there is no highest common factor in this case. Otherwise,
    we initialize the highest common factor to be the first element of the array.
    Then, we loop through the rest of the elements in the array, using the getHCF
    method to compute the highest common factor between the current element and the
    previous highest common factor. Finally, we return the highest common factor.
    */
    public   int highestCommonFactor(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = getHCF(hcf, numbers[i]);
        }
        return hcf;
    }
    /*
       The getHCF method computes the highest common factor between two integers using
       the Euclidean algorithm.
       */
    private  int getHCF(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
	
    
}
