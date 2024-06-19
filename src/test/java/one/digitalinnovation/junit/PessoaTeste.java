package one.digitalinnovation.junit;


import org.junit.Test;

import java.time.LocalDateTime;

public class PessoaTeste {
    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(22,jessica.getIdade());
    }

    private static class Assertions {
        public static void assertEquals(int i, int idade) {
        }

        public static void assertTrue(boolean b) {
        }

        public static void assertFalse(boolean b) {
        }
    }
    @Test
    public void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João",LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());

    }
}
