package C05_균형잡힌세상_4949;

public class Test {
    public static void main(String[] args) {
        String str = "((((";
        System.out.println(str); // "(((("

        System.out.println(str.substring(0, 3)); // "((("
        System.out.println(str);    // "(((("
        str = str.replace("(", "");

        System.out.println(str); // ""
    }
}
