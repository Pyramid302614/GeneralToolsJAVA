package STRING.Functions;



public class Alphabet {

    public String[] getStringAlphabet() {

        char[] alphabet = new CHAR.Functions.Alphabet(). getCharAlphabet();
        String[] stringAlphabet = new String[alphabet.length];
        for(int i = 0; i < alphabet.length; i++) {
            stringAlphabet[i] = Character.toString(alphabet[i]);
        }
        return stringAlphabet;

    }
        


}
