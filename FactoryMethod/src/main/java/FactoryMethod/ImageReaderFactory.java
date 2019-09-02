package FactoryMethod;

public class ImageReaderFactory {
    public ImageReader getImageReader(final String image, final String format) {
        if (format.equals("gif")) {
            return new GifReader(image);
        }
        if (format.equals("jpeg")) {
            return new JpegReader(image);
        }
        return null;
    }
}
