class Five implements Numeral {
    public int value() { return 5; }

    public int value(Numeral previous) {
        if (previous instanceof One) return 3;
        return value();
    }
}
