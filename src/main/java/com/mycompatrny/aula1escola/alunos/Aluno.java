/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompatrny.aula1escola.alunos;

import java.util.Date;

/**
 *
 * @author ricar
 */
public class Aluno {
    private String nome;
    private Integer cpf;
    private Date dataNascimento;
    private String email;
    public boolean idadeAluno;
    
    //Construtor Vazio
public Aluno() {
    super();
	}


//Construtor com parâmetros
	public Aluno(String nome, Integer cpf, Date dataNascimento, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
                this.dataNascimento = dataNascimento;
                this.email = email;
                
	}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public Integer getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    	public Integer idadeAluno(Aluno aluno) {
		Integer idade = 0;
		idade = new Date().getYear() - aluno.getDataNascimento().getYear();
		return idade;
	}
        
    
    
}
