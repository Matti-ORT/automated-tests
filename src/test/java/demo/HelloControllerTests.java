package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import demo.DemoApplication.HelloController;

public class HelloControllerTests {
    @Test 
    void leMessageHelloDoitEtreCorrecte(){
        HelloController controller= new HelloController();
        String message = controller.hello();

        assertEquals("Hello CI/CD", message);
    }
}
