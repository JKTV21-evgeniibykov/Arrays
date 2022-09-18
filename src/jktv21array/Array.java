/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jktv21array;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Evgenii Bykov
 */
public class Array {

    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random random = new Random();
        for (int n = 0; n < 20; n++) {
            myArray[n] = random.nextInt(50) * 2;
        }
        System.out.println("Array: " + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("Sort Array: " + Arrays.toString(myArray));
        int min = 1;
        while(myArray[min-1] == myArray[min]) ++min;
        int max = myArray.length-2;
        while(myArray[max+1] == myArray[max]) --max;
        int[] myNewArray = new int[max-min+1];
        System.arraycopy(myArray, min, myNewArray, 0, max-min+1);
        System.out.println("New Array: " + Arrays.toString(myNewArray));
        double mid = 0;
        int n = 0;
        for (int x = 0; x < myArray.length; x++) {
            mid = mid + myArray[x];
            ++n;
        }
        mid = mid / n;
        System.out.println("Average: " + mid);
        
        int nArr = 5;
        int[][] newArray = new int[nArr][nArr];
        int hSum = 0;
        int[] vSum = {0,0,0,0,0};
        int d1 = 0, d2 = 0;
        for(int i = 0; i < nArr; i++) {
            for(int j = 0; j < nArr; j++) {
                newArray[i][j] = random.nextInt(10);
                System.out.print(newArray[i][j] + " ");
                hSum = hSum + newArray[i][j];
                vSum[j] = vSum[j] + newArray[i][j];
            }
            System.out.print(" = " + hSum);
            hSum = 0;
            d1 = d1 + newArray[i][i];
            d2 = d2 + newArray[i][nArr-i-1];
            System.out.println();
        }
        System.out.println(Arrays.toString(vSum));
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
