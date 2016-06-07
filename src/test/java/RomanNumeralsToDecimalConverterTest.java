import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsToDecimalConverterTest {
    @Test
    public void runConvertsRomanNumeralsOneToTen() throws Exception {
        RomanNumeralsToDecimalConverter subject = new RomanNumeralsToDecimalConverter();
        assertThat(subject.run("I")).isEqualTo(1);
        assertThat(subject.run("II")).isEqualTo(2);
        assertThat(subject.run("III")).isEqualTo(3);
        assertThat(subject.run("IV")).isEqualTo(4);
        assertThat(subject.run("V")).isEqualTo(5);
    }
}