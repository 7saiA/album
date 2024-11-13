package telran.album.model;

import java.time.LocalDateTime;

public class Photo {
    private final int albumId;
    private final int photoId;
    private final LocalDateTime date;
    private String title;
    private String url;

    public Photo(int albumId, int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", photoId=" + photoId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo photo)) return false;

        return getAlbumId() == photo.getAlbumId() && getPhotoId() == photo.getPhotoId();
    }

    @Override
    public int hashCode() {
        int result = getAlbumId();
        result = 31 * result + getPhotoId();
        return result;
    }
}
