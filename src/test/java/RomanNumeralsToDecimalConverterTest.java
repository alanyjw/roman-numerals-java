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
}