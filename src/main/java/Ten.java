class Ten implements Numeral {
    public int value() { return 10; }

    public int value(Numeral previous) {
        if (previous instanceof One) return 8;
        return value();
    }
}
