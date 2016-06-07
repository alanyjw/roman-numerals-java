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
}