package controladores;

import java.util.HashMap;
import java.util.Random;
import entidades.Pergunta;
import entidades.Tema;

public class BancoPerguntas {

	protected HashMap<Tema, Pergunta[]> perguntas;
	protected Controlador controlador;
	protected Random random;

	public BancoPerguntas(Controlador controlador) {
		this.controlador = controlador;
		this.perguntas = new HashMap<>();
		this.random = new Random();
	}

	public Pergunta[] sortearArrayByTema(int numero) {

		Pergunta[] temaSorteado = null;
		switch (numero) {
		case 0:
			temaSorteado = perguntas.get(Tema.HISTORIA);
			break;
		case 1:
			temaSorteado = perguntas.get(Tema.GEOGRAFIA);
			break;
		case 2:
			temaSorteado = perguntas.get(Tema.ESPORTES);
			break;
		case 3:
			temaSorteado = perguntas.get(Tema.CIENCIAS);
			break;
		case 4:
			temaSorteado = perguntas.get(Tema.INGLES);
			break;
		case 5:
			temaSorteado = perguntas.get(Tema.ENTRETENIMENTO);
			break;
		}

		return temaSorteado;
	}

	public Pergunta sortearPerguntaByID(int num) {
		Pergunta[] arrayPerguntas = sortearArrayByTema(num);
		int numero = sorteiaNumeroAleatorio();
		return arrayPerguntas[numero];
	}

	public Pergunta sortearPergunta() {
		Pergunta[] arrayPerguntas = sortearArrayPerguntas();
		int numero = sorteiaNumeroAleatorio();
		return arrayPerguntas[numero];
	}

	public int sortearIdTema() {
		return random.nextInt(6);
	}

	public Pergunta[] sortearArrayPerguntas() {
		int numero = sortearIdTema();
		Pergunta[] temaSorteado = null;
		switch (numero) {
		case 0:
			temaSorteado = perguntas.get(Tema.HISTORIA);
			break;
		case 1:
			temaSorteado = perguntas.get(Tema.GEOGRAFIA);
			break;
		case 2:
			temaSorteado = perguntas.get(Tema.ESPORTES);
			break;
		case 3:
			temaSorteado = perguntas.get(Tema.CIENCIAS);
			break;
		case 4:
			temaSorteado = perguntas.get(Tema.INGLES);
			break;
		case 5:
			temaSorteado = perguntas.get(Tema.ENTRETENIMENTO);
			break;
		}

		return temaSorteado;
	}

	public int sorteiaNumeroAleatorio() {
		return random.nextInt(19);
	}

	void instanciarPerguntas() {

		Pergunta[] historia = new Pergunta[20];
		Pergunta[] geografia = new Pergunta[20];
		Pergunta[] esportes = new Pergunta[20];
		Pergunta[] ciencias = new Pergunta[20];
		Pergunta[] ingles = new Pergunta[20];
		Pergunta[] entretenimento = new Pergunta[20];

		//Perguntas sobre História
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
		Pergunta p_historia5 = new Pergunta(Tema.HISTORIA, "Qual o primeiro nome de Hitler?", "Joseph", "Charles", "Adolf", "Cristian", 3);
		historia[5] = p_historia5;
		Pergunta p_historia6 = new Pergunta(Tema.HISTORIA, "<html><body>Na mitologia grega, qual criatura pode petrificar uma pessoa apenas <br>com o olhar?</html></body>", "Minotauro", "Craken", "Medusa", "Todas estão corretas", 3);
		historia[6] = p_historia6;
		Pergunta p_historia7 = new Pergunta(Tema.HISTORIA, "Como se chamavam os teóricos que criaram o Socialismo Científico?", "Marx e Engels", "Lenin e Stalin", "Che Guevara e Trotski", "Czar Nicolau e Fidel Castro", 1);
		historia[7] = p_historia7;
		Pergunta p_historia8 = new Pergunta(Tema.HISTORIA, "Qual desses fatos é mais antigo?", "Guerra do Ópio", "Revolução Francesa", "Independência do Brasil", "Primeira Guerra Mundial", 2);
		historia[8] = p_historia8;
		Pergunta p_historia9 = new Pergunta(Tema.HISTORIA, "Qual a primeira fonte de energia descoberta em meados do século XIX?", "Petróleo", "Gás natural", "Energia solar", "Carvão mineral", 4);
		historia[9] = p_historia9;
		Pergunta p_historia10 = new Pergunta(Tema.HISTORIA, "Qual evento ou criação põe fim à pré-história e inicia a história?", "A roda", "O fogo", "Jesus Cristo", "A escrita", 4);
		historia[10] = p_historia10;
		Pergunta p_historia11 = new Pergunta(Tema.HISTORIA, "Qual presidente brasileiro instituiu o AI-5?", "Costa e Silva", "Ernesto Geisel", "João Figueiredo", "Itamar Franco", 1);
		historia[11] = p_historia11;
		Pergunta p_historia12 = new Pergunta(Tema.HISTORIA, "Quando começou e terminou a Primeira Guerra Mundial?", "1912-1915", "1914-1919", "1921-1932", "1939-1945", 2);
		historia[12] = p_historia12;
		Pergunta p_historia13 = new Pergunta(Tema.HISTORIA, "O autor da frase 'Vim, vi e venci' foi:", "Júlio Cesar", "Caligula", "Nero", "Marco Antônio", 1);
		historia[13] = p_historia13;
		Pergunta p_historia14 = new Pergunta(Tema.HISTORIA, "Quantas pontas tem a estrela de Davi?", "3", "4", "5", "6", 4);
		historia[14] = p_historia14;
		Pergunta p_historia15 = new Pergunta(Tema.HISTORIA, "Quem assumiu a presidência da república após a revolução de 1930?", "Costa e Silva", "Getúlio Vargas", "João Goulart", "Juscelino Kubitschek", 2);
		historia[15] = p_historia15;
		Pergunta p_historia16 = new Pergunta(Tema.HISTORIA, "Qual guerra foi retratada no poema Ilíada?", "Guerra de Atenas", "Guerra de Troia", "Guerra de Roma", "Guerra Fria", 2);
		historia[16] = p_historia16;
		Pergunta p_historia17 = new Pergunta(Tema.HISTORIA, "Quem foi o compositor da Marcha Turca?", "Bethoveen", "Mozart", "Bach", "Chopin", 2);
		historia[17] = p_historia17;
		Pergunta p_historia18 = new Pergunta(Tema.HISTORIA, "Em qual país foi inventado o papel?", "Inglaterra", "Itália", "Japão", "China", 4);
		historia[18] = p_historia18;
		Pergunta p_historia19 = new Pergunta(Tema.HISTORIA, "Em que ano foi fundado o Movimento Escoteiro?", "1882", "1894", "1896", "1907", 4);
		historia[19] = p_historia19;

		//Perguntas sobre Geografia
		Pergunta p_geografia = new Pergunta(Tema.GEOGRAFIA, "Qual a cidade santa para as três maiores religiões monoteístas?", "Cairo", "Mecca", "Madrid", "Jerusalém", 4);
		geografia[0] = p_geografia;
		Pergunta p_geografia1 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade se localiza a Torre Eiffel?", "Roma", "Paris", "Londres", "Rio de Janeiro", 2);
		geografia[1] = p_geografia1;
		Pergunta p_geografia2 = new Pergunta(Tema.GEOGRAFIA, "Qual dessas cidades não está localizada no México?", "Monterrey", "Guadalajra", "Tijuana", "Bogotá", 4);
		geografia[2] = p_geografia2;
		Pergunta p_geografia3 = new Pergunta(Tema.GEOGRAFIA, "<html><body>Qual fenômeno é caracterizado por uma súbita liberação de tensão <br>acumulada por ruptura dos materiais da crosta terreste?</html></body>", "Tsuname", "Erupção vulcânica", "Sismo", "Tempestade", 3);
		geografia[3] = p_geografia3;
		Pergunta p_geografia4 = new Pergunta(Tema.GEOGRAFIA, "<html><body>Qual o nome do meridiano que separa o planeta em parte oriental <br>e ocidental?</html></body>", "Meridiano de Leakey", "Meridiano de Bering", "Meridiano de Crasring", "Meridiano de Greenwich", 4);
		geografia[4] = p_geografia4;
		Pergunta p_geografia5 = new Pergunta(Tema.GEOGRAFIA, "<html><body>Em qual estado e região se localiza as cidades Água Branca, Souza <br>e João Pessoa?</html></body>", "Centro-Oeste (Bahia-BH)", "Sudeste (São Paulo SP)", "Nordeste (Paraíba PB)", "Nenhuma das alternativas", 3);
		geografia[5] = p_geografia5;
		Pergunta p_geografia6 = new Pergunta(Tema.GEOGRAFIA, "Em que cidade brasileira se localiza o Palácio do Planalto?", "Brasília", "São Paulo", "Rio de Janeiro", "Minas Gerais", 1);
		geografia[6] = p_geografia6;
		Pergunta p_geografia7 = new Pergunta(Tema.GEOGRAFIA, "Onde fica o Monte Everest?", "Himalaia", "China", "Rússia", "Peru", 1);
		geografia[7] = p_geografia7;
		Pergunta p_geografia8 = new Pergunta(Tema.GEOGRAFIA, "Qual é o segundo maior país da América do Sul?", "Argentina", "Brasil", "Chile", "Bolívia", 1);
		geografia[8] = p_geografia8;
		Pergunta p_geografia9 = new Pergunta(Tema.GEOGRAFIA, "Após o Monte Everest, qual a montanha mais alta domundo?", "Cordilheiras", "K2", "Alpes", "Cambirela", 2);
		geografia[9] = p_geografia9;
		Pergunta p_geografia10 = new Pergunta(Tema.GEOGRAFIA, "Qual a capital de Roraima?", "Campo Grande", "Rio Branco", "Boa Vista", "Porto Velho", 3);
		geografia[10] = p_geografia10;
		Pergunta p_geografia11 = new Pergunta(Tema.GEOGRAFIA, "Qual é a estação no mês de outubro no hemisfério norte?", "Primavera", "Verão", "Outono", "Inverno", 3);
		geografia[11] = p_geografia11;
		Pergunta p_geografia12 = new Pergunta(Tema.GEOGRAFIA, "Quais países fazem a maior fronteira do mundo?", "EUA e Canadá", "Chile e Argentina", "China e Índia", "Brasil e Bolívia", 1);
		geografia[12] = p_geografia12;
		Pergunta p_geografia13 = new Pergunta(Tema.GEOGRAFIA, "Em qual oceano estão as ilhas de Galápagos?", "Índico", "Pacífico", "Atlântico", "Ártico", 2);
		geografia[13] = p_geografia13;
		Pergunta p_geografia14 = new Pergunta(Tema.GEOGRAFIA, "Qual a moeda utilizada na Itália antes do Euro?", "Dólar italiano", "Peso", "Lira", "Libra", 3);
		geografia[14] = p_geografia14;
		Pergunta p_geografia15 = new Pergunta(Tema.GEOGRAFIA, "Qual a capital da Noruega?", "Estocolmo", "Reykjavik", "Copenhagen", "Oslo", 4);
		geografia[15] = p_geografia15;
		Pergunta p_geografia16 = new Pergunta(Tema.GEOGRAFIA, "Além da Rússia, qual país está presente em dois continentes?", "Bulgária", "Egito", "Turquia", "Ucrânia", 3);
		geografia[16] = p_geografia16;
		Pergunta p_geografia17 = new Pergunta(Tema.GEOGRAFIA, "Qual a cidade mais populosa do continente americano?", "Nova Iorque", "São Paulo", "Cidade do México", "Buenos Aires", 3);
		geografia[17] = p_geografia17;
		Pergunta p_geografia18 = new Pergunta(Tema.GEOGRAFIA, "Quantos estados tem nos Estados Unidos?", "48", "49", "50", "51", 3);
		geografia[18] = p_geografia18;
		Pergunta p_geografia19 = new Pergunta(Tema.GEOGRAFIA, "Qual o continente mais seco do planeta?", "Europa", "África", "Antártida", "Ásia", 3);
		geografia[19] = p_geografia19;

		//Perguntas sobre Esportes
		Pergunta p_esportes = new Pergunta(Tema.ESPORTES, "Qual time mais participou da Copa do Brasil?", "Atlético-MG", "São Paulo", "Corinthians", "Santa Cruz", 1);
		esportes[0] = p_esportes;
		Pergunta p_esportes1 = new Pergunta(Tema.ESPORTES, "Qual o nome do estádio do Santos Futebol Clube?", "Morumbi", "Canindé", "Vila Belmiro", "Parque Antartica", 3);
		esportes[1] = p_esportes1;
		Pergunta p_esportes2 = new Pergunta(Tema.ESPORTES, "Quem foi o maior ídolo do tênis brasileiro?", "Guga", "Bellucci", "Ferrer", "Federer", 1);
		esportes[2] = p_esportes2;
		Pergunta p_esportes3 = new Pergunta(Tema.ESPORTES, "Qual desses não foi jogador de futebol profissional?", "Gustavo Borges", "Diego Costa", "Alexandre Pato", "Leonel Messi", 1);
		esportes[3] = p_esportes3;
		Pergunta p_esportes4 = new Pergunta(Tema.ESPORTES, "Qual desses esportes pode acontecer o empate?", "Vôlei", "Tênis de mesa", "Handebol", "Tênis", 3);
		esportes[4] = p_esportes4;
		Pergunta p_esportes5 = new Pergunta(Tema.ESPORTES, "O ex-jogador de futebol Roberto Carlos era famoso por fazer gols de:", "Cabeça", "Falta", "Pênalti", "Peito", 2);
		esportes[5] = p_esportes5;
		Pergunta p_esportes6 = new Pergunta(Tema.ESPORTES, "Qual o nome de batismo do Pelé?", "Robson", "Hudson", "Jeferson", "Edson", 4);
		esportes[6] = p_esportes6;
		Pergunta p_esportes7 = new Pergunta(Tema.ESPORTES, "A que estado do Brasil pertence o Clube do Remo?", "Amazonas", "Pará", "São Paulo", "Piauí", 2);
		esportes[7] = p_esportes7;
		Pergunta p_esportes8 = new Pergunta(Tema.ESPORTES, "Qual o jogador com mais Bolas de Ouro do mundo?", "Neymar Jr.", "Cristiano Ronaldo", "Pelé", "Lionel Messi", 4);
		esportes[8] = p_esportes8;
		Pergunta p_esportes9 = new Pergunta(Tema.ESPORTES, "Qual desses jogadores nunca ganhou o prêmio Bola de Ouro?", "Kaká", "Cristiano Ronaldo", "Neymar Jr.", "Lionel Messi", 3);
		esportes[9] = p_esportes9;
		Pergunta p_esportes10 = new Pergunta(Tema.ESPORTES, "Em qual esperte ganha quem fizer a menor pontuação?", "Hockey", "Rugby", "Golfe", "Judô", 3);
		esportes[10] = p_esportes10;
		Pergunta p_esportes11 = new Pergunta(Tema.ESPORTES, "Em quantas copas domundo Pelé foi campeão como jogador?", "1", "2", "3", "4", 3);
		esportes[11] = p_esportes11;
		Pergunta p_esportes12 = new Pergunta(Tema.ESPORTES, "Qual dos seguintes times já foi considerado o pior do mundo?", "Santos", "Paysandu", "XV de Novembro", "Íbis", 4);
		esportes[12] = p_esportes12;
		Pergunta p_esportes13 = new Pergunta(Tema.ESPORTES, "Qual foi o placar da partida de copa do mundo de futebol com mais gols?", "10x0", "9x2", "7x5", "13x0", 3);
		esportes[13] = p_esportes13;
		Pergunta p_esportes14 = new Pergunta(Tema.ESPORTES, "Qual foi o goleiro brasileiro que jogou a final da copa do mundo de 2002?", "Marcos", "Dida", "Tafarel", "Júlio César", 1);
		esportes[14] = p_esportes14;
		Pergunta p_esportes15 = new Pergunta(Tema.ESPORTES, "Qual desses esportes não faz parte dos jogos olímpicos?", "Basquete", "Skate", "BMX", "Hockey", 3);
		esportes[15] = p_esportes15;
		Pergunta p_esportes16 = new Pergunta(Tema.ESPORTES, "Qual país sediou os jogos olímpicos de 2012?", "Brasil", "Inglaterra", "Coreia do Sul", "Alemanha", 2);
		esportes[16] = p_esportes16;
		Pergunta p_esportes17 = new Pergunta(Tema.ESPORTES, "Onde serão realizados os jogos olímpicos de inverno em 2018?", "Dinamarca", "Coreia do Sul", "China", "Rússia", 2);
		esportes[17] = p_esportes17;
		Pergunta p_esportes18 = new Pergunta(Tema.ESPORTES, "Em que ano Guga venceu o torneio de Roland Garros?", "1995", "1997", "1999", "2001", 2);
		esportes[18] = p_esportes18;
		Pergunta p_esportes19 = new Pergunta(Tema.ESPORTES, "Qual time venceu o Super Bowl em 2017?", "New England Patriots", "Atlanta Falcons", "Dallas Cowboys", "Kansas City Chiefs", 1);
		esportes[19] = p_esportes19;

		//Perguntas sobre Ciências
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
		Pergunta p_ciencias5 = new Pergunta(Tema.CIENCIAS, "Qual é a área da saúde que lida com o sistema digestivo?", "Neurologia", "Gastrologia", "Cardiologia", "Endocrinologia", 2);
		ciencias[5] = p_ciencias5;
		Pergunta p_ciencias6 = new Pergunta(Tema.CIENCIAS, "Qual destes elementos é um gás nobre?", "Kr", "Br", "At", "Cs", 1);
		ciencias[6] = p_ciencias6;
		Pergunta p_ciencias7 = new Pergunta(Tema.CIENCIAS, "Quantos ossos possui o corpo humano?", "206", "256", "306", "356", 1);
		ciencias[7] = p_ciencias7;
		Pergunta p_ciencias8 = new Pergunta(Tema.CIENCIAS, "Qual é o nome comum do ácido ascórbico?", "Vitamina A", "Vitamina B", "Vitamina C", "Paracetamol", 3);
		ciencias[8] = p_ciencias8;
		Pergunta p_ciencias9 = new Pergunta(Tema.CIENCIAS, "Em qual parte das plantas ocorre a fotossíntese?", "Núcleo", "Mitocôndria", "Cloroplasto", "Lisossomos", 3);
		ciencias[9] = p_ciencias9;
		Pergunta p_ciencias10 = new Pergunta(Tema.CIENCIAS, "<html><body>Qual destes elementos, junto com o estanho, é a base para produção <br>do bronze?</html></body>", "Prata", "Ferro", "Cobre", "Alumínio", 3);
		ciencias[10] = p_ciencias10;
		Pergunta p_ciencias11 = new Pergunta(Tema.CIENCIAS, "Um íon é formado quando um átomo ganha ou perde...", "...protons", "velocidade", "neutrons", "eletrons", 4);
		ciencias[11] = p_ciencias11;
		Pergunta p_ciencias12 = new Pergunta(Tema.CIENCIAS, "Quantos átomos há em Ca(NO3)2?", "Ca-1, N-6, O-2", "Ca-1, N-2, O-6", "Ca-6, N-2, O-1", "Ca-2, N-1, O-6", 2);
		ciencias[12] = p_ciencias12;
		Pergunta p_ciencias13 = new Pergunta(Tema.CIENCIAS, "Qual o sétimo planeta a partir do Sol?", "Júpiter", "Saturno", "Netuno", "Urano", 4);
		ciencias[13] = p_ciencias13;
		Pergunta p_ciencias14 = new Pergunta(Tema.CIENCIAS, "Quantos satélites naturais Júpiter possui?", "23", "38", "51", "69", 4);
		ciencias[14] = p_ciencias14;
		Pergunta p_ciencias15 = new Pergunta(Tema.CIENCIAS, "Qual o dia mais longo do ano no hemisfério norte?", "21 de junho", "20 de setembro", "19 de dezembro", "20 de março", 1);
		ciencias[15] = p_ciencias15;
		Pergunta p_ciencias16 = new Pergunta(Tema.CIENCIAS, "Qual destas cores indica uma estrela mais quente?", "Azul", "Branca", "Vermelha", "Cinza", 1);
		ciencias[16] = p_ciencias16;
		Pergunta p_ciencias17 = new Pergunta(Tema.CIENCIAS, "Quando um átomo ganha um elétron ele vira um...", "...cátion", "...aníon", "...onion", "...íon", 1);
		ciencias[17] = p_ciencias17;
		Pergunta p_ciencias18 = new Pergunta(Tema.CIENCIAS, "Em um circuito elétrico, os elétrons vão do...", "...polo negativo para o positivo", "...polo positivo para o negativo", "...depende da corrente", "...nenhuma das anteriores", 2);
		ciencias[18] = p_ciencias18;
		Pergunta p_ciencias19 = new Pergunta(Tema.CIENCIAS, "Como se escreve 540 em algarismos romanos?", "LXD", "DXL", "DXXXX", "LXXXX", 2);
		ciencias[19] = p_ciencias19;

		//Perguntas sobre Inglês
		Pergunta p_ingles = new Pergunta(Tema.INGLES, "Qual é o pretérito da palavra 'Keep'?", "Keeped", "Keep", "Kept", "Kepted", 3);
		ingles[0] = p_ingles;
		Pergunta p_ingles1 = new Pergunta(Tema.INGLES, "Qual é o pretérito da palavra 'Choose'?", "Choosed", "Chosed", "Chossed", "Chose", 4);
		ingles[1] = p_ingles1;
		Pergunta p_ingles2 = new Pergunta(Tema.INGLES, "Qual sufixo identifica o uso do Past Continuous?", "-ed", "-ing", "-'t", "Nenhuma das anteriores", 2);
		ingles[2] = p_ingles2;
		Pergunta p_ingles3 = new Pergunta(Tema.INGLES, "'Batata frita' é comumente falada nos EUA e Inglaterra, respectivamente:", "Chips e Fries", "Fries e Crisps", "Crisps e Chips", "Fries e Chips", 4);
		ingles[3] = p_ingles3;
		Pergunta p_ingles4 = new Pergunta(Tema.INGLES, "'Call off' pode ser traduzido como:", "Ligar", "Atender", "Cancelar", "Chamar", 3);
		ingles[4] = p_ingles4;
		Pergunta p_ingles5 = new Pergunta(Tema.INGLES, "Qual das seguintes palavras significa tanto uma parte do corpo quanto um animal?", "Deltoid", "Calf", "Ox", "Arm", 2);
		ingles[5] = p_ingles5;
		Pergunta p_ingles6 = new Pergunta(Tema.INGLES, "Qual a tradução do termo 'abroad'?", "A bordo", "Apontado", "No exterior", "Corretamente", 3);
		ingles[6] = p_ingles6;
		Pergunta p_ingles7 = new Pergunta(Tema.INGLES, "Complete a frase: 'Do you know what time...", "...it is?", "...is it?", "...are?", "...is?", 1);
		ingles[7] = p_ingles7;
		Pergunta p_ingles8 = new Pergunta(Tema.INGLES, "Complete a frase \"I can't help...", "eat chocolate\"", "eating chocolate\"", "for eating chocolate\"", "eaten chocolate\"", 2);
		ingles[8] = p_ingles8;
		Pergunta p_ingles9 = new Pergunta(Tema.INGLES, "Complete a frase \"This car _____ fourteen thousand dollars.\"", "affords", "goes for", "coasted", "vale", 2);
		ingles[9] = p_ingles9;
		Pergunta p_ingles10 = new Pergunta(Tema.INGLES, "<html><body>O que significa \"drive home\" na frase \"The newspapers drive home the fact<br> that violence is part of urban life\"?</body></html>", "Dar o recado", "Dirigir para casa", "Revelar", "Abordar", 1);
		ingles[10] = p_ingles10;
		Pergunta p_ingles11 = new Pergunta(Tema.INGLES, "Complete a frase \"The New York Stock Exchange edifice dates ___ 1903.\"", "in", "back", "from", "at", 3);
		ingles[11] = p_ingles11;
		Pergunta p_ingles12 = new Pergunta(Tema.INGLES, "<html><body>Complete a frase \"Two occasions of ____ declining activity were <br>registered last year.\"</html></body>", "disastrously", "disastrous", "disastering", "disaster", 1);
		ingles[12] = p_ingles12;
		Pergunta p_ingles13 = new Pergunta(Tema.INGLES, "Complete a frase \"It is ___ whom the committee has chosen.\"", "him", "his", "he", "he's", 3);
		ingles[13] = p_ingles13;
		Pergunta p_ingles14 = new Pergunta(Tema.INGLES, "Complete a frase \"I don't remember ___.\"", "what her name is", "her name is what", "is her name what", "what is her name", 1);
		ingles[14] = p_ingles14;
		Pergunta p_ingles15 = new Pergunta(Tema.INGLES, "Complete a frase \"He was charged ___ murder.\"", "with", "for", "then", "many", 2);
		ingles[15] = p_ingles15;
		Pergunta p_ingles16 = new Pergunta(Tema.INGLES, "Complete a frase \"The storm prevented ___ on a picnic.\"", "us to go", "us from go", "us from going", "us to going", 3);
		ingles[16] = p_ingles16;
		Pergunta p_ingles17 = new Pergunta(Tema.INGLES, "Complete a frase \"Do you take any notice ___ beggars and tramps?\"", "at", "with", "of", "from", 3);
		ingles[17] = p_ingles17;
		Pergunta p_ingles18 = new Pergunta(Tema.INGLES, "Complete a frase \"Were you named ___ anybody else?\"", "from", "as", "towards", "after", 4);
		ingles[18] = p_ingles18;
		Pergunta p_ingles19 = new Pergunta(Tema.INGLES, "Complete a frase \"Have you ever laughed ___ Charlie Chaplin?\"", "to", "from", "in", "at", 4);
		ingles[19] = p_ingles19;

		//Perguntas sobre Entretenimento
		Pergunta p_entretenimento = new Pergunta(Tema.ENTRETENIMENTO, "Qual o primeiro nome verdadeiro do 'Seu Madruga' da série de comédia 'Chaves'?", "Ronan", "Ramon", "Henrique", "Pablo", 2);
		entretenimento[0] = p_entretenimento;
		Pergunta p_entretenimento1 = new Pergunta(Tema.ENTRETENIMENTO, "No filme 'Marley e Eu', qual é o primeiro nome dado ao cão?", "Cão de Liquidação", "Marley", "Rex", "Skiper", 1);
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
		Pergunta p_entretenimento8 = new Pergunta(Tema.ENTRETENIMENTO, "Qual o nome do personagem principal de 'Zelda'?", "Luigi", "Zelda", "Blanka", "Link", 4);
		entretenimento[8] = p_entretenimento8;
		Pergunta p_entretenimento9 = new Pergunta(Tema.ENTRETENIMENTO, "Qual desses não é um Pokemon?", "Patamon", "Porygon", "Psyduck", "Groudon", 1);
		entretenimento[9] = p_entretenimento9;
		Pergunta p_entretenimento10 = new Pergunta(Tema.ENTRETENIMENTO, "Segundo Latino, qual mulher era ingrata?", "Katia", "Renata", "Andrea", "Vanessa", 2);
		entretenimento[10] = p_entretenimento10;
		Pergunta p_entretenimento11 = new Pergunta(Tema.ENTRETENIMENTO, "Quantos são os protagonistas da série 'Friends'?", "3", "4", "5", "6", 4);
		entretenimento[11] = p_entretenimento11;
		Pergunta p_entretenimento12 = new Pergunta(Tema.ENTRETENIMENTO, "Qual atriz protagonizou o filme 'Titanic'?", "Cameron Diaz", "Kate Winslet", "Bridget Fonda", "Catherine Zetta Jones", 2);
		entretenimento[12] = p_entretenimento12;
		Pergunta p_entretenimento13 = new Pergunta(Tema.ENTRETENIMENTO, "Quem é o dono da loja \"Leftoium\" na série Os Simpsons?", "Moe", "Ned", "Homer", "Mr. Burns", 2);
		entretenimento[13] = p_entretenimento13;
		Pergunta p_entretenimento14 = new Pergunta(Tema.ENTRETENIMENTO, "Qual o nome do cachorro no desenho 'Tom & Jerry'?", "Spike", "Rex", "Slinky", "Mutley", 1);
		entretenimento[14] = p_entretenimento14;
		Pergunta p_entretenimento15 = new Pergunta(Tema.ENTRETENIMENTO, "Quem é o protagonista do filme Forrest Gump?", "Leonardo DiCaprio", "Mel Gibson", "Tom Hanks", "Adam Sandler", 3);
		entretenimento[15] = p_entretenimento15;
		Pergunta p_entretenimento16 = new Pergunta(Tema.ENTRETENIMENTO, "Qual filme possui o bordão \"Que a força esteja com você\"", "Power Rangers", "Jornada nas Estrelas", "O Poderoso Chefão", "Guerra nas Estrelas", 4);
		entretenimento[16] = p_entretenimento16;
		Pergunta p_entretenimento17 = new Pergunta(Tema.ENTRETENIMENTO, "Qual destas não é uma música dos Beatles?", "Start Me Up", "Come Together", "Something", "Get Back", 1);
		entretenimento[17] = p_entretenimento17;
		Pergunta p_entretenimento18 = new Pergunta(Tema.ENTRETENIMENTO, "Qual o nome do macaco no filme O Rei Leão?", "Scar", "Mufasa", "Rafiki", "Zazu", 3);
		entretenimento[18] = p_entretenimento18;
		Pergunta p_entretenimento19 = new Pergunta(Tema.ENTRETENIMENTO, "Qual destas não é uma música do Michael Jackson?", "Remember The Time", "Dirty Diana", "Human Nature", "She Loves You", 4);
		entretenimento[19] = p_entretenimento19;

		perguntas.put(Tema.HISTORIA, historia);
		perguntas.put(Tema.GEOGRAFIA, geografia);
		perguntas.put(Tema.ESPORTES, esportes);
		perguntas.put(Tema.CIENCIAS, ciencias);
		perguntas.put(Tema.INGLES, ingles);
		perguntas.put(Tema.ENTRETENIMENTO, entretenimento);

	}

}
