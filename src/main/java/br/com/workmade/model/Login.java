package br.com.workmade.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "login")
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -180464113227165192L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String usuario;
	private String senha;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
}
