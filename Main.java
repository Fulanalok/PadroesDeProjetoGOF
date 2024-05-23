import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso jogo! Seu objetivo é vencer o vilão, atribuindo pontos para cada característica dos personagens.\n" +
                "Regras: 1. A quantidade máxima de pontos atribuídos aos 5 personagens não pode exceder os 500 pontos.\n" +
                "2. É obrigatória a atribuição de pelo menos 1 (um) ponto por característica a cada personagem.");

        final int MAX_PONTOS = 500;
        //Lutadora
        System.out.println("Criando uma lutadora:\n");

        int danoLutadora;
        do {
            System.out.print("Dano: ");
            danoLutadora = input.nextInt();
            if (danoLutadora <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoLutadora <= 0);

        int resistenciaLutadora;
        do {
            System.out.print("Resistência: ");
            resistenciaLutadora = input.nextInt();
            if (resistenciaLutadora <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaLutadora <= 0);

        int vidaLutadora;
        do {
            System.out.print("Vida: ");
            vidaLutadora = input.nextInt();
            if (vidaLutadora <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaLutadora <= 0);

        System.out.println("As armas disponíveis para essa classe são: adaga (1,5 vezes mais resistência) ou espada (1,5 vezes mais dano).");
        System.out.println("Arma: ");
        input.nextLine();
        String armaLutadora = input.next();
        if (armaLutadora.equalsIgnoreCase ("adaga")) {
            resistenciaLutadora = (int) (resistenciaLutadora * 1.5);
        }
        else if (armaLutadora.equalsIgnoreCase ("espada")) {
            danoLutadora = (int) (danoLutadora * 1.5);
        }
        else {
            System.out.println("A arma inserida é inválida.");
        }
        Personagem lutadora = new PersonagemBuilder()
                .setDano(danoLutadora)
                .setResistencia(resistenciaLutadora)
                .setVida(vidaLutadora)
                .setArma(armaLutadora)
                .build();
        long TotalLutadora = (danoLutadora + resistenciaLutadora + vidaLutadora);
        System.out.println("Lutadora criada!\n Quantidade de pontos usados:" + TotalLutadora);



        //Guerreiro
        System.out.println("Criando um guerreiro:\n");

        int danoGuerreiro;
        do {
            System.out.print("Dano: ");
            danoGuerreiro = input.nextInt();
            if (danoGuerreiro <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoGuerreiro <= 0);

        int resistenciaGuerreiro;
        do {
            System.out.print("Resistência: ");
            resistenciaGuerreiro = input.nextInt();
            if (resistenciaGuerreiro <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaGuerreiro <= 0);

        int vidaGuerreiro;
        do {
            System.out.print("Vida: ");
            vidaGuerreiro = input.nextInt();
            if (vidaGuerreiro <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaGuerreiro <= 0);

        System.out.println("As armas disponíveis para essa classe são: machado (1,5 vezes mais resistência) ou machado duplo (1,5 vezes mais dano).");
        System.out.println("Arma: ");
        input.nextLine();
        String armaGuerreiro = input.nextLine();
        if (armaGuerreiro.equalsIgnoreCase ("machado")) {
            resistenciaGuerreiro = (int) (resistenciaGuerreiro * 1.5);
        }
        else if (armaGuerreiro.equalsIgnoreCase ("machado duplo")) {
            danoGuerreiro = (int) (danoGuerreiro * 1.5);
        }
        else {
            System.out.println("A arma inserida é inválida.");
        }
        Personagem guerreiro = new PersonagemBuilder()
                .setDano(danoGuerreiro)
                .setResistencia(resistenciaGuerreiro)
                .setVida(vidaGuerreiro)
                .setArma(armaGuerreiro)
                .build();
        long TotalGuerreiro = (danoGuerreiro + resistenciaGuerreiro + vidaGuerreiro);
        System.out.println("Guerreiro criado!\n Quantidade de pontos usados até agora:" + (TotalLutadora+TotalGuerreiro));


        //Arqueira
        System.out.println("Criando uma arqueira:\n");

        int danoArqueira;
        do {
            System.out.print("Dano: ");
            danoArqueira = input.nextInt();
            if (danoArqueira <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoArqueira <= 0);

        int resistenciaArqueira;
        do {
            System.out.print("Resistência: ");
            resistenciaArqueira = input.nextInt();
            if (resistenciaArqueira <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaArqueira <= 0);

        int vidaArqueira;
        do {
            System.out.print("Vida: ");
            vidaArqueira = input.nextInt();
            if (vidaArqueira <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaArqueira <= 0);
        System.out.println("As armas disponíveis para essa classe são: arco composto (1,5 mais dano) ou arco longo (2 vezes mais dano, metade da resistência).");
        System.out.println("Arma: ");
        input.nextLine();
        String armaArqueira = input.nextLine();
        if (armaArqueira.equalsIgnoreCase ("arco composto")) {
            danoArqueira = (int) (danoArqueira * 1.5);
        }
        else if (armaArqueira.equalsIgnoreCase ("arco longo")) {
            danoArqueira = (danoArqueira * 2);
            resistenciaArqueira = (resistenciaArqueira/2);
        }
        else {
            System.out.println("A arma inserida é inválida.");
        }
        Personagem arqueira = new PersonagemBuilder()
                .setDano(danoArqueira)
                .setResistencia(resistenciaArqueira)
                .setVida(vidaArqueira)
                .setArma(armaArqueira)
                .build();
        long TotalArqueira = (danoArqueira + resistenciaArqueira + vidaArqueira);
        System.out.println("Arqueira criada!\n Quantidade de pontos usados até agora:" + (TotalLutadora+TotalGuerreiro+TotalArqueira));


        //Druida
        System.out.println("Criando um druida:\n");

        int danoDruida;
        do {
            System.out.print("Dano: ");
            danoDruida = input.nextInt();
            if (danoDruida <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoDruida <= 0);

        int resistenciaDruida;
        do {
            System.out.print("Resistência: ");
            resistenciaDruida = input.nextInt();
            if (resistenciaDruida <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaDruida <= 0);

        int vidaDruida;
        do {
            System.out.print("Vida: ");
            vidaDruida = input.nextInt();
            if (vidaDruida <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaDruida <= 0);
        int manaDruida;
        do {
            System.out.print("Mana: ");
            manaDruida = input.nextInt();
            if (manaDruida <= 0) {
                System.out.println("A mana deve ser um valor positivo.");
            }
        } while (manaDruida <= 0);
        System.out.println("Os poderes disponíveis para essa classe são: animal encurralado (1,5 vezes mais dano) ou arma arcana (2 vezes mais dano, metade da resistência).");
        System.out.println("Poder: ");
        input.nextLine();
        String poderDruida = input.nextLine();
        if (poderDruida.equalsIgnoreCase ("animal encurralado")) {
            danoDruida = (int) (danoDruida * 1.5);
        }
        else if (poderDruida.equalsIgnoreCase ("arma arcana")) {
            danoDruida = (danoDruida * 2);
            resistenciaDruida = (resistenciaDruida/2);
        }
        else {
            System.out.println("O poder inserida é inválido.");
        }
        Personagem druida = new PersonagemBuilder()
                .setDano(danoDruida)
                .setResistencia(resistenciaDruida)
                .setVida(vidaDruida)
                .setMana(manaDruida)
                .setPoder(poderDruida)
                .build();
        long TotalDruida = (danoDruida + resistenciaDruida + vidaDruida + manaDruida);
        System.out.println("Druida criado!\n Quantidade de pontos usados até agora:" + (TotalLutadora+TotalGuerreiro+TotalArqueira+TotalDruida));



        //Feiticeira
        System.out.println("Criando uma feiticeira:\n");

        int danoFeiticeira;
        do {
            System.out.print("Dano: ");
            danoFeiticeira = input.nextInt();
            if (danoFeiticeira <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoFeiticeira <= 0);

        int resistenciaFeiticeira;
        do {
            System.out.print("Resistência: ");
            resistenciaFeiticeira = input.nextInt();
            if (resistenciaFeiticeira <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaFeiticeira <= 0);

        int vidaFeiticeira;
        do {
            System.out.print("Vida: ");
            vidaFeiticeira = input.nextInt();
            if (vidaFeiticeira <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaFeiticeira <= 0);
        int manaFeiticeira;
        do {
            System.out.print("Mana: ");
            manaFeiticeira = input.nextInt();
            if (manaFeiticeira <= 0) {
                System.out.println("A mana deve ser um valor positivo.");
            }
        } while (manaFeiticeira <= 0);
        System.out.println("Os poderes disponíveis para essa classe são: duelista arcano (2 vezes mais dano, metade da mana) ou escudo fraterno (1/3 da resistência, duas vezes mais vida).");
        System.out.println("Poder: ");
        input.nextLine();
        String poderFeiticeira = input.nextLine();
        if (poderFeiticeira.equalsIgnoreCase ("duelista arcano")) {
            danoFeiticeira = (int) (danoFeiticeira * 2);
            manaFeiticeira = (int) (manaFeiticeira/2);
        }
        else if (poderFeiticeira.equalsIgnoreCase ("escudo fraterno")) {
            vidaFeiticeira = (vidaFeiticeira*2);
            resistenciaFeiticeira = (resistenciaFeiticeira/3);
        }
        else {
            System.out.println("O poder inserida é inválido.");
        }
        Personagem feiticeira = new PersonagemBuilder()
                .setDano(danoFeiticeira)
                .setResistencia(resistenciaFeiticeira)
                .setVida(vidaFeiticeira)
                .setMana(manaFeiticeira)
                .setPoder(poderFeiticeira)
                .build();
        System.out.println("Feiticeira criada!\n");

        long TotalFeiticeira = (danoFeiticeira + resistenciaFeiticeira + vidaFeiticeira + manaFeiticeira);

        //Quantidade de pontos da equipe por caracteristica e geral para fazer a conta
        long statsDano = (danoLutadora + danoGuerreiro + danoArqueira + danoDruida + danoFeiticeira);

        long statsResistencia = (resistenciaLutadora + resistenciaGuerreiro + resistenciaArqueira + resistenciaDruida + resistenciaFeiticeira);

        long statsVida = (vidaLutadora + vidaGuerreiro + vidaArqueira + vidaDruida + vidaFeiticeira);

        long statsMana = (manaDruida + manaFeiticeira);
        //Poder e arma não contam, pq eles dão boost pras outras características

        long statsEquipe = (TotalLutadora + TotalGuerreiro + TotalArqueira + TotalDruida + TotalFeiticeira);

        if (statsEquipe > MAX_PONTOS) {
            System.out.println("A pontuação total da equipe excedeu o limite de pontos.\n" + "Reduza os pontos atribuídos aos personagens."
            );
        }
        else {
            System.out.println("A pontuação atingida pela equipe foi: " + statsEquipe);
        }

        //Adicionar a parte do vilão
    }
}
