import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarTest {

    @Test
    public void cryptTest1() {
        // Given
        Caesar cipher = new Caesar();

        String Q1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String A1 = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";

        // When
        String actual = cipher.encrypt(Q1);
        System.out.println(Q1);
        System.out.println(A1);

        // Then
        assertEquals(A1,actual);
    }

    @Test
    public void decryptTest1() {
        // Given
        Caesar cipher = new Caesar();

        String Q1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String A1 = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";

        // When
        String actual = cipher.decrypt(A1);
        System.out.println(Q1);
        System.out.println(A1);

        // Then
        assertEquals(Q1,actual);
    }


}
