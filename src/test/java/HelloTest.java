import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void hello() {
        assertEquals(1, Hello.hello());
    }
}