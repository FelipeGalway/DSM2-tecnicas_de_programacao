import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class App {
    public void gerarStickers() throws IOException {
        // leitura da imagem original
        BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));

        // criar criar uma nova imagem em memoria com transparencia e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 100;
        BufferedImage novaImagem = new BufferedImage(
                largura, novaAltura, BufferedImage.TYPE_INT_ARGB);

        // copiar a imagem original para a nova imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // escrever uma mensagem na nova imagem
      
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 35);
        graphics.setFont(fonte);
        graphics.setColor(Color.YELLOW);
        graphics.drawString("OLÁ 2º DSM", 50, novaAltura - 80);

        // escrever/gerar a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));

    }

    public static void main(String[] args) throws Exception {
        var gerador = new App();
        gerador.gerarStickers();
    }
}
