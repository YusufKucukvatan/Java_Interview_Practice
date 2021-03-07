package package2;

public class Divisible {
    public static void main(String[] args) {
        solution(30);
    }

    public static void solution(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0)
                    System.out.print("Codility ");
                if (i % 3 == 0)
                    System.out.print("Test ");
                if (i % 5 == 0)
                    System.out.print("Coders ");
                System.out.println(" ");
            } else {
                System.out.print(i + " ");
                System.out.println(" ");
            }
        }
    }

}
