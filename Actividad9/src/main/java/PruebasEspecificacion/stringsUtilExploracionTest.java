package PruebasEspecificacion;

import org.junit.*;

import static org.assertj.core.api.Assertions.*;

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
