package com.scnu.business.config;


import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages="com.scnu.order.service")

//enableRemoteSyncConfig 需要加上次配置，配置中心修改才能动态生效
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "${nacos.config.server-address}", enableRemoteSyncConfig = "true")) // 激活 Nacos 配置
@NacosPropertySource(dataId = "${nacos.config.data-id}", autoRefreshed = true)
public class BusinessConfiguration {
}
