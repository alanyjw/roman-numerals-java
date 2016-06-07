class One implements Numeral {
    public int value() { return 1; }

    public int value(Numeral previous) { return value(); }
}
