package one.digitalinnovation.junit;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class AssumptionsTeste {
    @Test
    public void validarAlgoSomenteNoUsuarioEmerson(){
        Assumptions.assumeFalse("Emerson".equals(System.getenv("USER")));
        Assertions.assertEquals(10,5+5);
    }


}
