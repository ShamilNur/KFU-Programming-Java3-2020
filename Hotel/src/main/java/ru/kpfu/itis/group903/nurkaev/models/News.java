package ru.kpfu.itis.group903.nurkaev.models;

import lombok.Builder;
import lombok.Data;

/**
 * @author Shamil Nurkaev @nshamil
 * 11-903
 * Sem 1
 */

@Data
@Builder
public class News {
    private Long id;
    private String title;
    private String description;
    private String photo;
}
