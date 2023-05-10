package med.voll.api.dtos;

import jakarta.validation.constraints.NotNull;

public record Login(
        @NotNull
        String name,
        @NotNull
        String password
) {
}
