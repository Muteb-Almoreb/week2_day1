import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        //1.Write a Java program to test if the first and the last element of an array of
//        //integers are same. The length of the array must be greater than or equal to
//        //2 Test Data:
//        //array = 50, -20, 0, 30, 40, 60, 10
//       int[] num = new int[4];
        
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 10;
        if (num.length >= 2) {
            if (num[0] == num[num.length - 1]) {
                System.out.println("true! , the number at first is same the nuumber of end: ");

            }
            else System.out.println("false! The first and last elements are not the same.");
        }
        else
            System.out.println("Array must have at least 2 elements");
//

//
////2.Write a Java program to find the numbers greater than the average of the
////numbers of a given array.
//
//        int [] number = {1, 4, 17, 7, 25, 3, 100};
//        int avg=0;
//        int total=0;
//        for (int i = 0; i <= number.length -1 ; i++) {
//            total+=number[i];
//
//        }
//        avg=total/ number.length;
//        System.out.println("The average of the said array is: "+avg);
//        for (int i = 0; i < number.length ; i++) {
//            if(number[i]>avg)
//            {
//                System.out.println(" The numbers in the said array that are greater than the average are: "+number[i] );
//            }
//
//        }
//
//        //3.Write a Java program to get the larger value between first and last
//        //element of an array of integers.
//        //Original Array:
//        //[20, 30, 40]
//
//
      
//        //3.Write a Java program to get the larger value between first and last
//        //element of an array of integers.
//        //Original Array:
//        //[20, 30, 40]
//
//        int[] number = {20, 30,50 ,60,};
//
//
//        int first = number[0];
//        int last= number[number.length-1];
//
//        int largValue=(first>last) ? first : last;
//
//        System.out.println(largValue);
//
//

            }
        }

//        //4.Write a Java program to swap the first and last elements of an array and
//        //create a new array.
//
//        ArrayList<Integer> number = new ArrayList<>();
//        ArrayList<Integer> newNumber = new ArrayList<>();
//        number.add(20);
//        number.add(30);
//        number.add(40);
//        number.add(50);
//
//
//       System.out.println("Array Before swapping first and last: " + number);
//
//
//        int numberZ=number.get(0);
//        number.set(0 , number.get(number.size()-1 ));
//        number.set(number.size()-1, numberZ);
//        System.out.println("Array after swapping first and last: " + number);
//    }
//}
//
//        //5. Write a program that places the odd elements of an array before the
//        //even elements.
//
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(40);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(4);
//        numbers.add(10);
//        numbers.add(7);
//
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 != 0) {
//                result.add(numbers.get(i));
//            }
//        }
//
//
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                result.add(numbers.get(i));
//            }
//        }
//
//        System.out.println(result);

////6. Write a program that test the equality of two arrays.
//
//
//
//        ArrayList<Integer> array1 = new ArrayList<>();
//        ArrayList<Integer> array2 = new ArrayList<>();
//
//
//        System.out.println("enter size of array 1: ");
//        int size1 = input.nextInt();
//
//        System.out.println("enter numbers of array 1: ");
//
//
//        for (int i = 0; i < size1; i++) {
//            array1.add(input.nextInt());
//        }
//
//
//        System.out.println("enter size of array 2: ");
//        int size2 = input.nextInt();
//
//        System.out.println("enter numbers of array 2:");
//        for (int i = 0; i < size2; i++) {
//            array2.add(input.nextInt());
//        }
//
//
//        boolean isEqual = array1.equals(array2);
//
//        if(isEqual==true)
//        {
//            System.out.println("is same array!");
//        }
//        else
//        System.out.println("is not same array!");

    }
}





