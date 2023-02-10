package ch04;

public class _01_Method {
    //Method Define One
    public static void sayHello() {
        System.out.println("안녕하세요 !!!!!!!");
    }
    //Method Define Two
    public static void sayHello(int number, int cnt) {
        int result = number * cnt;
        System.out.println(result);
    }
    //
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0,index);

        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    //method 예제
    public static void main(String[] args) {
        //Method Call
        sayHello();
        sayHello(2,3);

        String name = "홍기형";
        String id = "650120-1019626";
        String phone = "010-5311-1771";

        System.out.println("성명:"+getHiddenData(name,1));
        System.out.println("주민번호:"+getHiddenData(id,8));
        System.out.println("전화번호:"+getHiddenData(phone,9));
    }
}
