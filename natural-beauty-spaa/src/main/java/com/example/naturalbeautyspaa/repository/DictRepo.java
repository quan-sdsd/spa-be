package com.example.naturalbeautyspaa.repository;

import com.example.naturalbeautyspaa.object.entity.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DictRepo extends JpaRepository<Dict, String> {
    @Query("select c from Dict c where c.dictKey in (?1)")
    public List<Dict> getDict(List<String> keys);
}
