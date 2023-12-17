package variable.ex;

import java.util.Scanner;

public class backjun2525 {
    // main 메서드 선언
    public static void main(String[] args) {

        // Scanner 객체를 사용하여 입력을 받기 위한 준비
        Scanner in = new Scanner(System.in);

        // 변수 A에 정수 입력 받기
        int A = in.nextInt();
        // 변수 B에 정수 입력 받기
        int B = in.nextInt();

        // 변수 C에 정수 입력 받기
        int C = in.nextInt();

        // 시간을 분 단위로 표현한 값을 계산하여 min 변수에 저장
        int min = 60 * A + B;   // 시 -> 분
        // 초를 더하여 총 분 단위로 계산
        min += C;

        // 총 분 단위를 시간과 분으로 변환하여 hour와 minute 변수에 저장
        int hour = (min / 60) % 24;
        int minute = min % 60;

        // 결과 출력
        System.out.println(hour + " " + minute);

    }
}