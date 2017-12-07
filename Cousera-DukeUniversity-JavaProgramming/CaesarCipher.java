
public class CaesarCipher {
    public static void main(String[] args) {


        System.out.println(EncryptStringWith2Keys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21));
        // System.out.println(EncryptStringWith2Keys("First Legion", 23, 17));
        // System.out.println(EncryptString("FIRST LEGION ATTACK EAST FLANK!", 23));
        if( true) return;

        System.out.println(CaesarCipher("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15));
        System.out.println(CaesarCipher("programming can be fun", 23));

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

    public static char EncryptLowerChar(char c, int key)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int oindex = alphabet.indexOf(c);
        char encryptedChar = c;
        if( oindex > -1) {
            int index = (oindex + key) % alphabet.length();
            encryptedChar = alphabet.charAt(index);
            System.out.printf("%c %d | %c %d %n", c, oindex, encryptedChar, index);
        }
        return encryptedChar;
    }

    public static char EncryptUpperChar(char c, int key)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int oindex = alphabet.indexOf(c);
        char encryptedChar = c;
        if( oindex > -1) {
            int index = (oindex + key) % alphabet.length();
            encryptedChar = alphabet.charAt(index);
            System.out.printf("%c %d | %c %d %n", c, oindex, encryptedChar, index);
        }
        return encryptedChar;
    }

    public static String EncryptStringWith2Keys(String s, int key1, int key2)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            int key = i%2 == 0 ? key1 : key2;
            char c = EncryptLowerChar(s.charAt(i), key);
            c = EncryptUpperChar(c, key);
            sb.append(c);
        }

        return sb.toString();
    }

    public static String EncryptString(String s, int key)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = EncryptLowerChar(s.charAt(i), key);
            c = EncryptUpperChar(c, key);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String CaesarCipher(String s, int key)
    {
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
        
        s = sb.toString();
        sb = new StringBuilder();
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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
