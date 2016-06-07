class Hundred implements Numeral {
    public int value() {
        return 100;
    }

    public int value(Numeral previous) {
        if (previous instanceof Ten) return 80;
        return value();
    }
}
