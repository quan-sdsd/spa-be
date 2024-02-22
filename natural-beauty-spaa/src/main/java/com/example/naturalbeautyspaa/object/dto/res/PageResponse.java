package com.example.naturalbeautyspaa.object.dto.res;

import com.example.naturalbeautyspaa.object.entity.Dict;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.List;


@Data
@AllArgsConstructor
public abstract class PageResponse {
    protected List<Dict> dicts;
}
