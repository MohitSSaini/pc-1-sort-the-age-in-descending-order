package com.jap;

public class SortingAge {
    
    public static void main ( String[] args ) {
        //Declare and initialize an integer array containing age.
        int[] ageArray = { 22 , 34 , 33 , 32 , 36 , 27 , 28 };
        
        //Create an object of the class SortingAge
        SortingAge sortingAge = new SortingAge ( );
        
        //Call the method getSortedAge and pass the parameter
        int[] sortedArray = sortingAge.getSortedAge ( ageArray );
        for ( int i = 0 ; i < sortedArray.length ; i++ ) {
            System.out.print ( sortedArray[ i ] + " " );
        }
    }
    
    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge ( int[] ageArray ) {
        int temp;
        for ( int i = 0 ; i < ageArray.length ; i++ ) {
            for ( int j = 0 ; j < ageArray.length - i - 1 ; j++ ) {
                if ( ageArray[ j ] < ageArray[ j + 1 ] ) {
                    temp = ageArray[ j ];
                    ageArray[ j ] = ageArray[ j + 1 ];
                    ageArray[ j + 1 ] = temp;
                }
            }
            
        }
        return ageArray;
    }
}
