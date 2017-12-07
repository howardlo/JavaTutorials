
/**
 * Write a description of HelloWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelloWorld {
    public static void main(String[] args) {
        int xout = 1 + 1;
        // System.out.println("Hello World" + xout);
        // System.out.println("Hi there you!");

        // StringBuilder sb = new StringBuilder("start");
        // sb.insert(4, "le");
        // System.out.println(sb);

        System.out.println(reverse("computer"));
    }

    public static String reverse(String s){
        String ret = "";
        for(int k=0; k < s.length(); k +=2){
           ret = s.charAt(k) + ret;
        }
        return ret;
     }
}