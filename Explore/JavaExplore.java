public class JavaExplore {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // alphabet.chars().filter( p -> (p & 0x80) != 0).forEach( c -> System.out.println(c));
        alphabet.chars().forEach( c -> System.out.println( c & 0x80));
    }
}