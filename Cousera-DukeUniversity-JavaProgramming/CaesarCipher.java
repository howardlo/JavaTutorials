
public class CaesarCipher {
    public static void main(String[] args) {


        System.out.println(CeasarCipher("programming can be fun", 23));
        if( true) return;

        Integer[] frequency = CreateAlaphabetFrequency("the quick brown fox jumps over the lazy dog");

        System.out.println("-----------------------------------------");
        for(int i=97; i<122; i++) {
            int c = i;
            System.out.printf("%c 0x%02X %d | %d%n", c, c, c, frequency[c]);
        }
            
        // System.out.println(CeasarCipher("I AM", 17));
    }

    public static Integer[]  CreateAlaphabetFrequency( String s)
    {
        Integer[] frequency = new Integer[128];
        for(int i=0; i<128; i++) { frequency[i] = new Integer(0); }

        s.chars().forEach(c -> {
            // System.out.println(c);
            frequency[c]++;
            System.out.printf("%c 0x%02X %d | %d%n", c, c, c, frequency[c]);
        });
        return frequency;
    }

    public static String CeasarCipher(String s, int key)
    {
        // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            int oindex = alphabet.indexOf(s.charAt(i));
            if( oindex > -1) {
            int index = (oindex + key) % alphabet.length();
            char encryptedChar = alphabet.charAt(index);
            System.out.printf("%c %d | %c %d %n", s.charAt(i), oindex, encryptedChar, index);
            sb.insert(i, encryptedChar);
            } else {
            sb.insert(i, s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String ReverseString(String s)
    {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            sb.insert(i, s.charAt(n-i-1));
        }
        return sb.toString();
    }
}
