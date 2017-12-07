public class JavaExplore {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // alphabet.chars().filter( p -> (p & 0x80) != 0).forEach( c -> System.out.println(c));
        // alphabet.chars().forEach( c -> System.out.println( c & 0x80));

        // char ch = 'A';
        // ch = Character.toLowerCase(ch);
        // System.out.println(ch);


        StringBuilder sb = new StringBuilder("This is  a phrase");

        for(int k=0; k<sb.length(); k++) {
            if( isVowel(sb.charAt(k))) {
                sb.setCharAt(k, 'x');
            }
        }
        System.out.println(sb);
    }

    public static boolean isVowel(char ch)
    {
        return( ch == 'i');
    }
}