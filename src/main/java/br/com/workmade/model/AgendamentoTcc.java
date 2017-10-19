package br.com.workmade.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "agendamento_tcc")
public class AgendamentoTcc implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5075747777800939813L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String tcc;
	@NotNull
	private String tituloTcc;
	@NotNull
	private String aluno;
	@NotNull
	private String curso;
	@NotNull
	private String orientador;
	@NotNull
	private String avaliadorInterno;
	@NotNull
	private String avaliadorExterno;
	@NotNull
	private String areaConhecimento;
	@NotNull
	private Date dataInicio;
	@NotNull
	private Date dataFinal;
	@NotNull
	private Date dataDefesa;
	@NotNull
	private String resultadoDefesa;
	
	public String getTcc() {
		return tcc;
	}
	public void setTcc(String tcc) {
		this.tcc = tcc;
	}
	public String getTituloTcc() {
		return tituloTcc;
	}
	public void setTituloTcc(String tituloTcc) {
		this.tituloTcc = tituloTcc;
	}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	public String getAvaliadorInterno() {
		return avaliadorInterno;
	}
	public void setAvaliadorInterno(String avaliadorInterno) {
		this.avaliadorInterno = avaliadorInterno;
	}
	public String getAvaliadorExterno() {
		return avaliadorExterno;
	}
	public void setAvaliadorExterno(String avaliadorExterno) {
		this.avaliadorExterno = avaliadorExterno;
	}
	public String getAreaConhecimento() {
		return areaConhecimento;
	}
	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Date getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa(Date dataDefesa) {
		this.dataDefesa = dataDefesa;
	}
	public String getResultadoDefesa() {
		return resultadoDefesa;
	}
	public void setResultadoDefesa(String resultadoDefesa) {
		this.resultadoDefesa = resultadoDefesa;
	}
	public AgendamentoTcc(String tcc, String tituloTcc, String aluno, String curso, String orientador,
			String avaliadorInterno, String avaliadorExterno, String areaConhecimento, Date dataInicio, Date dataFinal,
			Date dataDefesa, String resultadoDefesa) {
		super();
		this.tcc = tcc;
		this.tituloTcc = tituloTcc;
		this.aluno = aluno;
		this.curso = curso;
		this.orientador = orientador;
		this.avaliadorInterno = avaliadorInterno;
		this.avaliadorExterno = avaliadorExterno;
		this.areaConhecimento = areaConhecimento;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.dataDefesa = dataDefesa;
		this.resultadoDefesa = resultadoDefesa;
	}
	
	
}
