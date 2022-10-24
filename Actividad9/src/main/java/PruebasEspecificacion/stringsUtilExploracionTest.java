package PruebasEspecificacion;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class stringsUtilExploracionTest {
    @Test
    public void simpleCase(){
        assertThat(
                stringUtils.substringsBetween("abcd", "a", "d")
        ).isEqualTo(new String[] { "bc" });
    }
    @Test
    public void manyStrings(){
        assertThat(
                stringUtils.substringsBetween("abcdabcdab", "a", "d")
        ).isEqualTo(new String[] { "bc", "bc" });
    }
    @Test
    public void openAndCloseTagsThatAreLongerThan1Char(){
        assertThat(
                stringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")
        ).isEqualTo(new String[] { "bc", "bf" });
    }
}
