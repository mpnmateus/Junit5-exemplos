import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioMateus() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "mateu")
    void validarAlgoSomenteNoUsuarioMateus2 () {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoSistemaOpWindows () {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX, OS.OTHER})
    void validarAlgoSomenteNoSistemaOpQualquer () {
        Assertions.assertEquals(10, 5 + 5);
    }

}
