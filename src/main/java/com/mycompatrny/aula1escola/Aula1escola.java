/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompatrny.aula1escola;

import com.mycompatrny.aula1escola.alunos.Aluno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ricar
 */
public class Aula1escola {

    public static void main(String[] args) throws ParseException {
        
        Aluno aluno = new Aluno();
        
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dataNascimento = formato.parse("05/03/2012");
        
        Aluno aluno1 = new Aluno("Marcos", 54321, dataNascimento, "marcos@aluno.br");
        
        Aluno aluno2 = new Aluno("Fernando", 333211, dataNascimento, "fernando@aluno.br");
        
        Aluno aluno3 = new Aluno("Adriana", 553281, dataNascimento, "adriana@aluno.br");
        
        //SETANDO AS DATAS DOS ALUNOS
        aluno1.setDataNascimento(formato.parse("5/03/20010"));
        aluno2.setDataNascimento(formato.parse("1/11/2002"));
        aluno3.setDataNascimento(formato.parse("1/01/2010"));
        
        //ALUNO 1
        System.out.println("Informações do Aluno1: \n");
	System.out.println("Nome: "+aluno1.getNome());
	System.out.println("CPF: "+aluno1.getCpf());
	System.out.println("Data Nascimento: "+formato.format(aluno1.getDataNascimento()));
        System.out.println("E-mail: "+aluno1.getEmail());
        
        //ALUNO 2 
        System.out.println("Informações do Aluno2: \n");
	System.out.println("Nome: "+aluno2.getNome());
	System.out.println("CPF: "+aluno2.getCpf());
	System.out.println("Data Nascimento: "+formato.format(aluno2.getDataNascimento()));
        System.out.println("E-mail: "+aluno2.getEmail());
        
        //ALUNO 3
        System.out.println("Informações do Aluno3: \n");
	System.out.println("Nome: "+aluno3.getNome());
	System.out.println("CPF: "+aluno3.getCpf());
	System.out.println("Data Nascimento: "+formato.format(aluno3.getDataNascimento()));
        System.out.println("E-mail: "+aluno3.getEmail());
        
        System.out.println("Idade do Aluno1: "+aluno1.idadeAluno(aluno1));
        //System.out.println("Idade do: " +aluno1.getNome()+ " " + aluno1.idadeAluno(aluno1));
        System.out.println("Idade do Aluno2: "+aluno2.idadeAluno(aluno2));
        System.out.println("Idade do Aluno3: "+aluno3.idadeAluno(aluno3));
        
        
  
 
        
        //Calculo aluno
      if((aluno1.idadeAluno(aluno1)) > (aluno2.idadeAluno(aluno2)) && (aluno1.idadeAluno(aluno1)) > (aluno3.idadeAluno(aluno3))){
          System.out.println("Nome: " +aluno1.getNome() + " idade:" + aluno1.idadeAluno(aluno1));
          
      }else if ((aluno2.idadeAluno(aluno2)) > (aluno1.idadeAluno(aluno1)) && (aluno2.idadeAluno(aluno2)) > (aluno3.idadeAluno(aluno3))){
                System.out.println("Nome: " +aluno2.getNome() + " idade: " + aluno2.idadeAluno(aluno2));
             
      }else {
          System.out.println("Nome " +aluno3.getNome() +" idade: " + aluno3.idadeAluno(aluno3));
      }
    }
}
