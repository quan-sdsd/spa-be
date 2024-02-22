package com.example.naturalbeautyspaa.controller;

import com.example.naturalbeautyspaa.object.dto.res.PageResponse;
import com.example.naturalbeautyspaa.service.GeneralPageService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
public abstract class PageController<REQ> {
    private final GeneralPageService<REQ, ? extends PageResponse> service;

    @PostMapping(value ="/get-page-data")
    public ResponseEntity<?> getPageData(@RequestBody REQ r) {
        ResponseEntity<?> a = ResponseEntity.ok(service.getPageData(r));
        return a;
    }
}
