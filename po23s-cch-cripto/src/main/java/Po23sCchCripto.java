import po23s.http.ClienteHttp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Po23sCchCripto {
    public static void main(String[] args) {
        ClienteHttp teste = new ClienteHttp();

        String resultado = teste.buscaDados("https://www.mercadobitcoin.net/api/ETH/ticker");

        System.out.println(resultado);

        System.out.println("Poggers");
        
        System.out.println("Juninho gameplays");
        
        System.out.println("bruninho da XJ");

        String filePath = "po23s-cch-cripto/src/main/java/hehehe.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String resposta = " ";

            while(!resposta.equals("Q")){

                System.out.println("T = Tocar");
                System.out.println("P = Parar");
                System.out.println("R = Recomeçar");
                System.out.println("Q = Quitar");
                System.out.print("Digite sua escolha: ");

                resposta = scanner.next().toUpperCase();

                switch (resposta) {
                    case "T" -> clip.start();
                    case "P" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Escolha inválida");
                }
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Tipo de arquivo não suportado");
        }
        catch (LineUnavailableException e) {
            System.out.println("Incapaz de acessar o audio");
        }
        catch (IOException e) {
            System.out.println("Algo deu errado");
        }
        finally {
            System.out.println("Fim!");
        }
    }
}