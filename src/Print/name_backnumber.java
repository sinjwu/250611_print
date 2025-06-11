package Print;

public class name_backnumber {
    public static void main(String[] args) {
        String name = "손흥민 ";
        Integer backNumber = 7;

        System.out.println((name + backNumber).getClass().getName());
        System.out.println(((Object) backNumber).getClass().getName());
        System.out.println(name + backNumber);
        System.out.println((Object) backNumber);
        }
}
