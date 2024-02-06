public class ImageManager {
    private ImageRenderer renderer;
    public void setRenderer(ImageRenderer renderer) {
		this.renderer = renderer;
	}
	public void show() {
		renderer.showImage();
	}
}

