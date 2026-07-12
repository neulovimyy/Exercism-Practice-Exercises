class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        identifier = identifier.trim();
        for (int i = 0; i < identifier.length(); i++) {
            int j = i + 1;
            if (identifier.charAt(i) == ' ') {
                sb.append("_");
            } else if ((identifier.charAt(i) == '-') && Character.isLetter(j)) {
                sb.append(Character.toUpperCase(identifier.charAt(j)));
                i++;
            } else if (Character.isLetterOrDigit(identifier.charAt(i))) {
                sb.append(identifier.charAt(i));
            } else if (identifier.charAt(i) == '4') {
                sb.append("a");
            } else if (identifier.charAt(i) == '3') {
                sb.append("e");
            } else if (identifier.charAt(i) == '0') {
                sb.append("o");
            } else if (identifier.charAt(i) == '1') {
                sb.append("l");
            } else if (identifier.charAt(i) == '7') {
                sb.append("t");
            }
        }
        return sb.toString();
    }
}