package com.example.naturalbeautyspaa.service;

import com.example.naturalbeautyspaa.object.dto.req.HomeRequest;
import com.example.naturalbeautyspaa.object.dto.res.HomeResponse;
import com.example.naturalbeautyspaa.repository.DictRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService extends GeneralPageService<HomeRequest, HomeResponse>{

    public HomeService(DictRepo dictRepo, ModelMapper mapper) {
        super(dictRepo, mapper);
    }

    @Override
    public HomeResponse getPageData(HomeRequest r) {
        return new HomeResponse(this.populatedDict(r.getDictKeys()));
    }
}
