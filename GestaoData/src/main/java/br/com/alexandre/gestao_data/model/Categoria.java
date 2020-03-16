package br.com.alexandre.gestao_data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Categoria
 */
@RedisHash("Categoria")
public class Categoria {

    @Id
    private Long categoriaId;
    @Indexed
    private String descricao;


    public Categoria() {
    }

    public Categoria(Long categoriaId, String descricao) {
        this.categoriaId = categoriaId;
        this.descricao = descricao;
    }

    public Categoria categoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
        return this;
    }

    public Categoria descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getCategoriaId() {
    	return this.categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
    	this.categoriaId = categoriaId;
    }    
}