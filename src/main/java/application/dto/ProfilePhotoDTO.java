package application.dto;

import domain.models.ProfilePhoto;
import org.jboss.resteasy.reactive.multipart.FileUpload;

import java.util.UUID;

public record ProfilePhotoDTO(FileUpload fileUpload) {
    public static ProfilePhotoDTO create(FileUpload fileUpload) {
        return new ProfilePhotoDTO(fileUpload);
    }

    public ProfilePhoto toDomain() {
        return new ProfilePhoto(UUID.randomUUID().toString(),
                                fileUpload().uploadedFile().toAbsolutePath().toString(),
                  null);
    }
}
