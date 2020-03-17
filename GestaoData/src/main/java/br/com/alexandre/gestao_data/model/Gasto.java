package br.com.alexandre.gestao_data.model;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Gasto
 * Classe modelo que representa o Gasto de um usuario
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
    private LocalDateTime data;


    public Gasto() {
    }


    public Gasto(Long gastoId, String descricao, Double valor, Integer codigoUsuario, LocalDateTime data) {
        setGastoId(gastoId);
        setDescricao(descricao);
        setValor(valor);
        setCodigoUsuario(codigoUsuario);
        setData(data);
    }

    public Integer getCodigoUsuario() {
        return this.codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("date")
    public LocalDateTime getData() {
        return this.data;
    }
    
    public void setData(LocalDateTime data) {
        this.data = data;
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

}