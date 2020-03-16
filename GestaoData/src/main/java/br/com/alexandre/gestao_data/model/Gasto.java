package br.com.alexandre.gestao_data.model;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Gasto
 */
@RedisHash("Gasto")
public class Gasto {

    @Id
    private Long gastoId;
    @Indexed
    private String descricao;
    private Double valor;
    @Indexed
    private Integer codigoUsuario;
    @Indexed
    private Calendar data;
    @Indexed
    private Categoria categoria;


    public Gasto() {
    }


    public Gasto(Long gastoId, String descricao, Double valor, Integer codigoUsuario, Calendar data, Categoria categoria) {
        this.gastoId = gastoId;
        this.descricao = descricao;
        this.valor = valor;
        this.codigoUsuario = codigoUsuario;
        this.data = data;
        this.categoria = categoria;
    }

    public Integer getCodigoUsuario() {
        return this.codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Gasto gastoId(Long gastoId) {
        this.gastoId = gastoId;
        return this;
    }

    public Calendar getData() {
        return this.data;
    }
    
    public void setData(Calendar data) {
        this.data = data;
    }

    public Integer getIdUsuario() {
        return this.codigoUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.codigoUsuario = idUsuario;
    }
    
    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Long getGastoId() {
        return this.gastoId;
    }

    public void setGastoId(Long gastoId) {
        this.gastoId = gastoId;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}