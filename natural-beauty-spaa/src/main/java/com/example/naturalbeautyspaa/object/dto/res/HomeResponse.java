package com.example.naturalbeautyspaa.object.dto.res;

import com.example.naturalbeautyspaa.object.entity.Dict;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Getter
public class HomeResponse extends PageResponse{
    public HomeResponse(List<Dict> dicts) {
        super(dicts);
    }
}
