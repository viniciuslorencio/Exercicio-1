package br.com.dio;

public class mensagem{

    public static void obtermensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
               mensagemBomDia();
               break;

            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();
                break;

            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                mensagemBoaNoite();
                break;

            default:
                System.out.println("Hora invalida. ");
                break;

        }

    }

    public static void mensagemBomDia () {
        System.out.println("Bom Dia");
    }

    public static void mensagemBoaTarde () {
        System.out.println("Boa Tarde ");
    }

    public static void mensagemBoaNoite () {
        System.out.println("Boa Noite ");
    }
}
