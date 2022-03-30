package pers.young.springcloudservice.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONTokener;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class ServiceController {

    @RequestMapping("/hello")
    public String test() {

        return "hello";
    }

    @RequestMapping("/test")
    public String test1() {
        //Map<String,Object> outterMap = new HashMap<>();

        JSONObject outterJSON = new JSONObject();
        outterJSON.put("authCode","123456");
        outterJSON.put("timestamp",1223333323213L);
        outterJSON.put("requestId","123456789");

        //Map<String,Object> innerMap = new HashMap<>();
        JSONObject innerJSON = new JSONObject();
        innerJSON.put("id","1");

        List<Object> dataList = new ArrayList<>();

        List<String> mpCode = new ArrayList<>();
        List<String> opCodes = new ArrayList<>();
        String mdCode = "R53.x00x003";
        List<String> odCodes = new ArrayList<>();

        odCodes.set(0,"I63.902");
        odCodes.set(1,"J96.900x001");
        odCodes.set(2,"J96.900x001");
        odCodes.set(3,"E87.600");

        innerJSON.put("mdCode",mdCode);
        innerJSON.put("odCodes",odCodes);

        mpCode.set(0,"96.0400");
        opCodes.set(0,"38.9304");
        opCodes.set(1,"96.7201");
        opCodes.set(2,"33.2200x003");

        innerJSON.put("mpCode",mpCode);
        innerJSON.put("opCodes",opCodes);

        innerJSON.put("id","1");
        innerJSON.put("gender","2");
        innerJSON.put("age","84");
        innerJSON.put("neoFlag","0");
        innerJSON.put("neoDay","0");
        innerJSON.put("neoWeight","0");
        innerJSON.put("lenOfStasy","44");
        innerJSON.put("leaveWay","1");
        innerJSON.put("ventilatorTime","1");
        dataList.add(innerJSON);
        outterJSON.put("data",dataList);
        String url = "http://10.114.160.111:8090/drg/burster/api/v1/grouping";
        return ServiceController.post(url,outterJSON).toString();
    }

    public static JSONObject post(String url, JSONObject json){
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        JSONObject response = null;
        try {
            StringEntity s = new StringEntity(json.toString());
            s.setContentEncoding("UTF-8");
            s.setContentType("application/json");
            post.setEntity(s);

            HttpResponse res = client.execute(post);
            if(res.getStatusLine().getStatusCode() == HttpStatus.OK.value()){
                HttpEntity entity = res.getEntity();
                String charset = EntityUtils.getContentCharSet(entity);
                response = null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }



}
