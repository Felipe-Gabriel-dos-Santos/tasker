package com.tasker.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter @Setter
public class TaskDTO {
    private UUID id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createAt;
}