public class RomanNumeralsToDecimalConverter {
    public int run(String romanNumerals) {
        char[] letters = romanNumerals.toCharArray();

        int result = 0;

        char previousLetter = '\0';
        for (char letter : letters) {
            switch (letter) {
                case 'I':
                    result += new One(previousLetter).compute();
                    break;
                case 'V':
                    result += new Five(previousLetter).compute();
                    break;
                case 'X':
                    result += new Ten(previousLetter).compute();
                    break;
            }
            previousLetter = letter;
        }
        return result;
    }

    private class One {
        private final char previousLetter;

        public One(char previousLetter) {
            this.previousLetter = previousLetter;
        }

        public int compute() {
            return 1;
        }
    }

    private class Five {
        private final char previousLetter;

        public Five(char previousLetter) {
            this.previousLetter = previousLetter;
        }

        public int compute() {
            if (previousLetter == 'I') {
                return 3;
            }
            return 5;
        }
    }

    private class Ten {
        private final char previousLetter;

        public Ten(char previousLetter) {
            this.previousLetter = previousLetter;
        }

        public int compute() {
            if (previousLetter == 'I') {
                return 8;
            }
            return 10;
        }
    }
}
