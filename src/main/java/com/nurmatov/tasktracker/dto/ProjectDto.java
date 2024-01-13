package com.nurmatov.tasktracker.dto;

import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Instant createdAt;
}
