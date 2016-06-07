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
                        result = 4;
                    } else {
                        result = 5;
                    }
                    break;
            }
            previousLetter = letter;
        }
        return result;
    }
}
