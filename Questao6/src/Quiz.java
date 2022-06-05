import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        int resposta;
        int acertos = 0;
        int total = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("###########################################################");
        System.out.println("############## SEJA BEM VINDO(A) AO MEU QUIZ ##############");
        System.out.println("###########################################################");
        System.out.println("################## I WANT TO PLAY A GAME ##################");

        System.out.println("Sobre qual tema você gostaria de responder o Quiz?\n 1-Futebol\n 2-Conhecimentos Gerais\n 3-Geografia\n 4-Filmes\n 5-Compass\n 6-Medicina");
        int escolhaTema = entrada.nextInt();

        switch (escolhaTema) {
            case 1:
                System.out.println("Digite seu nome:");
                String nome = entrada.next();
                System.out.println(nome + ",você escolheu o tema de Futebol.\nA bola está no centro de campo e o juiz vai apitar o começo da partida.\n");
                System.out.println("Pergunta 1:\nQuem foi o artilheiro da última copa disputada na Rússia em 2018?");
                System.out.println("1)Kane\n2)Messi\n3)Mbapéé\n4)Modric");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome + ", você acertou! É gol, artilheiro!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome + ", você errou! Bola fora!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 2:\nEm que ano foi disputada a primeira Copa do Mundo?");
                System.out.println("1)1930\n2)1934\n3)1945\n4)1940");
                System.out.println("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome + ", você acertou! É gol, artilheiro!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome + ", você errou! Bola fora!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 3:\nQual foi o único jogador brasileiro que ganhou o prêmio de gol mais bonito da FIFA?");
                System.out.println("1)Ronaldinho Gaúcho\n2)Ronaldo\n3)Romário\n4)Neymar");
                System.out.println("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome + ", você acertou! É gol, artilheiro!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome + ", você errou! Bola fora!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 4:\nQuem são os 4 maiores artilheiros da história do \"El Clasico?\"");
                System.out.println("1)Maradona, Cruyff, Romário e Ronaldo Fenômeno\n2)Messi, Cristiano Ronaldo, Di Stéfano e Raúl\n3)Ronaldo Fenômeno, Ronaldinho, Cristiano Ronaldo e Messi\n4)Deco, Zidane, Ronaldinho e Puskás");
                System.out.println("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome + ", você acertou! É gol, artilheiro!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome + ", você errou! Bola fora!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 5:\nEm quais anos o Brasil foi vice da Copa do Mundo?");
                System.out.println("1)1954 e 1994\n2)1994 e 2002\n3)1962 e 2010\n4)1950 e 1998");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome + ", você acertou! É gol, artilheiro!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome + ", você errou! Bola fora!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Usuário(a): " + nome);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + (total - acertos));
                System.out.println("Porcentagem de acertos: " + (acertos * 100) / total + "%\n");
                break;
            case 2:
                System.out.println("Digite seu nome:");
                String nome1 = entrada.next();
                System.out.println(nome1 + ",você escolheu o tema de Conhecimentos Gerais.\nVamos buscar as respostas no seu HD?\n");
                System.out.println("Pergunta 1:\nQuais os países que têm a maior e a menor expectativa de vida do mundo?");
                System.out.println("1)Japão e Serra Leoa\n2)Austrália e Afeganistão\n3)Brasil e Congo\n4)Estados Unidos e Angola");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome1 + ", você acertou! Ta sabendo bem!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome1 + ", você errou! Estude mais!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 2:\nQuais os principais autores do Barroco no Brasil?");
                System.out.println("1)Gregório de Matos, Bento Teixeira e Manuel Botelho de Oliveira\n2)Miguel de Cervantes, Gregório de Matos e Danthe Alighieri\n3)Padre Antônio Vieira, Padre Manuel de Melo e Gregório de Matos\n4)Álvares de Azevedo, Gregório de Matos e Bento Teixeira");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome1 + ", você acertou! Ta sabendo bem!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome1 + ", você errou! Estude mais!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 3:\nQuem pintou \"Guernica\"?");
                System.out.println("1)Paul Cézanne\n2)Pablo Picasso\n3)Salvador Dalí\n4)Diego Rivera");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome1 + ", você acertou! Ta sabendo bem!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome1 + ", você errou! Estude mais!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 4:\nQuanto tempo a luz do Sol demora para chegar à Terra?");
                System.out.println("1)12 minutos\n2)12 horas\n3)segundos\n4)8 minutos");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome1 + ", você acertou! Ta sabendo bem!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome1 + ", você errou! Estude mais!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 5:\nQuais são os três predadores do reino animal reconhecidos pela habilidade de caçar em grupo, se camuflar para surpreender as presas e possuir sentidos apurados, respectivamente:?");
                System.out.println("1)Leão, tubarão branco e urso cinzento\n2)Tigre, gavião e orca\n3)Hiena, urso branco e lobo cinzento\n4)Tubarão branco, crocodilo e sucuri");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 3) {
                    System.out.println(nome1 + ", você acertou! Ta sabendo bem!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome1 + ", você errou! Estude mais!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Usuário(a): " + nome1);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + (total - acertos));
                System.out.println("Porcentagem de acertos: " + (acertos * 100) / total + "%\n");
                break;
            case 3:
                System.out.println("Digite seu nome:");
                String nome2 = entrada.next();
                System.out.println(nome2 + ",você escolheu o tema de Geografia.\nFaça sua mala e vamos viajar.\n");
                System.out.println("Pergunta 1:\nQual país tem mais ilhas no mundo?");
                System.out.println("1)Brasil\n2)Japão\n3)Suécia\n4)Canadá");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 3) {
                    System.out.println(nome2 + ", você acertou! Vamos viajar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome2 + ", você errou! Coloque mais livros na sua mala!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 2:\nQual é o rio mais longo do mundo? ?");
                System.out.println("1)Amazonas\n2)Nilo\n3)Mississipi\n4)Sena");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome2 + ", você acertou! Vamos viajar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome2 + ", você errou! Coloque mais livros na sua mala!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 3:\nQuantos fusos horários existem na Rússia??");
                System.out.println("1)8\n2)4\n3)9\n4)11");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome2 + ", você acertou! Vamos viajar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome2 + ", você errou! Coloque mais livros na sua mala!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 4:\nQuais dos países listados abaixo fazem parte da Escandinávia?");
                System.out.println("1)Dinamarca, Suécia e Noruega\n2)Polônia, Ucrânia e Alemanha\n3)Sérvia, Croácia e Eslovênia\n4)Finlândia, Noruega e Suíça");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome2 + ", você acertou! Vamos viajar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome2 + ", você errou! Coloque mais livros na sua mala!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 5:\nA Bósnia e Herzegovina é um país que surgiu a partir da dissolução da antiga...?");
                System.out.println("1)Sérvia e Montenegro\n2)Iugoslávia\n3)Alemanha Oriental\n4)União Soviética");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome2 + ", você acertou! Vamos viajar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome2 + ", você errou! Coloque mais livros na sua mala!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Usuário(a): " + nome2);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + (total - acertos));
                System.out.println("Porcentagem de acertos: " + (acertos * 100) / total + "%\n");
                break;
            case 4:
                System.out.println("Digite seu nome:");
                String nome3 = entrada.next();
                System.out.println(nome3 + ",você escolheu o tema de Filmes.\nEstá pronto(a) para começar a filmagem?.\n");
                System.out.println("Pergunta 1:\nSaído direto dos quadrinhos, este personagem já apareceu em mais de 11 filmes desde os anos 60.");
                System.out.println("1)Superman\n2)Hellboy\n3)Os vingadores\n4)Batman");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome3 + ", você acertou! Está pronto(a) para gravar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome3 + ", você errou! Por favor, assista mais filmes!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 2:\nMuitas pessoas ainda se emocionam com Holly Golightly, este clássico do cinema ganhou o OSCAR de melhor trilha sonora e ganhou fãs para sempre.");
                System.out.println("1)Casablanca\n2)Audrey\n3)A princesa e o plebeu\n4)Bonequinha de luxo");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome3 + ", você acertou! Está pronto(a) para gravar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome3 + ", você errou! Por favor, assista mais filmes!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 3:\nDois assassinos, a mulher do chefe, um pugilista e muitos outros personagens inusitados em diálogos que poderiam ser entre você e seus amigos");
                System.out.println("1)Pulp Fiction\n2)Assassinos\n3)Cães de aluguel\n4)Vamos nessa");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome3 + ", você acertou! Está pronto(a) para gravar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome3 + ", você errou! Por favor, assista mais filmes!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 4:\nLançado em 1939, este filme ainda hoje é lembrado pela música cantada, pela personagem principal e por suas cores incríveis.");
                System.out.println("1)O Pássaro Azul\n2)O Mágico de Oz\n3)E o Vento Levou\n4)A Lista de Schindler");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome3 + ", você acertou! Está pronto(a) para gravar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome3 + ", você errou! Por favor, assista mais filmes!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 5:\nA atriz é considerada um dos maiores símbolos sexuais até hoje, em uma das cenas mais famosas do cinema: o vestido esvoaçante sobre a saída de ar do metrô, você lembra o nome do filme?");
                System.out.println("1)O Pecado Mora ao Lado\n2)Os Homens Preferem as Loiras\n3)Sete Dias com Marilyn\n4)Quanto mais Quente Melhor");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome3 + ", você acertou! Está pronto(a) para gravar!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome3 + ", você errou! Por favor, assista mais filmes!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Usuário(a): " + nome3);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + (total - acertos));
                System.out.println("Porcentagem de acertos: " + (acertos * 100) / total + "%\n");
                break;
            case 5:
                System.out.println("Digite seu nome:");
                String nome4 = entrada.next();
                System.out.println(nome4 + ",você escolheu o tema da Compass.\nVamos descobrir as peculiaridades do time.\n");
                System.out.println("Pergunta 1:\nQual dos instrutores é o mais dorminhoco?");
                System.out.println("1)Diego\n2)Paulo\n3)Yasmin\n4)Yago");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome4 + ", você acertou! Acorda instrutor!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome4 + ", você errou! Precisa saber mais sobre o seu time!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 2:\nQual dos instrutores é o mais comilão?");
                System.out.println("1)Yasmin\n2)Yago\n3)Paulo\n4)Diego");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome4 + ", você acertou! Regime instrutor!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome4 + ", você errou! Precisa saber mais sobre o seu time!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 3:\nQual dos instrutores é o mais cachaçeiro?");
                System.out.println("1)Paulo\n2)Yasmin\n3)Yago\n4)Diego");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome4 + ", você acertou! Engov instrutora!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome4 + ", você errou! Precisa saber mais sobre o seu time!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 4:\nQual dos instrutores é o mais bravo?");
                System.out.println("1)Paulo\n2)Yago\n3)Yasmin\n4)Diego");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome4 + ", você acertou! Maracujina instrutor!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome4 + ", você errou! Precisa saber mais sobre o seu time!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 5:\nQual dos instrutores é o mais amigo?");
                System.out.println("1)Diego\n2)Paulo\n3)Yasmin\n4)Yago\n5)Todos");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 5) {
                    System.out.println(nome4 + ", você acertou! Time show de bola!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome4 + ", você errou! Precisa saber mais sobre o seu time!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Usuário(a): " + nome4);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + (total - acertos));
                System.out.println("Porcentagem de acertos: " + (acertos * 100) / total + "%\n");
                break;
            case 6:
                System.out.println("Digite seu nome:");
                String nome5 = entrada.next();
                System.out.println(nome5 + ",você escolheu o tema de Medicina.\nColoque o seu jaleco e vamos lá.\n");
                System.out.println("Pergunta 1:\nComo é feito o cálculo do IMC (Índice de massa corporal)?");
                System.out.println("1)Peso dividido por altura\n2)Peso vezes altura\n3)Peso dividido por altura ao quadrado\n4)Peso ao quadrado divido por altura");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 3) {
                    System.out.println(nome5 + ", você acertou! Parabéns!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome5 + ", você errou!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 2:\nQuantos ossos temos no esqueleto humano?");
                System.out.println("1)38\n2)98\n3)206\n4)338");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 3) {
                    System.out.println(nome5 + ", você acertou! Parabéns!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome5 + ", você errou!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 3:\nQual o nome da estrutura pulmonar em que acontece a hematose (troca gasosa)?");
                System.out.println("1)Traqueia\n2)Alveolo\n3)Hemácia\n4)Linfócito");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 2) {
                    System.out.println(nome5 + ", você acertou! Parabéns!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome5 + ", você errou!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 4:\nQual a vitamina na qual a sua deficiência grave causa o escorbuto (doença do marinheiro)?");
                System.out.println("1)Vitamina C\n2)Vitamina A\n3)Vitamina D\n4)Vitamina E");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 1) {
                    System.out.println(nome5 + ", você acertou! Parabéns!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome5 + ", você errou!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Pergunta 5:\nTodos os órgãos abaixo possuímos em números pares, exceto:");
                System.out.println("1)Rim C\n2)Ureter A\n3)Suprarrenal D\n4)Apêndice cecal");
                System.out.print("Resposta: ");
                resposta = entrada.nextInt();
                if (resposta == 4) {
                    System.out.println(nome5 + ", você acertou! Parabéns!\n");
                    acertos = acertos + 1;
                    total = total + 1;
                } else {
                    System.out.println(nome5 + ", você errou!\n");
                    acertos = acertos;
                    total = total + 1;
                }
                System.out.println("Usuário(a): " + nome5);
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + (total - acertos));
                System.out.println("Porcentagem de acertos: " + (acertos * 100) / total + "%");
                break;
            default:
                System.out.println("Opção inválida");
                System.out.println("JOGO FINALIZADO");
                System.exit(0);
        }

        System.out.println("JOGO FINALIZADO");

    }
}




