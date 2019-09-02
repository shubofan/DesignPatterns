package FactoryMethod;

/**
 * Hello world!
 *
 */
public class FactoryMethodDemo
{
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReaderFactory imageReaderFactory = new ImageReaderFactory();
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1);
        try {
            decodedImage = imageReaderFactory.getImageReader(image, format).getDecodedImage();
            System.out.println(decodedImage);
        } catch (Exception e) {
            System.out.println("Cannot decode the image");
            e.printStackTrace();
        }
    }
}
