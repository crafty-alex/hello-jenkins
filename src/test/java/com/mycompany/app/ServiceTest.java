package com.mycompany.app;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({SpringExtension.class})
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.MOCK, classes = App.class)
class ServiceTest {

    @Test
    void whatsTheAnswer() {
        Service service = new Service();
        assertEquals(42, service.whatsTheAnswer());
    }
}