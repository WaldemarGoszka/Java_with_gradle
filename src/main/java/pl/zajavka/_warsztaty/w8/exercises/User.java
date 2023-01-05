package pl.zajavka._warsztaty.w8.exercises;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Builder
@Value
@With
public class User {
    private String name;
    private String surname;
    private String email;
}
