/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Leonardo
 */
public class Pergunta {
    
    protected Tema tema;
    protected String enunciado;
    protected String alternativa1;
    protected String alternativa2;
    protected String alternativa3;
    protected String alternativa4;
    protected int respostaCerta;
    protected boolean sorteada;

    public Pergunta(Tema tema, String enunciado, String alternativa1, String alternativa2, String alternativa3, String alternativa4, int respostaCerta) {
        this.tema = tema;
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.respostaCerta = respostaCerta;
        this.sorteada = false;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public Tema getTema() {
        return tema;
    }

    public boolean isSorteada() {
        return sorteada;
    }
    
    public void setSorteada(boolean sorteada) {
        this.sorteada = sorteada;
    }

    public int getRespostaCerta() {
        return respostaCerta;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }
}