class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        char[] characters = identifier.toCharArray();
        for (int i=0; i<characters.length; i++) {
            int j = i+1;
            if (characters[i] == ' ') {
                sb.append('_');
            } else if (characters[i] == '-' && Character.isLetter(characters[j])) {
                sb.append(Character.toUpperCase(characters[j]));
                i++;
            } else if (characters[i] == '4') {
                sb.append("a");
            } else if (characters[i] == '3') {
                sb.append("e");
            } else if (characters[i] == '0') {
                sb.append("o");
            } else if (characters[i] == '1') {
                sb.append("l");
            } else if (characters[i] == '7') {
                sb.append("t");
            } else if (Character.isLetterOrDigit(characters[i])) {
                sb.append(characters[i]);
            }
        }
        return sb.toString();
    }
}