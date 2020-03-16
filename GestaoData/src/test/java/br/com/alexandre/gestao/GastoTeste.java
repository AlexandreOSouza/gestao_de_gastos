package br.com.alexandre.gestao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.stream.StreamSupport;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alexandre.gestao_data.GestaoApplication;
import br.com.alexandre.gestao_data.model.Gasto;
import br.com.alexandre.gestao_data.service.GastoServiceImpl;

/**
 * GastoTeste
 */
@RunWith( SpringRunner.class )
@SpringBootTest(classes = GestaoApplication.class)
public class GastoTeste {

    @Autowired
    private static GastoServiceImpl service;

    @BeforeAll
    public static void salvarGasto() {
        Gasto gasto = new Gasto();
        gasto.setIdUsuario(-1);
        gasto.setCodigoUsuario(-1);
        gasto.setDescricao("Teste");
        gasto.setValor(3.5);
        gasto.setData(Calendar.getInstance());
        System.out.println(service == null);
        service.salvar(gasto);
    }

    @Test
    public void retornarTodos() {
        assertEquals(1, StreamSupport.stream(service.listarTodos().spliterator(), false).count());
    }


    @AfterAll
    public static void excluirGasto() {
        service.excluir(-1);
    }
    
}