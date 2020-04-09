package controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/json")
    @ResponseBody
    public String returnJson() {
        JSONObject object = new JSONObject();
        return object.toJSONString(33);
    }

   /* @RequestMapping("/json1")
    @ResponseBody
    public Object returnJson1() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        return map;
    }*/
}
