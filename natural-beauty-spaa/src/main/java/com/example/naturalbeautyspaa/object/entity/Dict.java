package com.example.naturalbeautyspaa.object.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Dict {
    @Id
    private String dictKey;
    private String vi;
    private String en;
    private String jp;
    private String kr;
    private boolean mergeFlag;
}
