package com.lucasjava92.bancolucas.dominio;

public class Cliente {

    private Long id;
    private String email;
    private String endereco;

    @Override
	public String toString() {
		return "Cliente [id=" + id + ", email=" + email + ", endereco=" + endereco + "]";
	}


	public Cliente(Long id, String email, String endereco) {
        this.id = id;
        this.email = email;
        this.endereco = endereco;
    }


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
