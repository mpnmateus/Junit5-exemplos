import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioMateus() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    void validarAlgoSomenteNoUsuarioMateus2() {
        Assumptions.assumeTrue("mateusnovo".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
