package nasr.com.khalidalseddiq_backend.dto;

public class BookDto {
    private String title;
    private String imageUrl;

    public BookDto() {
    }

    public BookDto(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
