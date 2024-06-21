package one.digitalinnovation.junit;


import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class assertionsTeste {
    @Test
    public void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};


        assertArrayEquals(primeiroLancamento, segundoLancamento);
        
    }
    @Test
    public void validaSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

       pessoa = new Pessoa("Luciano", LocalDateTime.now());
       assertNotNull(pessoa);

    }
    @Test
    public void validaNumerousDifferentiates(){
        String nome = "Emerson";
        String sobreNome = "Pessoa";

        assertNotNull(nome, sobreNome);
    }


}
