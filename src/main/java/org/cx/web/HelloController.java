package org.cx.web;

import org.cx.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动rabbitmq 新建一个名叫hello的队列
 * @author grass
 *
 */
@RestController
public class HelloController {

    @Autowired
    private HelloSender helloSender;
    
    @RequestMapping("/sendHello")
    public String send() {
      System.out.println(123);
      helloSender.send();
      return "success";
    }
}
