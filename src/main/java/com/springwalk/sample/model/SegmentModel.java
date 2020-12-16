package com.springwalk.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_segmento")
public class SegmentModel {
    protected SegmentModel() {

    }

    public SegmentModel(String nome_seguimento,String descricao_seguimento) {
        this.nome_seguimento = nome_seguimento;
        this.descricao_seguimento = descricao_seguimento;
    }

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
        
    @Column(name = "nome_seguimento", nullable = false, length = 255)
    private String nome_seguimento;
    
    @Column(name = "descricao_seguimento", nullable = false, length = 255)
    private String descricao_seguimento;
    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_seguimento() {
        return this.nome_seguimento;
    }

    public void setNome_seguimento(String nome_seguimento) {
        this.nome_seguimento = nome_seguimento;
    }

    public String getDescricao_seguimento() {
        return this.descricao_seguimento;
    }

    public void setDescricao_seguimento(String descricao_seguimento) {
        this.descricao_seguimento = descricao_seguimento;
    }

    @Override
    public String toString() {
        return String.format("SegmentModel[id=%d, nome_seguimento='%s', descricao_seguimento='%s']",id, nome_seguimento, descricao_seguimento);
    }
}
