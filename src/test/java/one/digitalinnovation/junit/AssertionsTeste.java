package one.digitalinnovation.junit;


import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class AssertionsTeste {
    @Test
    public void validarLancamentos() {
        /* Valida se os arrays são iguais, comparando um a um */
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        assertArrayEquals(primeiroLancamento, segundoLancamento);

        /* Utilizando arrays de diferentes tipos, começando por boolean[] */
        boolean[] flags = {true, false, false};
        assertArrayEquals(new boolean[]{true, false, false}, flags);

    }

    @Test
    public void validaSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);

    }

    @Test
    public void validaNomesDiferentes() {
        String nome = "Emerson";
        String sobreNome = "Pessoa";

        assertNotNull(nome, sobreNome);
    }

    @Test
    public void validaValoresDiferentes() {
        int x = 5;
        int y = 5;

        assertNotEquals(5, 6);
    }

    @Test
    public void validaAlgumaCondicaoEhFalse(){
        boolean condicao = 5 + 6 == 12;
        assertFalse(condicao);
    }

    @Test
    public  void validaAlgumaCondicaoEhVerdadeiro(){
        boolean condicao = 6 + 6 == 12;
        assertTrue(condicao);
    }
}
