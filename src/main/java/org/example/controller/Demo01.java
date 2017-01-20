package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qsym on 2017/1/20.
 */



@Controller
public class Demo01 {
    @Autowired
    private AddDao addDao;
    @RequestMapping(value = "/")
    public String helloWorld(){

        return "index";
    }

    @RequestMapping(value = "/home.html")
    public String home(){

        return "home";
    }

    @RequestMapping(value = "/temp02.html")
    public String tmp02(){

        return "tmp02";
    }

    @RequestMapping(value = "/addhospital.html")
    public String addhospital(){

        return "home/addhospital";
    }

    @RequestMapping(value = "/hospitalinfo.html")
    public String hospitalinfo(){

        return "home/hospitalinfo";
    }

    @RequestMapping(value = "/hospital/add")
    @ResponseBody
    public Object addHospital(AddHospital addHospital) {
        addDao.save(addHospital);
        return addHospital.getId();
    }
    @RequestMapping(value ="/find/{id}")
    @ResponseBody
    public Object find(@PathVariable String id) {
        return addDao.findOne(id);
    }
}
