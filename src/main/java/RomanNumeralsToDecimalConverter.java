public class RomanNumeralsToDecimalConverter {
    public int run(String romanNumerals) {
        char[] letters = romanNumerals.toCharArray();

        int result = 0;

        Numeral previous = null;
        for (char letter : letters) {
            Numeral numeral = NumeralFactory.createNumeralInstance(letter);

            result += numeral.value(previous);

            previous = numeral;
        }
        return result;
    }

}
