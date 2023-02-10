package ch01;

public class _08_TypeCasting {
    public static void main(String[] args) {
        //int -> float,double
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        //float -> double,int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //int < long < float < double

        //숫자 -> 문자
        String chr01 = String.valueOf(100);
        chr01 = Integer.toString(100);
        System.out.println(chr01);

        String chr02 = String.valueOf(100.0);
        chr02 = Double.toString(100.0);
        System.out.println(chr02);

        //문자 -> 숫자
        int int01 = Integer.parseInt("999");
        System.out.println(int01);

        Double diu01 = Double.parseDouble("999.99");
        System.out.println(diu01);
    }
}
