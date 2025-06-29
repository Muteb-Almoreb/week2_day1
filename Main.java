import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[] number = new int[5];
//        char[] chara = new char[3];
//        String[] s = new String[3];
//        boolean[] b = new boolean[3];
//        chara[0] = 'a';
//        chara[1] = 'b';
//        chara[2] = 'c';
//        b[0] = true;
//        b[1] = false;
//        b[2] = true;
//
//        s[0] = "muteb";
//        s[1] = "ahmed";
//        s[2] = "almoreb";
//
//        number[0] = 10;
//        number[1] = 20;
//        number[2] = 30;
//        number[3] = 40;
//        number[4] = 50;
//        System.out.println(Arrays.toString(chara));
//        System.out.println(Arrays.toString(number));
//        System.out.println(Arrays.toString(s));


//        String name[] = {"ahmed", "ali", "mussab", "sami", "saleh"};
//        System.out.println("enter length of arrays: ");
//        int length = input.nextInt();
//        int num[] = new int[length];
//        int max = 0;
//        for (int i = 0; i <= num.length - 1; i++) {
//            System.out.println("enter numbers");
//            int nums = input.nextInt();
//            num[i] = nums;
//
//
//        }
//        ArrayList<String> cars= new ArrayList<>();
//        cars.add("bmw");
//        cars.add("chvy");
//        cars.add("kia");
//        cars.add("gmc");
//        System.out.println(cars.get(0));
//
//        ArrayList<Integer> number = new ArrayList<>();
//        ArrayList<Integer> numberE = new ArrayList<>();
//        ArrayList<Integer> numberO = new ArrayList<>();
//        number.add(12);
//        number.add(25);
//        number.add(7);
//        number.add(8);
//        number.add(10);
//        number.add(5);
//        number.add(55);
//
//        for (int i = 0; i <= number.size() - 1; i++) {
//            if (number.get(i) % 2 == 0) {
//                numberE.add(number.get(i));
//            } else if (number.get(i) % 2 != 0)
//                numberO.add(number.get(i));
//
//
//        }
//
//
//        System.out.println("even number" + numberE);
//        System.out.println("odd number" + numberO);
//
//ArrayList<Integer> number = new ArrayList<>();
//        number.add(12);
//        number.add(25);
//        number.add(7);
//        number.add(8);
//        number.add(10);
//        number.add(5);
//        number.add(55);
//
//        int total=0;
//        for (int i = 0; i <number.size() ; i++) {
//            total+=number.get(i);
//
//        }
//        System.out.println(total/number.size());
//
//
//    }

//        //1.Write a Java program to test if the first and the last element of an array of
//        //integers are same. The length of the array must be greater than or equal to
//        //2 Test Data:
//        //array = 50, -20, 0, 30, 40, 60, 10
//
//        int [] num = new int [4];
//        boolean isSame=true;
//        num[0]=10;
//        num[1]=20;
//        num[2]=30;
//        num[3]=40;
////        for(int i=0;i<=num.length;i++)
////        {
////            if(num[i]==num[i])
////            {
////
////
////            }
////
////        }
//
//        if(num[0]==num[3])
//        {
//            System.out.println("true! , the number at first is same the nuumber of end: ");
//
//        }
//        else
//            System.out.println("false ! , the number at first is not same the nuumber of end:");
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
//        int[] number = {20, 30, 40};
//        int largV = 0;
//
//        for (int i = 0; i <= number.length - 1; i++) {
//            if (number[i] >= largV) {
//                largV = number[i];
//
//
//            }
//        }
//        System.out.println(largV);

//
//        //4.Write a Java program to swap the first and last elements of an array and
//        //create a new array.
//
//        ArrayList<Integer> number = new ArrayList<>();
//        ArrayList<Integer> newNumber = new ArrayList<>();
//        number.add(20);
//        number.add(30);
//        number.add(40);
//        for (int i = number.size() - 1; i >= 0; i--) {
//            newNumber.add(number.get(i));
//        }
//        System.out.println("Original Array: " + number);
//        System.out.println("New array after swapping the first and last elements: " + newNumber);

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





