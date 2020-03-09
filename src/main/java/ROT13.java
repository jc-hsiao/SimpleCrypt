import static java.lang.Character.*;

public class ROT13  {

    Character cs;
    Character cf;

    ROT13(Character cs, Character cf) {
     this.cs = cs;
     this.cf = cf;
    }

    ROT13() {
    }


    public String crypt(String text){
        StringBuilder s = new StringBuilder();
        int n = cf-cs;
        for (char c :text.toCharArray()) {
            s.append( isLetter(c) ? shiftChar(c,n) : c );
        }
        return s.toString();
    }

    public static char shiftChar(char c, int n){
        int start = 'a';
        if( Character.isUpperCase(c))
            start = 'A';

        if(n<0)
            return (char)(((c-start+( 26+n ))%26)+start);
        else
            return (char)(((c-start+n)%26)+start);
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        StringBuilder s = new StringBuilder();
        int n = cf-cs;
        for (char c :text.toCharArray()) {
            s.append( isLetter(c) ? shiftChar(c,26-n) : c );
        }
        return s.toString();
    }

    public static String rotate(String s, Character shift) {
        return s.substring(s.indexOf(shift)) + s.substring(0,s.indexOf(shift));
    }

}
