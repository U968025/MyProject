package ch01;

public class _03_Variable {
    public static void main(String[] args) {
        char val1 = '홍'; //한글자의 한글 또는 영문
        String val2 = "Hello wold !!!";  //여러글자입력

        byte val3 = -128; //-128 ~ +128
        short val4 = -32768; //-32768 ~ +32768
        int val5 = 1234567890;
        long val6 = 1234567890;

        float val7 = 0.5f;
        double val8 = 0.555555;

        boolean isStart = false; //ture or fale

        System.out.println(val1);
        System.out.println(val2);

        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);

        System.out.println(val7);
        System.out.println(val8);
        System.out.println(isStart);
    }
}
