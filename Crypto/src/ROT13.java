import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++){

            //http://sticksandstones.kstrom.com/appen.html
            //store the value of the character to be appended to the sb
            //when we store the char c and add or subtract 13 to it, it allows us to perform math with char because of the
            //ASCII values so a with ASCII value 97 will go up by 13 to N 110
            //no need to complicate this shit with maps,
            //review if we can manipulate more than ASCII in java
            char c = text.charAt(i);

            int bb = text.charAt(i);
            //a to m because the 13TH letter after A is N
            if (c >= 'a' &&  c <= 'm'){
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if ( c >= 'N' && c <= 'Z'){
                c -= 13;
            }
            sb.append(c);
        }

        return String.valueOf(sb);
    }

    public String encrypt(String text) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++){

            //http://sticksandstones.kstrom.com/appen.html
            //store the value of the character to be appended to the sb
            //when we store the char c and add or subtract 13 to it, it allows us to perform math with char because of the
            //ASCII values so a with ASCII value 97 will go up by 13 to N 110
            //no need to complicate this shit with maps,
            //review if we can manipulate more than ASCII in java
            char c = text.charAt(i);

            int bb = text.charAt(i);
            //a to m because the 13TH letter after A is N
            if (c >= 'a' &&  c <= 'm'){
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if ( c >= 'N' && c <= 'Z'){
                c -= 13;
            }
            sb.append(c);
        }

        return String.valueOf(sb);
    }

    public String decrypt(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++){

            //http://sticksandstones.kstrom.com/appen.html
            //store the value of the character to be appended to the sb
            //when we store the char c and add or subtract 13 to it, it allows us to perform math with char because of the
            //ASCII values so a with ASCII value 97 will go up by 13 to N 110
            //no need to complicate this shit with maps,
            //review if we can manipulate more than ASCII in java
            char c = text.charAt(i);

            int bb = text.charAt(i);
            //a to m because the 13TH letter after A is N
            if (c >= 'a' &&  c <= 'm'){
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if ( c >= 'N' && c <= 'Z'){
                c -= 13;
            }
            sb.append(c);
        }

        return String.valueOf(sb);
    }

    public static String rotate(String s, Character c) {
        StringBuilder sb = new StringBuilder();

        int start = s.charAt(0);
        int shift = c.charValue();
        int rotateBy = shift - start;

        //EX "ABCDEF"
        //add the shifted array to string builder till the end of the string
        for (int i = rotateBy; i < s.length(); i++){
            char firstShift = s.charAt(i);
            sb.append(firstShift);
        }// this loop sb "DEF"

        //then this loop sb "ABC
        //add the first half of the string till the rotate by
        for (int i = 0; i < rotateBy; i++){
            char secondShift = s.charAt(i);
            sb.append(secondShift);
        }

        return String.valueOf(sb);
    }

}
