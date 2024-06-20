package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {
    @DisabledIfEnvironmentVariable(named="USER", matches = "root")
    @Test
    public void validarAlgoSomenteNoUsuarioEmerson(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
