package PruebasEspecificacion;
import static PruebasEspecificacion.stringUtils.substringsBetween;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class stringUtilsTest {
    @Test
    void strIsNullOrEmpty() {
        assertThat(substringsBetween(null, "a", "b")) // T1
                .isEqualTo(null);
        assertThat(substringsBetween("", "a", "b")) // T2
                .isEqualTo(new String[]{});
    }
    @Test
    void openIsNullOrEmpty() {
        assertThat(substringsBetween("abc", null, "b")) // T3
                .isEqualTo(null);
        assertThat(substringsBetween("abc", "a", "")) // T4
                .isEqualTo(null);
    }
    @Test
    void closeIsNullOrEmpty() {
        assertThat(substringsBetween("abc", "a", null)) // T5
                .isEqualTo(null);
        assertThat(substringsBetween("abc", "a", "")) // T6
                .isEqualTo(null);
    }
    @Test
    void strOfLength1() {
        assertThat(substringsBetween("a", "a", "b")) // T7
                .isEqualTo(null);
        assertThat(substringsBetween("a", "b", "a")) // T8
                .isEqualTo(null);
        assertThat(substringsBetween("a", "b", "b")) // T9
                .isEqualTo(null);
        assertThat(substringsBetween("a", "a", "a")) // T10
                .isEqualTo(null);
    }
    @Test
    void openAndCloseOfLenght1() {
        assertThat(substringsBetween("abc", "x", "y")) // T11
                .isEqualTo(null);
        assertThat(substringsBetween("abc", "a", "y")) // T12
                .isEqualTo(null);
        assertThat(substringsBetween("abc", "x", "c")) // T13
                .isEqualTo(null);
        assertThat(substringsBetween("abc", "a", "c")) // T14
                .isEqualTo(new String[] {"b"});
        assertThat(substringsBetween("abcabc", "a", "c")) // T15
                .isEqualTo(new String[] {"b", "b"});
        assertThat(substringsBetween("abcabyt byrc", "a", "c"))
                .isEqualTo(new String[ ] {"b", "byt byr"});
    }
    @Test
    void openAndCloseTagsOfDifferentSizes() {
        assertThat(substringsBetween("aabcc", "xx", "yy")) // T16
                .isEqualTo(null);
        assertThat(substringsBetween("aabcc", "aa", "yy")) // T17
                .isEqualTo(null);
        assertThat(substringsBetween("aabcc", "xx", "cc")) // T18
                .isEqualTo(null);
        assertThat(substringsBetween("aabbcc", "aa", "cc")) // T19
                .isEqualTo(new String[] {"bb"});
        assertThat(substringsBetween("aabbccaaeecc", "aa", "cc")) // T20
                .isEqualTo(new String[] {"bb", "ee"});
        assertThat(substringsBetween("a abb ddc ca abbcc", "a a", "c c"))
                .isEqualTo(new String[ ] {"bb dd"});
    }
    @Test
    void notSubstringBetweenOpenAndCloseTags() {
        assertThat(substringsBetween("aabb", "aa", "bb")) // T21
                .isEqualTo(new String[] {""});
    }
}
