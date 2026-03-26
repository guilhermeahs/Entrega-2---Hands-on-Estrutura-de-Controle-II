import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Distancia entre pontos");
            System.out.println("2. Contador");
            System.out.println("3. Perguntas");
            System.out.println("4. Print");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    calcularDistancia(null);
                    break;
                case 2:
                    contarCaracteres(null);
                    break;
                case 3:
                    perguntas(null);
                    break;
                case 4:
                    print.main(null);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }

    public static void perguntas(String[] args) {
        String respostas;
        int tentativas = 0;
        boolean acertou = false;

        do {
            tentativas++;
            System.out.println("Por que o UX é importante no desenvolvimento de sistemas?");
            System.out.println("(a) Porque deixa o sistema mais difícil de usar, aumentando o tempo de navegação.");
            System.out.println("(b) Porque ajuda a melhorar a experiência do usuário, tornando o sistema mais fácil, eficiente e agradável de usar.");
            System.out.println("(c) Porque serve apenas para deixar as telas mais coloridas e bonitas.");
            System.out.println("(d) Porque elimina totalmente a necessidade de testes no sistema.");
            System.out.println("(e) Porque é usado somente em jogos e redes sociais.");
            System.out.print("Digite a alternativa: ");

            respostas = sc.nextLine().toLowerCase();

            switch (respostas) {
                case "b":
                    System.out.println("Correto!");
                    System.out.println("Você acertou em " + tentativas + " tentativa(s).");
                    acertou = true;
                    break;

                case "a":
                case "c":
                case "d":
                case "e":
                    System.out.println("Resposta incorreta. Tente novamente.");
                    break;

                default:
                    System.out.println("Resposta inválida. Por favor, escolha uma opção válida (a, b, c, d ou e).");
                    break;
            }
        } while (!acertou && tentativas < 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }
    }

    public static void calcularDistancia(String[] args) {
        double x1 = 25.0;
        double y1 = 35.0;
        double x2 = 35.5;
        double y2 = 25.5;
        double raio = 6371.01;

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double d = raio * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("A distância entre os pontos é: " + d + " km");
    }

    public static class print {
        public static void main(String[] args) {
            System.out.println("   +\"\"\"\"\"+");
            System.out.println("  [| o o |]");
            System.out.println("   |  ^  |");
            System.out.println("   | '-' |");
            System.out.println("   +-----+");
        }
    }

    public static void contarCaracteres(String[] args) {
        System.out.println("Digite uma frase:");
        String texto = sc.nextLine();

        int letra = 0;
        int numero = 0;
        int espacos = 0;
        int outros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letra++;
            } else if (Character.isDigit(c)) {
                numero++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("Letras: " + letra);
        System.out.println("Números: " + numero);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros caracteres: " + outros);
    }
}