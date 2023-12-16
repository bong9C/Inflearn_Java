package variable.ex;
import java.util.Scanner;
public class backjun2884 {

public static void main(String[] args) {
    // Scanner 객체 생성
    Scanner in = new Scanner(System.in);

    // 시간(Hour) 입력 받기
    int H = in.nextInt();

    // 분(Minute) 입력 받기
    int M = in.nextInt();

    // Scanner 닫기 (자원 관리를 위해 권장됨)
    in.close();

    // 만약 분(Minute)이 45 미만이면
    if (M < 45) {
        // 시간(Hour)을 1 감소
        H--;

        // 분(Minute)을 60에서 (45 - M) 만큼 뺀 값으로 설정
        M = 60 - (45 - M);

        // 시간(Hour)이 음수가 되면, 23으로 설정 (24시간 체계에서 0시는 24시와 같음)
        if (H < 0) {
            H = 23;
        }

        // 결과 출력
        System.out.println(H + " " + M);
    } else {
        // 분(Minute)이 45 이상이면, 시간(Hour)은 그대로이고 분(Minute)에서 45를 뺀 값으로 출력
        System.out.println(H + " " + (M - 45));
    }
}
}
