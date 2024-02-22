package com.example.naturalbeautyspaa.object.dto.req;

import com.example.naturalbeautyspaa.object.entity.Dict;
import lombok.Data;

import java.util.List;

@Data
public class HomeRequest {
    private List<String> dictKeys;
}
