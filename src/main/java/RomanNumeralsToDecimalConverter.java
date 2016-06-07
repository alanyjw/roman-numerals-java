public class RomanNumeralsToDecimalConverter {
    public int run(String romanNumerals) {
        char[] letters = romanNumerals.toCharArray();

        int result = 0;

        char previousLetter = '\0';
        for (char letter : letters) {
            Numeral numeral = NumeralFactory.createNumeralInstance(letter);

            result += numeral.value(previousLetter);

            previousLetter = letter;
        }
        return result;
    }

}
