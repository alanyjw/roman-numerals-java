import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsToDecimalConverterTest {
    private RomanNumeralsToDecimalConverter subject;

    @Before
    public void setUp() throws Exception {
        subject = new RomanNumeralsToDecimalConverter();
    }

    @Test
    public void runConvertsRomanNumeralsOneToTen() throws Exception {
        assertThat(subject.run("I")).isEqualTo(1);
        assertThat(subject.run("II")).isEqualTo(2);
        assertThat(subject.run("III")).isEqualTo(3);
        assertThat(subject.run("IV")).isEqualTo(4);
        assertThat(subject.run("V")).isEqualTo(5);
    }

    @Test
    public void runConvertsRomanNumeralsSixToTen() throws Exception {
        assertThat(subject.run("VI")).isEqualTo(6);
        assertThat(subject.run("VII")).isEqualTo(7);
        assertThat(subject.run("VIII")).isEqualTo(8);
        assertThat(subject.run("IX")).isEqualTo(9);
        assertThat(subject.run("X")).isEqualTo(10);
    }

    @Test
    public void runConvertsRomanNumeralsElevenToTwenty() throws Exception {
        assertThat(subject.run("XI")).isEqualTo(11);
        assertThat(subject.run("XII")).isEqualTo(12);
        assertThat(subject.run("XIII")).isEqualTo(13);
        assertThat(subject.run("XIV")).isEqualTo(14);
        assertThat(subject.run("XV")).isEqualTo(15);
        assertThat(subject.run("XVI")).isEqualTo(16);
        assertThat(subject.run("XVII")).isEqualTo(17);
        assertThat(subject.run("XVIII")).isEqualTo(18);
        assertThat(subject.run("XIX")).isEqualTo(19);
        assertThat(subject.run("XX")).isEqualTo(20);
    }

    @Test
    public void runConvertsRomanNumeralsFortyOneToFifty() throws Exception {
        assertThat(subject.run("XLI")).isEqualTo(41);
        assertThat(subject.run("XLII")).isEqualTo(42);
        assertThat(subject.run("XLIII")).isEqualTo(43);
        assertThat(subject.run("XLIV")).isEqualTo(44);
        assertThat(subject.run("XLV")).isEqualTo(45);
        assertThat(subject.run("XLVI")).isEqualTo(46);
        assertThat(subject.run("XLVII")).isEqualTo(47);
        assertThat(subject.run("XLVIII")).isEqualTo(48);
        assertThat(subject.run("XLIX")).isEqualTo(49);
        assertThat(subject.run("L")).isEqualTo(50);
    }

    @Test
    public void runConvertsRomanNumeralsFiftyOneToSixty() throws Exception {
        assertThat(subject.run("LI")).isEqualTo(51);
        assertThat(subject.run("LII")).isEqualTo(52);
        assertThat(subject.run("LIII")).isEqualTo(53);
        assertThat(subject.run("LIV")).isEqualTo(54);
        assertThat(subject.run("LV")).isEqualTo(55);
        assertThat(subject.run("LVI")).isEqualTo(56);
        assertThat(subject.run("LVII")).isEqualTo(57);
        assertThat(subject.run("LVIII")).isEqualTo(58);
        assertThat(subject.run("LIX")).isEqualTo(59);
        assertThat(subject.run("LX")).isEqualTo(60);
    }

    @Test
    public void runConvertsRomanNumeralsNinetyOneToHundred() throws Exception {
        assertThat(subject.run("XCI")).isEqualTo(91);
        assertThat(subject.run("XCII")).isEqualTo(92);
        assertThat(subject.run("XCIII")).isEqualTo(93);
        assertThat(subject.run("XCIV")).isEqualTo(94);
        assertThat(subject.run("XCV")).isEqualTo(95);
        assertThat(subject.run("XCVI")).isEqualTo(96);
        assertThat(subject.run("XCVII")).isEqualTo(97);
        assertThat(subject.run("XCVIII")).isEqualTo(98);
        assertThat(subject.run("XCIX")).isEqualTo(99);
        assertThat(subject.run("C")).isEqualTo(100);
    }
}