/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Pergunta;
import entidades.Tema;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        
        /*try {
            for (int i = 5; i < 10; i++) {
                String line32 = Files.readAllLines(Paths.get("C:\\Users\\Davi\\Desktop\\teste.txt")).get(i);
                System.out.println(line32);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }*/
            
        
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

        //Perguntas sobre Historia
        Pergunta p_historia = new Pergunta(Tema.HISTORIA, "Como era a forma de governo na Idade Média?", "Ditadura", "Monarquia", "Presidencialista", "Feudalista", 2);
        historia[0] = p_historia;
        Pergunta p_historia1 = new Pergunta(Tema.HISTORIA, "De que parte do homem Deus fez a mulher?", "Peito", "Rim", "Fêmur", "Costela", 4);
        historia[1] = p_historia1;
        Pergunta p_historia2 = new Pergunta(Tema.HISTORIA, "Quem construiu o primeiro império global?", "Alexandre, o Grande", "Júlio César", "Marco Aurélio", "Willian, o Conquistador", 1);
        historia[2] = p_historia2;
        Pergunta p_historia3 = new Pergunta(Tema.HISTORIA, "Qual o nome da antiga moeda de cobre de Portugal e do Brasil?", "Réis", "Vintém", "Cruzado", "Real", 2);
        historia[3] = p_historia3;
        Pergunta p_historia4 = new Pergunta(Tema.HISTORIA, "Qual das alternativas tem dois heróis da Mitologia Grega?", "Odin e Loki", "Wolverine e Tempestade", "Superman e Mulher Maravilha", "Aquiles e Perseu", 4);
        historia[4] = p_historia4;
        Pergunta p_historia5 = new Pergunta(Tema.HISTORIA, "Qual o primeiro nome de Hitler", "Joseph", "Charles", "Adolf", "Cristian", 3);
        historia[5] = p_historia5;
        Pergunta p_historia6 = new Pergunta(Tema.HISTORIA, "Na mitologia grega qual criatura pode petrificar uma pessoa apenas com o olhar?", "Minotauro", "Craken", "Medusa", "Todas estão corretas", 3);
        historia[6] = p_historia6;
        Pergunta p_historia7 = new Pergunta(Tema.HISTORIA, "Como se chamavam os teóricos que criaram o Socialismo Científico?", "Marx e Engels", "Lenin e Stalin", "Che Guevara e Trotski", "Czar Nicolau e Fidel Castro", 1);
        historia[7] = p_historia7;
        Pergunta p_historia8 = new Pergunta(Tema.HISTORIA, "Qual desses fatos é mais antigo?", "Guerra do Ópio", "Revolução Francesa", "Independência do Brasil", "Primeira Guerra Mundial", 2);
        historia[8] = p_historia8;
        Pergunta p_historia9 = new Pergunta(Tema.HISTORIA, "Qual a primeira fonte de energia descoberta em meados do século XIX?", "Petróleo", "Gás natural", "Energia solar", "Carvão mineral", 4);
        historia[9] = p_historia9;
        Pergunta p_historia10 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 2);
        historia[10] = p_historia10;
        Pergunta p_historia11 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[11] = p_historia11;
        Pergunta p_historia12 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[12] = p_historia12;
        Pergunta p_historia13 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[13] = p_historia13;
        Pergunta p_historia14 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 1);
        historia[14] = p_historia14;
        Pergunta p_historia15 = new Pergunta(Tema.HISTORIA, "", "", "", "", "", 2);
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
        Pergunta p_geografia2 = new Pergunta(Tema.GEOGRAFIA, "Qual dessas cidades Não está localizada no Méximo", "Monterrey", "Guadalajra", "Tijuana", "Bogotá", 4);
        geografia[2] = p_geografia2;
        Pergunta p_geografia3 = new Pergunta(Tema.GEOGRAFIA, "Qual fenômeno é caracterizado por uma súbita liberação de tensão acumulada por ruptura dos materiais da crosta terreste", "Tsuname", "Erupção vulcânica", "Sismo", "Tempestade", 3);
        geografia[3] = p_geografia3;
        Pergunta p_geografia4 = new Pergunta(Tema.GEOGRAFIA, "Qual o nome do meridiano que separa o planeta em parte orienta e ocidental", "Meridiano de Leakey", "Meridiano de Bering", "Meridiano de Crasring", "Meridiano de Greenwich", 4);
        geografia[4] = p_geografia4;
        Pergunta p_geografia5 = new Pergunta(Tema.GEOGRAFIA, "Em qual estado e região se localiza as cidades água Branca, Souza e João Pessoa?", "Nenhuma das alternativas", "Centro-Oeste (Bahia-BH)", "Sudeste (São Paulo SP)", "Nordeste (Paraíba PB)", 4);
        geografia[5] = p_geografia5;
        Pergunta p_geografia6 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade brasileira se localiza o Palácio do Planalto?", "Brasília", "São Paulo", "Rio de Janeiro", "Minas Gerais", 1);
        geografia[6] = p_geografia6;
        Pergunta p_geografia7 = new Pergunta(Tema.GEOGRAFIA, "Onde fica o Monte Evereste?", "Himalaia", "China", "Russia", "Peru", 4);
        geografia[7] = p_geografia7;
        Pergunta p_geografia8 = new Pergunta(Tema.GEOGRAFIA, "Qual é o segundo maior país da América do Sul", "Argentina", "Brasil", "Chile", "Bolívia", 1);
        geografia[8] = p_geografia8;
        Pergunta p_geografia9 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[9] = p_geografia9;
        Pergunta p_geografia10 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 4);
        geografia[10] = p_geografia10;
        Pergunta p_geografia11 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 2);
        geografia[11] = p_geografia11;
        Pergunta p_geografia12 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 4);
        geografia[12] = p_geografia12;
        Pergunta p_geografia13 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[13] = p_geografia13;
        Pergunta p_geografia14 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[14] = p_geografia14;
        Pergunta p_geografia15 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 4);
        geografia[15] = p_geografia15;
        Pergunta p_geografia16 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 2);
        geografia[16] = p_geografia16;
        Pergunta p_geografia17 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 4);
        geografia[17] = p_geografia17;
        Pergunta p_geografia18 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[18] = p_geografia18;
        Pergunta p_geografia19 = new Pergunta(Tema.GEOGRAFIA, "", "", "", "", "", 1);
        geografia[19] = p_geografia19;
        
        //Perguntas de Esportes
        Pergunta p_esportes = new Pergunta(Tema.ESPORTES, "Qual time mais participou da Copa do Brasil", "Atlético-MG", "São Paulo", "Corinthians", "Santa Cruz", 1);
        esportes[0] = p_esportes;
        Pergunta p_esportes1 = new Pergunta(Tema.ESPORTES, "Qual o nome do estádio do Santos Futebol Clube?", "Morumbi", "Canindé", "Vila Belmiro", "Parque Antartica", 3);
        esportes[1] = p_esportes1;
        Pergunta p_esportes2 = new Pergunta(Tema.ESPORTES, "Quem foi o maio ídolo do tenis brasileiro?", "Guga", "Bellucci", "Ferrer", "Federer", 1);
        esportes[2] = p_esportes2;
        Pergunta p_esportes3 = new Pergunta(Tema.ESPORTES, "Qual desses não foi jogador de futebol profissional", "Gustavo Borges", "Diego Costa", "Alexandre Pato", "Leonel Messi", 1);
        esportes[3] = p_esportes3;
        Pergunta p_esportes4 = new Pergunta(Tema.ESPORTES, "Qual desses esportes pode acontecer o empate?", "Vôlei", "Tênis de mesa", "Handebol", "Tênis", 3);
        esportes[4] = p_esportes4;
        Pergunta p_esportes5 = new Pergunta(Tema.ESPORTES, "O ex-jogador de futebol Roberto Carlos era famoso por fazer gols de?", "Cabeça", "Falta", "Pênalti", "Peito", 2);
        esportes[5] = p_esportes5;
        Pergunta p_esportes6 = new Pergunta(Tema.ESPORTES, "Qual o nome de batismo do Pelé?", "Robson", "Hudson", "Jeferson", "Edson", 4);
        esportes[6] = p_esportes6;
        Pergunta p_esportes7 = new Pergunta(Tema.ESPORTES, "A que estado do Brasil pertence o Clube do Remo?", "Amazonas", "Pará", "São Paulo", "Piauí", 2);
        esportes[7] = p_esportes7;
        Pergunta p_esportes8 = new Pergunta(Tema.ESPORTES, "Qual o jogador com mais Bolas de Ouro do mundo?", "Neymar Jr.", "Cristiano Ronaldo", "Pelé", "Lionel Messi", 4);
        esportes[8] = p_esportes8;
        Pergunta p_esportes9 = new Pergunta(Tema.ESPORTES, "Qual desses jogadores nunca ganhou o prêmio Bola de Ouro?", "Kaká", "Cristiano Ronaldo", "Neymar Jr.", "Lionel Messi", 3);
        esportes[9] = p_esportes9;
        Pergunta p_esportes10 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 2);
        esportes[10] = p_esportes10;
        Pergunta p_esportes11 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[11] = p_esportes11;
        Pergunta p_esportes12 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[12] = p_esportes12;
        Pergunta p_esportes13 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[13] = p_esportes13;
        Pergunta p_esportes14 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[14] = p_esportes14;
        Pergunta p_esportes15 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 2);
        esportes[15] = p_esportes15;
        Pergunta p_esportes16 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[16] = p_esportes16;
        Pergunta p_esportes17 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[17] = p_esportes17;
        Pergunta p_esportes18 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[18] = p_esportes18;
        Pergunta p_esportes19 = new Pergunta(Tema.ESPORTES, "", "", "", "", "", 1);
        esportes[19] = p_esportes19;
        
        //Perguntas de Ciencias
        Pergunta p_ciencias = new Pergunta(Tema.CIENCIAS, "Qual é o resultado da operação 2x - 6 = 0?", "4", "2", "12", "3", 4);
        ciencias[0] = p_ciencias;
        Pergunta p_ciencias1 = new Pergunta(Tema.CIENCIAS, "Qual elemento abaixo é uma grandeza?", "Calor", "Temperatura", "Aurora Boreal", "Chuva", 2);
        ciencias[1] = p_ciencias1;
        Pergunta p_ciencias2 = new Pergunta(Tema.CIENCIAS, "Por onde os hormônios são transportados?", "Pelo sistema nervoso", "Pelo sangue", "Pelos ossos", "Pelos orgãos", 2);
        ciencias[2] = p_ciencias2;
        Pergunta p_ciencias3 = new Pergunta(Tema.CIENCIAS, "Quantas cavidades possuem o nosso coração?", "Uma", "Cinco", "Duas", "Quatro", 4);
        ciencias[3] = p_ciencias3;
        Pergunta p_ciencias4 = new Pergunta(Tema.CIENCIAS, "Qual parte de um motor a combustão interna comprime a mistura ar-gasolina?", "Biela", "Pistão", "Cambota do motor", "Válvula", 2);
        ciencias[4] = p_ciencias4;
        Pergunta p_ciencias5 = new Pergunta(Tema.CIENCIAS, "Qual é a área da saúde que lida com o sistema digestório?", "Neurologia", "Gastrologia", "Cardiologia", "Endocrinologia", 2);
        ciencias[5] = p_ciencias5;
        Pergunta p_ciencias6 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[6] = p_ciencias6;
        Pergunta p_ciencias7 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[7] = p_ciencias7;
        Pergunta p_ciencias8 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[8] = p_ciencias8;
        Pergunta p_ciencias9 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[9] = p_ciencias9;
        Pergunta p_ciencias10 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[10] = p_ciencias10;
        Pergunta p_ciencias11 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[11] = p_ciencias11;
        Pergunta p_ciencias12 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[12] = p_ciencias12;
        Pergunta p_ciencias13 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[13] = p_ciencias13;
        Pergunta p_ciencias14 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[14] = p_ciencias14;
        Pergunta p_ciencias15 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[15] = p_ciencias15;
        Pergunta p_ciencias16 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[16] = p_ciencias16;
        Pergunta p_ciencias17 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[17] = p_ciencias17;
        Pergunta p_ciencias18 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[18] = p_ciencias18;
        Pergunta p_ciencias19 = new Pergunta(Tema.CIENCIAS, "", "", "", "", "", 2);
        ciencias[19] = p_ciencias19;
        
        //Perguntas de Inglãªs
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
        Pergunta p_ingles5 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[5] = p_ingles5;
        Pergunta p_ingles6 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[6] = p_ingles6;
        Pergunta p_ingles7 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[7] = p_ingles7;
        Pergunta p_ingles8 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[8] = p_ingles8;
        Pergunta p_ingles9 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[9] = p_ingles9;
        Pergunta p_ingles10 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[10] = p_ingles10;
        Pergunta p_ingles11 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[11] = p_ingles11;
        Pergunta p_ingles12 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[12] = p_ingles12;
        Pergunta p_ingles13 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[13] = p_ingles13;
        Pergunta p_ingles14 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[14] = p_ingles14;
        Pergunta p_ingles15 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[15] = p_ingles15;
        Pergunta p_ingles16 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[16] = p_ingles16;
        Pergunta p_ingles17 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[17] = p_ingles17;
        Pergunta p_ingles18 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[18] = p_ingles18;
        Pergunta p_ingles19 = new Pergunta(Tema.INGLES, "", "", "", "", "", 2);
        esportes[19] = p_ingles19;
        
        //Perguntas de Entretenimento
        Pergunta p_entretenimento = new Pergunta(Tema.ENTRETENIMENTO, "Qual o primeiro nome verdadeiro do 'Seu Madruga' da série de comédia 'Chaves'?", "Ronan", "Ramon", "Henrique", "Pablo", 2);
        entretenimento[0] = p_entretenimento;
        Pergunta p_entretenimento1 = new Pergunta(Tema.ENTRETENIMENTO, "No filme Marley e eu qual é o primeiro nome dado ao cão?", "Cão de Liquidação", "Marley", "Rex", "Skiper", 1);
        entretenimento[1] = p_entretenimento1;
        Pergunta p_entretenimento2 = new Pergunta(Tema.ENTRETENIMENTO, "A que banda pertence o cantor e compositor Chris Martin?", "Nirvana", "Maroon 5", "Coldplay", "Pink Floyd", 3);
        entretenimento[2] = p_entretenimento2;
        Pergunta p_entretenimento3 = new Pergunta(Tema.ENTRETENIMENTO, "Qual destes jogos é da empresa Capcom?", "Tekken", "Street Fighter", "Mortal Kombat", "Grand Theft Auto V", 2);
        entretenimento[3] = p_entretenimento3;
        Pergunta p_entretenimento4 = new Pergunta(Tema.ENTRETENIMENTO, "Qual dos personagens abaixo é do seriado Supernatural?", "Aria Montgomery", "Sam Winchester", "Stiles Stilinski", "Theon Greyjoy", 2);
        entretenimento[4] = p_entretenimento4;
        Pergunta p_entretenimento5 = new Pergunta(Tema.ENTRETENIMENTO, "No universo Disney, qual animal vive o personagem 'Robin Hood'?", "Galo", "Gato", "Raposa", "Cachorro", 3);
        entretenimento[5] = p_entretenimento5;
        Pergunta p_entretenimento6 = new Pergunta(Tema.ENTRETENIMENTO, "No seriado Supernatural, qual o nome do anjo que mais ajuda Dean e Sam?", "Castanhel", "Castiel", "Baltazar", "Amenediel", 2);
        entretenimento[6] = p_entretenimento6;
        Pergunta p_entretenimento7 = new Pergunta(Tema.ENTRETENIMENTO, "Qual amigo de Harry Potter é meio gigante?", "Hermione", "Hagrid", "Ronald", "Lupin", 2);
        entretenimento[7] = p_entretenimento7;
        Pergunta p_entretenimento8 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[8] = p_entretenimento8;
        Pergunta p_entretenimento9 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[9] = p_entretenimento9;
        Pergunta p_entretenimento10 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[10] = p_entretenimento10;
        Pergunta p_entretenimento11 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[11] = p_entretenimento11;
        Pergunta p_entretenimento12 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[12] = p_entretenimento12;
        Pergunta p_entretenimento13 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[13] = p_entretenimento13;
        Pergunta p_entretenimento14 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[14] = p_entretenimento14;
        Pergunta p_entretenimento15 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[15] = p_entretenimento15;
        Pergunta p_entretenimento16 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[16] = p_entretenimento16;
        Pergunta p_entretenimento17 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[17] = p_entretenimento17;
        Pergunta p_entretenimento18 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[18] = p_entretenimento18;
        Pergunta p_entretenimento19 = new Pergunta(Tema.ENTRETENIMENTO, "", "", "", "", "", 2);
        entretenimento[19] = p_entretenimento19;
        
        perguntas.put(Tema.HISTORIA, historia);
        perguntas.put(Tema.GEOGRAFIA, geografia);
        perguntas.put(Tema.ESPORTES, esportes);
        perguntas.put(Tema.CIENCIAS, ciencias);
        perguntas.put(Tema.INGLES, ingles);
        perguntas.put(Tema.ENTRETENIMENTO, entretenimento);
        
        
    }
       
}
