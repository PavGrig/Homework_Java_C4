import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите первое число: ");
        int num2 = scan.nextInt();

        Deque<Character> dqNum1 = new ArrayDeque<>(CreateDeque(num1));
        Deque<Character> dqNum2 = new ArrayDeque<>(CreateDeque(num2));
        System.out.println(dqNum1);
        System.out.println(dqNum2);
        
        int num1_1 = numForEx(dqNum1);
        int num2_2 = numForEx(dqNum2);

        int sum = num1_1 + num2_2;
        int prod = num1_1 * num2_2;

               
        System.out.println(CreateResult(sum));
        System.out.println(CreateResult(prod));

        scan.close();
    }
    public static Deque<Character> CreateDeque(int num) {
        Deque<Character> dequeNum = new ArrayDeque<>();

        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            dequeNum.addFirst(str.charAt(i));
        }
        return dequeNum;
    }
    
        public static Integer numForEx(Deque<Character> deq) {
        StringBuilder sb = new StringBuilder();
        for (int i = deq.size(); i > 0; i--) {
            sb.append(deq.pollLast());
        }
        int num = Integer.parseInt(sb.toString());
        
        return num;
    }
    public static Deque<Character> CreateResult(int num) {
        Deque<Character> dequeNum = new ArrayDeque<>();

        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            dequeNum.addLast(str.charAt(i));
        }
        return dequeNum;
    }
}
