package com.study.p6spy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public void testSave(String name){
        TestEntity testEntity = new TestEntity();
        testEntity.setName(name);

        testRepository.save(testEntity);
    }


}
