package com.example.mysql_to_mybaties.service;
import com.example.mysql_to_mybaties.entity.Web;
import com.example.mysql_to_mybaties.mapper.WebMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {

    @Autowired
    public WebMapper webMapper;
    public List<Web> findAllWeb() {
        return webMapper.findAllWeb();
    }
    public List<Web> findWebByid(int id) {
        return webMapper.findWebByid(id);
    }

}
