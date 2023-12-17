package variable.ex;
import java.util.Scanner;

public class baekjun14681 {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner in = new Scanner(System.in);

        // 사용자로부터 X와 Y 좌표를 입력받음
        int X = in.nextInt();
        int Y = in.nextInt();

        // X가 양수인 경우
        if (X > 0) {
            // Y가 양수인 경우
            if (Y > 0) {
                System.out.println(1); // 1사분면에 속함
            } else {
                System.out.println(4); // 4사분면에 속함
            }
        } else {
            // X가 음수인 경우
            if (Y > 0) {
                System.out.println(2); // 2사분면에 속함
            } else {
                System.out.println(3); // 3사분면에 속함
            }
        }

        // Scanner 객체 닫기 (자원 해제)
        in.close();
    }
}
