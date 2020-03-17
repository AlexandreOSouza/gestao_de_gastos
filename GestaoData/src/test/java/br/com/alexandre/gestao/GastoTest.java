package br.com.alexandre.gestao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

import br.com.alexandre.gestao_data.model.Gasto;
import br.com.alexandre.gestao_data.repository.GastoRepositoryCustom;

/**
 * GastoTest
 */
@TestComponent
public class GastoTest {

    @Autowired
    GastoRepositoryCustom repo;

    @Test
    public void novoGasto() {
        
    }
    
}