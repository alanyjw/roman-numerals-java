class Fifty implements Numeral {
    public int value() {
        return 50;
    }

    public int value(Numeral previous) {
        if (previous instanceof Ten) return 30;
        return value();
    }
}
