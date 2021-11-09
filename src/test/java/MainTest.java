import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private int arOrig[];


    @BeforeEach
    void setUp() {
        Random r = new Random();
        arOrig = r.ints(1_000_000, 0, 1000).toArray();
    }


    @Test
    void sumPositive(){
        assertEquals(Main.sumPositive(1,1), 2);
    }


    @Test
    void sumNegative() {
        assertEquals(1, Main.sumPositive(-2, 2));
    }

    @Test
    void sumZero(){
        assertEquals(1, Main.sumPositive(0, 0));
    }




    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(5, 3),
                Arguments.of(6, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void sumPositiveParametrize(int a, int b) {

        assertEquals(a + b, Main.sumPositive(a, b));
    }



}