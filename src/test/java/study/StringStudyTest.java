package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class StringStudyTest {

    @Nested
    class split_테스트 {

        @Test
        @DisplayName("1과 2로 분리할 경우 테스트")
        void splitTestOneAndTwo() {
            String input = "1,2";
            String[] splitedInput = input.split(",");

            assertThat(splitedInput).containsExactly("1", "2");
        }

        @Test
        @DisplayName("1로만 분리할 경우 테스트")
        void splitTestOnlyOne() {
            String input = "1";
            String[] splitedInput = input.split(",");

            assertThat(splitedInput).containsExactly("1");
        }

        @Test
        @DisplayName("특정 문자 제거 테스트")
        void removeSpecialCharacterTest() {
            String input = "(1,2)";
            String replacedInput = input.replaceAll("[()]", "");

            assertThat(replacedInput).isEqualTo("1,2");
        }

        @Test
        @DisplayName("특정_문자_위치_찾기_문자열로_특정_문자_찾기_테스트")
        void findCharIndexByStringTest() {
            String input = "abc";

            assertThat(input.indexOf("a")).isEqualTo(0);
            assertThat(input.indexOf("b")).isEqualTo(1);
            assertThat(input.indexOf("c")).isEqualTo(2);
        }
    }
}
