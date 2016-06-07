class Ten implements Numeral {
    public int value() { return 10; }

    public int value(char previousLetter) {
        if (previousLetter == 'I') return 8;
        return value();
    }
}
