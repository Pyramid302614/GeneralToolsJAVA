
// status: untested

import CHAR.Functions.Alphabet;

public class CustomAlphabet {

    private char[] customAlphabet = {};

    public CustomAlphabet(char[] customAlphabet) {

        this.customAlphabet = customAlphabet;

    }


    public String encode(String value) {

        char[] alphabet = new Alphabet().getCharAlphabet();
        return "This is unfinished.";

    }



    public char[] getCustomAlphabet() {
    
        return this.customAlphabet;

    }

    public void setCustomAlphabet(char[] customAlphabet) {

        this.customAlphabet = customAlphabet;

    }

}