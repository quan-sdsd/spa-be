package com.example.naturalbeautyspaa.service;

import com.example.naturalbeautyspaa.object.dto.res.PageResponse;
import com.example.naturalbeautyspaa.object.entity.Dict;
import com.example.naturalbeautyspaa.repository.DictRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@AllArgsConstructor
public abstract class GeneralPageService<REQ, RES extends PageResponse> {
    private final DictRepo repo;
    private final ModelMapper mapper;
    protected List<Dict> getDict(List<String> keys) {
        return repo.getDict(keys);
    }

    protected List<Dict> populatedDict(List<String> keys) {
        return repo.getDict(keys);
    }

    public abstract RES getPageData(REQ r);
}
