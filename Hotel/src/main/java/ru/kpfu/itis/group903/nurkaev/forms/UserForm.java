package ru.kpfu.itis.group903.nurkaev.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Sem 1
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserForm {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String uuid;
}
