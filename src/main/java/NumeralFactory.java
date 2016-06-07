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
            case 'L':
                numeral = new Fifty();
                break;
            case 'C':
                numeral = new Hundred();
                break;
            default:
                numeral = new Null();
        }
        return numeral;
    }
}


