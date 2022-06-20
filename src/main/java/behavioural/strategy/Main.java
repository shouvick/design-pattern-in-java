package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("test", new JpegCompressor(), new BlackAndWhite());
        imageStorage.store("test", new PngCompressor(), new BlackAndWhite());
    }
}
