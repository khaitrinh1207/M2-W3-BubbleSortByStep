import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của list :");
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("nhập phần tử " + (i + 1) + ": ");
            list[i] = sc.nextInt();
        }
        System.out.println("Hiện thị list:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Đổi chỗ " + list[i] + " cho " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng có thể sắp xếp và không cần chuyển tiếp");
                break;
            }
            System.out.println("list sau khi sắp xếp");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
