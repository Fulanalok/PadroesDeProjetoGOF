import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lutadora
        System.out.println("Criando uma lutadora:\n");
        System.out.println("Dano: ");
        int danoLutadora = scanner.nextInt();
        System.out.println("Resistência: ");
        int resistenciaLutadora = scanner.nextInt();
        System.out.println("Vida: ");
        int vidaLutadora = scanner.nextInt();
        System.out.println("Arma: ");
        int armaLutadora = scanner.nextInt();
        Personagem lutadora = new PersonagemBuilder()
                .setDano(danoLutadora)
                .setResistencia(resistenciaLutadora)
                .setVida(vidaLutadora)
                .setArma(armaLutadora)
                .build();
        System.out.println("Lutadora criada!\n");

        //Guerreiro
        System.out.println("Criando um guerreiro:\n");
        System.out.println("Dano: ");
        int danoGuerreiro = scanner.nextInt();
        System.out.println("Resistência: ");
        int resistenciaGuerreiro = scanner.nextInt();
        System.out.println("Vida: ");
        int vidaGuerreiro = scanner.nextInt();
        System.out.println("Arma: ");
        int armaGuerreiro = scanner.nextInt();
        Personagem guerreiro = new PersonagemBuilder()
                .setDano(danoGuerreiro)
                .setResistencia(resistenciaGuerreiro)
                .setVida(vidaGuerreiro)
                .setArma(armaGuerreiro)
                .build();
        System.out.println("Guerreiro criado!\n");

        //Arqueira
        System.out.println("Criando uma arqueira:\n");
        System.out.println("Dano: ");
        int danoArqueira = scanner.nextInt();
        System.out.println("Resistência: ");
        int resistenciaArqueira= scanner.nextInt();
        System.out.println("Vida: ");
        int vidaArqueira = scanner.nextInt();
        System.out.println("Arma: ");
        int armaArqueira = scanner.nextInt();
        Personagem arqueira = new PersonagemBuilder()
                .setDano(danoArqueira)
                .setResistencia(resistenciaArqueira)
                .setVida(vidaArqueira)
                .setArma(armaArqueira)
                .build();
        System.out.println("Arqueira criada!\n");

        //Druida
        System.out.println("Criando um druida:\n");
        System.out.println("Dano: ");
        int danoDruida = scanner.nextInt();
        System.out.println("Resistência: ");
        int resistenciaDruida = scanner.nextInt();
        System.out.println("Vida: ");
        int vidaDruida = scanner.nextInt();
        System.out.println("Mana: ");
        int manaDruida = scanner.nextInt();
        System.out.println("Poder: ");
        int poderDruida = scanner.nextInt();
        Personagem druida = new PersonagemBuilder()
                .setDano(danoDruida)
                .setResistencia(resistenciaDruida)
                .setVida(vidaDruida)
                .setMana(manaDruida)
                .setPoder(poderDruida)
                .build();
        System.out.println("Druida criado!\n");

        //Feiticeira
        System.out.println("Criando uma feiticeira:\n");
        System.out.println("Dano: ");
        int danoFeiticeira = scanner.nextInt();
        System.out.println("Resistência: ");
        int resistenciaFeiticeira = scanner.nextInt();
        System.out.println("Vida: ");
        int vidaFeiticeira= scanner.nextInt();
        System.out.println("Mana: ");
        int manaFeiticeira = scanner.nextInt();
        System.out.println("Poder: ");
        int poderFeiticeira = scanner.nextInt();
        Personagem feiticeira = new PersonagemBuilder()
                .setDano(danoFeiticeira)
                .setResistencia(resistenciaFeiticeira)
                .setVida(vidaFeiticeira)
                .setMana(manaFeiticeira)
                .setPoder(poderFeiticeira)
                .build();
        System.out.println("Feiticeira criada!\n");
    }
}