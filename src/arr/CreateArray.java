package arr;

import java.util.Arrays;

/**
 * Created by Yuriy on 21.02.2016.
 */
public class CreateArray {
    public static void main(String[] args){
        int[] evenNumbersArray = new int [15]; // оголосили масив на 15 елементів
        int arrayIndex =0; //оголосили змінну індексу елемента
        for(int i=2;i<=30;i+=2){
            evenNumbersArray[arrayIndex] = i;
            arrayIndex++;
        }
        System.out.println(Arrays.toString(evenNumbersArray));// виведе адресу масиву
    }
}
