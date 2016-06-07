public class RomanNumeralsToDecimalConverter {
    public int run(String romanNumerals) {
        char[] letters = romanNumerals.toCharArray();

        int result = 0;

        char previousLetter = '\0';
        for (char letter : letters) {
            switch (letter) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    if (previousLetter == 'I') {
                        result += 3;
                    } else {
                        result += 5;
                    }
                    break;
                case 'X':
                    if (previousLetter == 'I') {
                        result += 8;
                    } else {
                        result += 10;
                    }
                    break;
            }
            previousLetter = letter;
        }
        return result;
    }
}
