package FactoryMethod;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        System.out.println("Decoding .jpeg image");
        return decodedImage;
    }
}
