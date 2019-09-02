package FactoryMethod;

public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        System.out.println("Decoding .gif image");
        return decodedImage;
    }
}
