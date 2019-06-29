package br.com.etechoracio.feriadoapi.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Feriado")
public class feriado {
	@Id
	@GeneratedValue
	@Column(name="cod_feriado")
	private int cod_feriado;

	@Enumerated(EnumType.STRING)
	@Column(name="tipoFeriado")
	private String tipoFeriado;

	@Column(name="descricaoFeriado")
	private String descricaoFeriado;

	@Column(name="dataFeriado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFeriado;

	public int getCod_feriado() {
		return cod_feriado;
	}

	public void setCod_feriado(int cod_feriado) {
		this.cod_feriado = cod_feriado;
	}

	public String getTipoFeriado() {
		return tipoFeriado;
	}

	public void setTipoFeriado(String tipoFeriado) {
		this.tipoFeriado = tipoFeriado;
	}

	public String getDescricaoFeriado() {
		return descricaoFeriado;
	}

	public void setDescricaoFeriado(String descricaoFeriado) {
		this.descricaoFeriado = descricaoFeriado;
	}

	public Date getDataFeriado() {
		return dataFeriado;
	}

	public void setDataFeriado(Date dataFeriado) {
		this.dataFeriado = dataFeriado;
	}

}

