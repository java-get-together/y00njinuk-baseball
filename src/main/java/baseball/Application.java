package baseball;

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
}
