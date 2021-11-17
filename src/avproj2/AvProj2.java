/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avproj2;

/**
 *
 * @author Usuario
 */
public class AvProj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
intanoNascimento,anoEntradaEmpresa,tempoTrabalho,idade;
System.out.println("Insira o ano de nascimento do funcionario:");
anoNascimento=teclado.nextInt();
System.out.println("Insira o ano de entrada na empresa: ");
anoEntradaEmpresa=teclado.nextInt();

idade = anoNascimento-2021;
tempoTrabalho=anoEntradaEmpresa
-2021;

if(idade ›= 65)
{System.out.println("Seu funcionario pode se aposnetar! ");}
else if(
tempoTrabalho ›= 30)
{System.out.println("Seu funcionario pode se aposentar! ")3]
else if (idade ›= 60 8& tempoTrabalho ›= 25)
{System.out.println("Seu funcionario pode se aposentar! ");Jelse{
System.out.println("Seu funcionario não está apto a aposentadoria!")3}
System.out.println("A Idade do funcionario é de:"idade
" anos. "):
System.out.println("O funcionario trabalhou por
"tempoTrabalho" a anos");.
    }
    
}
