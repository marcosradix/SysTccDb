package br.com.workmade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "cadastrar_tcc")
public class CadastrarTccModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1211857325599586340L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String titulo;
	@NotNull
	private String resumo;
	@NotNull
	private String curso;
	@NotNull
	@Column(name= "palavra_chave")
	private String palavraChave;
	@NotNull
	private String autor;
	@NotNull
	private String orientador;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPalavraChave() {
		return palavraChave;
	}
	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	public CadastrarTccModel(Long id, String titulo, String resumo, String curso, String palavraChave, String autor,
			String orientador) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumo = resumo;
		this.curso = curso;
		this.palavraChave = palavraChave;
		this.autor = autor;
		this.orientador = orientador;
	}
	
	
}
