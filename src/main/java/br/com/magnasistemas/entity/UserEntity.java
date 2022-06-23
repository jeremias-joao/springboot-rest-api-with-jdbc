package br.com.magnasistemas.entity;

import java.time.LocalDate;

public class UserEntity {

	private Long id;
	
	private String nome;
	
	private String email;
	
	private String cidade;
	
	private String uf;
	
	private LocalDate dataNascimento;
	
	public UserEntity () {
		
	}

	public UserEntity(String nome, String email, String cidade, String uf, LocalDate dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.uf = uf;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(cidade, dataNascimento, email, id, nome, uf);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		UserEntity other = (UserEntity) obj;
//		return Objects.equals(cidade, other.cidade) && Objects.equals(dataNascimento, other.dataNascimento)
//				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
//				&& Objects.equals(nome, other.nome) && Objects.equals(uf, other.uf);
//	}
//
//	@Override
//	public String toString() {
//		return "UserEntity [id=" + id + ", nome=" + nome + ", email=" + email + ", cidade=" + cidade + ", uf=" + uf
//				+ ", dataNascimento=" + dataNascimento + "]";
//	}

}
