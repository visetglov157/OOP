package homework_5.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class user {

    private final Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;

}
