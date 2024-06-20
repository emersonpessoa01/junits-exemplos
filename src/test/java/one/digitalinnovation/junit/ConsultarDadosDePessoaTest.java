package one.digitalinnovation.junit;

import org.junit.Test;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configurarConexão");
    }
    @AfterEach
    public void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("João", LocalDateTime.of(2000,1,1,15,0,0)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDateTime.of(2000,1,1,15,0,0)));

    }
    @Test
    public void validarDadosDeRetorno(){
        assertTrue(true);
    }
    @Test
    public void validarDadosDeRetorno2(){
        assertNull(null);
    }
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexão");
    }

}
