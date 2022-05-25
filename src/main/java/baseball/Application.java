package baseball;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
    }

    private static int[] toIntArray(byte[] bArray) {
        if(bArray.length > 3)
            throw new IllegalArgumentException();

        int[] temp = new int[bArray.length];
        for (int i = 0; i < temp.length; i++)
            temp[i] = bArray[i] - '0';

        return temp;
    }
    private static boolean compareWith(Map<Integer, Integer> numMap, int[] numArray) {
        int strike = 0;
        int ball = 0;

        for(int i = 0; i < numArray.length; i ++) {
            if (numMap.containsKey(numArray[i])) {
                if (numMap.get(numArray[i]) == i)
                    strike++;
                else
                    ball++;
            }
        }

        if (strike == 0 && ball == 0)
            System.out.println("낫싱");
        else if (strike == 0)
            System.out.printf("%d볼\n", ball);
        else if (ball == 0)
            System.out.printf("%d스트라이크\n", strike);
        else
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);

        if(strike == numArray.length) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }
        else
            return false;
    }
}
