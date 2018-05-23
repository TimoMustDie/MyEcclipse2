package com.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.User;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import net.sf.json.JSONObject;

/**
 * @moudle: WebServiceForCSS
 * @version:v1.0
 * @Description: TODO
 * @author: xukai
 * @date: 2016��12��1�� ����5:37:30
 *
 */
@Controller
public class WebServiceForCSS {

    @ResponseBody
    @RequestMapping(value = "getUserById", method = RequestMethod.GET, produces = {"application/json; charset=utf-8","application/xml"})
    @ApiOperation(value = "ͨ��ID��ѯUSER��Ϣ", httpMethod = "GET", notes = "����")
    public String getUserById(
            @ApiParam(required = true, name = "id", value = "ID") 
            @RequestParam(value = "id") String id,HttpServletRequest request) {
        User user = new User();
        user.setId(id);
        user.setName("������Ա");
        user.setAge(25);
        JSONObject object = JSONObject.fromObject(user);
        return object.toString();
    }
}