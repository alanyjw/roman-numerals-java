class Five implements Numeral {
    public int value() { return 5; }

    public int value(char previousLetter) {
        if (previousLetter == 'I') return 3;
        return value();
    }
}
