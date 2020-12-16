package com.springwalk.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "tb_mensagem")
public class MessageModel {

    protected MessageModel() {
    }

    public MessageModel(String mensagem) {
        this.mensagem = mensagem;
    }
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    

    @Column(name = "mensagem", nullable = false, length = 255)
    private String mensagem;
    
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
    }
    

    @Override
	public String toString() {
		return String.format("MenssageModel[id=%d, mensagem='%s']", id,mensagem);
	}
}
