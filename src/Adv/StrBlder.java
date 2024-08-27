package Adv;

public class StrBlder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb = sb.append("!");

        String message = sb.toString();
        System.out.println("Hash code of message: " + message.hashCode());
        System.out.println("Hash code of sb: " + sb.hashCode());
        System.out.println(sb);
        System.out.println(message);
        System.out.println(sb.toString());// Output: Hello world!

    }
}
