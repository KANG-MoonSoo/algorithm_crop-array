import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (num1 <= i && i <= num2){
                answer[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}