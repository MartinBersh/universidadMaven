package org.example.mapping.dto;

import lombok.*;
import org.example.domain.Teacher;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public record SubjectDto(Long id_Subject,
                         String name,
                         Teacher teacher) {
}
