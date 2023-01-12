package com.heyi.controll;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class redictionControll {

    private char[] chars = {'a','a','b','c'};

    @Value("#{${data.Hashmap}}")
    private Map<Character,String> map;

    int i = 0;

    @RequestMapping("/go")
    public String rediction(){
        i++;
        i %= chars.length;

        RestTemplate restTemplate = new RestTemplate();
        String url = map.get(chars[i]);
        String str = restTemplate.getForObject(url, String.class);

        return str;
    }

}
