package application.dto;

import domain.models.ProfilePhoto;

import java.util.List;

public record CustomerDTO(String customerId, List<String> photos) {
    public static CustomerDTO fromDomain(domain.models.Customer domain) {
        return new CustomerDTO(domain.id(),
                            domain.profilPhotos().stream().map(ProfilePhoto::generatedPhoto)
                            .toList());
    }
}
