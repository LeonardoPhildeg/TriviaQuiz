/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Pergunta;
import entidades.Tema;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class BancoPerguntas {
    
    protected HashMap<Tema,Pergunta[]> perguntas;
    protected Controlador controlador;
    protected Random random;
    
    
    public BancoPerguntas(Controlador controlador){
        this.controlador = controlador;
        this.perguntas = new HashMap<>();
        this.random = new Random();
    }

    public Pergunta sortearPergunta(){
        Pergunta[] arrayPerguntas = sortearArrayPerguntas();
        int numero = sorteiaNumeroAleatorio();
        return arrayPerguntas[numero];
    }
    
    public int sortearIdTema(){
        return random.nextInt(6);
    }
    
    public Pergunta[] sortearArrayPerguntas(){
        int numero = sortearIdTema();
        Pergunta[] temaSorteado = null;
        switch (numero) {
            case 0: temaSorteado = perguntas.get(Tema.HISTORIA);
                    break;
            case 1: temaSorteado = perguntas.get(Tema.GEOGRAFIA);
                    break;
            case 2: temaSorteado = perguntas.get(Tema.ESPORTES);
                    break;
            case 3: temaSorteado = perguntas.get(Tema.CIENCIAS);
                    break;
            case 4: temaSorteado = perguntas.get(Tema.INGLES);
                    break;
            case 5: temaSorteado = perguntas.get(Tema.ENTRETENIMENTO);
                    break;
        }
        
        return temaSorteado;
    }
    
    public int sorteiaNumeroAleatorio(){
        return random.nextInt(20);
    }

    void instanciarPerguntas() {
        /*HISTORIA(1),
        GEOGRAFIA(2),
        ESPORTES(3),
        CIENCIAS(4),
        INGLES(5),
        ENTRETENIMENTO(6);*/
        
        Pergunta[] historia = new Pergunta[20];
        Pergunta[] geografia = new Pergunta[20];
        Pergunta[] esportes = new Pergunta[20];
        Pergunta[] ciencias = new Pergunta[20];
        Pergunta[] ingles = new Pergunta[20];
        Pergunta[] entretenimento = new Pergunta[20];

        //Perguntas sobre História
        Pergunta p_historia = new Pergunta(Tema.HISTORIA, "Como era a forma de governo na Idade Média?", "Ditadura", "Monarquia", "Presidencialista", "Feudalista", 2);
        historia[0] = p_historia;
        Pergunta p_historia1 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[1] = p_historia1;
        Pergunta p_historia2 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[2] = p_historia2;
        Pergunta p_historia3 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[3] = p_historia3;
        Pergunta p_historia4 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[4] = p_historia4;
        Pergunta p_historia5 = new Pergunta(Tema.HISTORIA, "Como era a forma de governo na Idade Média?", "Ditadura", "Monarquia", "Presidencialista", "Feudalista", 2);
        historia[5] = p_historia5;
        Pergunta p_historia6 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[6] = p_historia6;
        Pergunta p_historia7 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[7] = p_historia7;
        Pergunta p_historia8 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[8] = p_historia8;
        Pergunta p_historia9 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[9] = p_historia9;
        Pergunta p_historia10 = new Pergunta(Tema.HISTORIA, "Como era a forma de governo na Idade Média?", "Ditadura", "Monarquia", "Presidencialista", "Feudalista", 2);
        historia[10] = p_historia10;
        Pergunta p_historia11 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[11] = p_historia11;
        Pergunta p_historia12 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[12] = p_historia12;
        Pergunta p_historia13 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[13] = p_historia13;
        Pergunta p_historia14 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[14] = p_historia14;
        Pergunta p_historia15 = new Pergunta(Tema.HISTORIA, "Como era a forma de governo na Idade Média?", "Ditadura", "Monarquia", "Presidencialista", "Feudalista", 2);
        historia[15] = p_historia15;
        Pergunta p_historia16 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[16] = p_historia16;
        Pergunta p_historia17 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[17] = p_historia17;
        Pergunta p_historia18 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[18] = p_historia18;
        Pergunta p_historia19 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[19] = p_historia19;
        
        //Perguntas sobre Geografia
        Pergunta p_geografia = new Pergunta(Tema.GEOGRAFIA, "Qual a cidade santa para as três maiores religiões monoteístas?", "Cairo", "Mecca", "Madrid", "Jerusalém", 4);
        geografia[0] = p_geografia;
        Pergunta p_geografia1 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade se localiza a Torre Eiffel?", "Roma", "Paris", "Londres", "Rio de Janeiro", 2);
        geografia[1] = p_geografia1;
        Pergunta p_geografia2 = new Pergunta(Tema.GEOGRAFIA, "Qual dessas cidades NÃO está localizada no Méximo", "Monterrey", "Guadalajra", "Tijuana", "Bogotá", 4);
        geografia[2] = p_geografia2;
        Pergunta p_geografia3 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[3] = p_geografia3;
        Pergunta p_geografia4 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[4] = p_geografia4;
        Pergunta p_geografia5 = new Pergunta(Tema.GEOGRAFIA, "Qual a cidade santa para as três maiores religiões monoteístas?", "Cairo", "Mecca", "Madrid", "Jerusalém", 4);
        geografia[5] = p_geografia5;
        Pergunta p_geografia6 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade se localiza a Torre Eiffel?", "Roma", "Paris", "Londres", "Rio de Janeiro", 2);
        geografia[6] = p_geografia6;
        Pergunta p_geografia7 = new Pergunta(Tema.GEOGRAFIA, "Qual dessas cidades NÃO está localizada no Méximo", "Monterrey", "Guadalajra", "Tijuana", "Bogotá", 4);
        geografia[7] = p_geografia7;
        Pergunta p_geografia8 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[8] = p_geografia8;
        Pergunta p_geografia9 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[9] = p_geografia9;
        Pergunta p_geografia10 = new Pergunta(Tema.GEOGRAFIA, "Qual a cidade santa para as três maiores religiões monoteístas?", "Cairo", "Mecca", "Madrid", "Jerusalém", 4);
        geografia[10] = p_geografia10;
        Pergunta p_geografia11 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade se localiza a Torre Eiffel?", "Roma", "Paris", "Londres", "Rio de Janeiro", 2);
        geografia[11] = p_geografia11;
        Pergunta p_geografia12 = new Pergunta(Tema.GEOGRAFIA, "Qual dessas cidades NÃO está localizada no Méximo", "Monterrey", "Guadalajra", "Tijuana", "Bogotá", 4);
        geografia[12] = p_geografia12;
        Pergunta p_geografia13 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[13] = p_geografia13;
        Pergunta p_geografia14 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[14] = p_geografia14;
        Pergunta p_geografia15 = new Pergunta(Tema.GEOGRAFIA, "Qual a cidade santa para as três maiores religiões monoteístas?", "Cairo", "Mecca", "Madrid", "Jerusalém", 4);
        geografia[15] = p_geografia15;
        Pergunta p_geografia16 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade se localiza a Torre Eiffel?", "Roma", "Paris", "Londres", "Rio de Janeiro", 2);
        geografia[16] = p_geografia16;
        Pergunta p_geografia17 = new Pergunta(Tema.GEOGRAFIA, "Qual dessas cidades NÃO está localizada no Méximo", "Monterrey", "Guadalajra", "Tijuana", "Bogotá", 4);
        geografia[17] = p_geografia17;
        Pergunta p_geografia18 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[18] = p_geografia18;
        Pergunta p_geografia19 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[19] = p_geografia19;
        
        //Perguntas de Esportes
        Pergunta p_esportes = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 2);
        esportes[0] = p_esportes;
        Pergunta p_esportes1 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[1] = p_esportes1;
        Pergunta p_esportes2 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[2] = p_esportes2;
        Pergunta p_esportes3 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[3] = p_esportes3;
        Pergunta p_esportes4 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[4] = p_esportes4;
        
        //Perguntas de Ciencias
        Pergunta p_ciencias = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[0] = p_ciencias;
        Pergunta p_ciencias1 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[1] = p_ciencias1;
        Pergunta p_ciencias2 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[2] = p_ciencias2;
        Pergunta p_ciencias3 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[3] = p_ciencias3;
        Pergunta p_ciencias4 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[4] = p_ciencias4;
        
        //Perguntas de Inglês
        Pergunta p_ingles = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[0] = p_ingles;
        Pergunta p_ingles1 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[1] = p_ingles1;
        Pergunta p_ingles2 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[2] = p_ingles2;
        Pergunta p_ingles3 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[3] = p_ingles3;
        Pergunta p_ingles4 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[4] = p_ingles4;
        
        //Perguntas de Entretenimento
        Pergunta p_entretenimento = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        esportes[0] = p_entretenimento;
        Pergunta p_entretenimento1 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        esportes[1] = p_entretenimento1;
        Pergunta p_entretenimento2 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        esportes[2] = p_entretenimento2;
        Pergunta p_entretenimento3 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        esportes[3] = p_entretenimento3;
        Pergunta p_entretenimento4 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        esportes[4] = p_entretenimento4;
        
        perguntas.put(Tema.HISTORIA, historia);
        perguntas.put(Tema.GEOGRAFIA, geografia);
        perguntas.put(Tema.ESPORTES, esportes);
        perguntas.put(Tema.CIENCIAS, ciencias);
        perguntas.put(Tema.INGLES, ingles);
        perguntas.put(Tema.ENTRETENIMENTO, entretenimento);
        
        
    }
       
}
