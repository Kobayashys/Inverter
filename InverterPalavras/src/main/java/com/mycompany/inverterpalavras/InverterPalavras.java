/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverterpalavras;

/**
 *
 * @author vinic
 */
import java.util.Stack;

public class InverterPalavras {

    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (char caractere : palavra.toCharArray()) {
                pilha.push(caractere);
            }
            while (!pilha.isEmpty()) {
                fraseInvertida.append(pilha.pop());
            }
            fraseInvertida.append(" ");
        }

        fraseInvertida.deleteCharAt(fraseInvertida.length() - 1);
        return fraseInvertida.toString();
    }

    public static void main(String[] args) {
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        System.out.println(inverterPalavras(frase1));
        System.out.println(inverterPalavras(frase2));
    }
}

