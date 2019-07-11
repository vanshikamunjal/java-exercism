class RotationalCipher {
    int key;
    RotationalCipher(int shiftKey) {
        this.key = shiftKey;
    }
    String rotate(String data) {
        String result = "";
        for(int i=0; i<data.length(); i++){
            if(Character.isLetter(data.charAt(i)))
                if(Character.isUpperCase(data.charAt(i))){
                    char ch = (char)(((int)data.charAt(i) + key - 65) % 26 + 65);
                    result += ch;
                }
                else{
                    char ch = (char)(((int)data.charAt(i) + key - 97) % 26 + 97);
                    result += ch;
                }
            else
                result += data.charAt(i);
        }
        return result;
    }
}

