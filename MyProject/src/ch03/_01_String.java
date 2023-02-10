package ch03;

import java.util.Locale;

public class _01_String {
    public static void main(String[] args) {
        String comment = "I Like Java and c and Pyson.";
        //문자길이
        System.out.println(comment.length());
        //대문자 소문자
        System.out.println(comment.toUpperCase());
        System.out.println(comment.toLowerCase());
        System.out.println(comment.indexOf("Java"));

        System.out.println(comment.lastIndexOf("."));

        System.out.println(comment.replace("and",","));
        System.out.println(comment.substring(comment.indexOf("Java"), comment.indexOf(".")));

        //문자열비교 comment.equals

        // \n:Enter \t:Tap \\:디렉토리표시 \":"" 속에 ""
    }
}
