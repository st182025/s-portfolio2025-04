package com.example.ramen.config;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ramen.model.Area;
import com.example.ramen.repository.AreaRepository;

@Component
public class DataLoader {

    @Autowired
    private AreaRepository areaRepository;

    @PostConstruct
    public void loadData() {
        if (areaRepository.count() == 0) {
            areaRepository.save(new Area("北海道"));
            areaRepository.save(new Area("東北"));
            areaRepository.save(new Area("関東"));
            areaRepository.save(new Area("中部"));
            areaRepository.save(new Area("近畿"));
            areaRepository.save(new Area("中国"));
            areaRepository.save(new Area("四国"));
            areaRepository.save(new Area("九州・沖縄"));
        }
    }
}
