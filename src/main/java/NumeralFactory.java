class NumeralFactory {
    static Numeral createNumeralInstance(char letter) {
        Numeral numeral;
        switch (letter) {
            case 'I':
                numeral = new One();
                break;
            case 'V':
                numeral = new Five();
                break;
            case 'X':
                numeral = new Ten();
                break;
            default:
                numeral = null;
        }
        return numeral;
    }
}


