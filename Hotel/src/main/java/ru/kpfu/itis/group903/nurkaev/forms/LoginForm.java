package ru.kpfu.itis.group903.nurkaev.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Homework
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginForm {
    private String email;
    private String password;
}
