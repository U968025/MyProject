package ch01;

public class _04_Array {
    public static void main(String[] args) {
        String chr[] = {"A","B","C"};
        int arrayInt[] = new int[10];
        int arrayInt2[] = {1,0,5,8};

        for(int i = 0; i < arrayInt.length; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < arrayInt2.length; i++) {
            System.out.println(arrayInt2[i]);
        }

        for(int i = 0; i < chr.length; i++) {
            System.out.println(chr[i]);
        }
    }
}
