package med.voll.api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record Registese(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password

) {
}
