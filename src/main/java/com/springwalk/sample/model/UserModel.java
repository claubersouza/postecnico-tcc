package com.springwalk.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "tb_usuario")
public class UserModel {

	protected UserModel() {
	}


	public UserModel(String usuario, String senha,String cnpj, int seguimento,String telefone, int id_endereco ) {
		this.usuario = usuario;
		this.senha = senha;
		this.cnpj = cnpj;
		this.seguimento = seguimento;
		this.senha = senha;
		this.telefone = telefone;
		this.id_endereco = id_endereco;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "usuario", nullable = false, length = 255)
	private String usuario;
	
	@Column(name = "senha", nullable = false, length = 255)
	private String senha;
	
	@Column(name = "cnpj", nullable = false, length = 255)
	private String cnpj;
	
	@Column(name = "seguimento", nullable = false, length = 255)
	private int seguimento;
	
	@Column(name = "telefone", nullable = false, length = 255)
	private String telefone;
	
	@Column(name = "id_endereco", nullable = false, length = 255)
    private int id_endereco;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getSeguimento() {
		return this.seguimento;
	}

	public void setSeguimento(int seguimento) {
		this.seguimento = seguimento;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId_endereco() {
		return this.id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}


	@Override
	public String toString() {
		return String.format("UserModel[id=%d, usuario='%s', senha='%s',cnpj='%s', seguimento='%d', telefone='%s', id_endereco='%d']", id,
		    usuario, senha, cnpj, seguimento, telefone, id_endereco);
	}

}