import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Stack;
class stack {
    private int arr[];
    private int top;
    private int capacity;

    // Конструктор для инициализации stack
    stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Вспомогательная функция для добавления элемента `x` в stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Вспомогательная функция для извлечения верхнего элемента из stack
    public int pop() {
        // проверка на опустошение stack
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());

        // уменьшаем размер stack на 1 и (необязательно) возвращаем извлеченный элемент
        return arr[top--];
    }

    // Вспомогательная функция для проверки, пуст stack или нет
    public boolean isEmpty() {
        return top == -1;               // или return size() == 0;
    }

    // Вспомогательная функция для проверки, заполнен ли stack или нет
    public boolean isFull() {
        return top == capacity - 1;     // или return size() == capacity;
    }
    // Вспомогательная функция для возврата верхнего элемента stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }

        return -1;
    }
}
public class Main {
    public static void main(String[] args) {


        Stack stack = new Stack();
        int n=0;
        System.out.println("Введите число ");
        Scanner sc1 = new Scanner(System.in);
        try {
            n = sc1.nextInt();

        } catch (InputMismatchException fg)
        {
            System.out.print("Вы ввели не число." );
        }
        System.out.print("число =");
        char [] numbers = String.valueOf(n).toCharArray();
        for(char num : numbers){
            stack.push(num);}

        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print( stackNum);
        }
    }
}