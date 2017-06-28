package org.cx.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Configurable;


@Configurable
public class RabbitConfig {

  public Queue queue() {
    return new Queue("hello");
  }
}
