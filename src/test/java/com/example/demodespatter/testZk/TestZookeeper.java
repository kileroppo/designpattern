package com.example.demodespatter.testZk;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.CuratorWatcher;
import org.apache.curator.retry.RetryNTimes;
import org.apache.zookeeper.WatchedEvent;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年09月28日 9:16
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestZookeeper {

    @Test
    public void testZookeeper() {
        try {
            CuratorFramework client = CuratorFrameworkFactory.newClient("47.112.227.46:2181", new RetryNTimes(10, 5000));
            client.start();// 连接
            // 获取子节点，顺便监控子节点
            List<String> children = client.getChildren().usingWatcher(new CuratorWatcher() {
                public void process(WatchedEvent event) throws Exception
                {
                    System.out.println("监控： " + event);
                }
            }).forPath("/");
            System.out.println(children);
        } catch (Exception e) {
            log.error("execute method fail:" + e.getMessage());
            e.printStackTrace();
        }

    }
}
