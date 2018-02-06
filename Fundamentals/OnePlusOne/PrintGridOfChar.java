
/**
 * Write a description of PrintGridOfChar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintGridOfChar {
        public static void main(String[] args) {

            int n = Integer.valueOf(args[0]);
            System.out.println(n);
            for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++) {
            System.out.print("I");
        }
        System.out.println();
    }
}
}
