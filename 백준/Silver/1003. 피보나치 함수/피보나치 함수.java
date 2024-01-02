import java.util.Scanner;
 
public class Main {

    static Integer[][] li = new Integer[41][2];
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        li[0][0] = 1; // N=0 일 때의 0 호출 횟수
        li[0][1] = 0; // N=0 일 떄의 1 호출 횟수
        li[1][0] = 0; // N=1 일 때의 0 호출 횟수
        li[1][1] = 1; // N=1 일 떄의 1 호출 횟수

        int cnt = sc.nextInt();

        while(cnt-- > 0) {
            int N = sc.nextInt();
            fibonacci(N);
            System.out.println(li[N][0] + " " + li[N][1]);
        }

    }

    static Integer[] fibonacci(int N) {
        // N에 대한 0, 1의 호출 횟수가 없을 때(탐색하지 않은 값일 때)
        if(li[N][0] == null || li[N][1] == null) {
            // 각 N에 대한 0 호출 횟수와 1 호춣 횟수를 재귀호출한다.
            li[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            li[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        // N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
        return li[N];
    }
}