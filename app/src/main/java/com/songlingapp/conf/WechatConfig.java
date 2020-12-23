package com.songlingapp.conf;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatConfig {
    private String appId;
    private String  secret;

    @Bean
    public WxMaService wxMaService() {
        WxMaDefaultConfigImpl conf=new WxMaDefaultConfigImpl();
        conf.setAppid(this.appId);
        conf.setSecret(this.secret);
        WxMaService wxMaService = new WxMaServiceImpl();
        wxMaService.setWxMaConfig(conf);
        return wxMaService;
    }

    /**
     * 处理js long型精度丢失
     * @return
     */
    @Bean("jackson2ObjectMapperBuilderCustomizer")
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        Jackson2ObjectMapperBuilderCustomizer customizer = jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder.serializerByType(Long.class, ToStringSerializer.instance)
                .serializerByType(Long.TYPE, ToStringSerializer.instance);
        return customizer;
    }

}
