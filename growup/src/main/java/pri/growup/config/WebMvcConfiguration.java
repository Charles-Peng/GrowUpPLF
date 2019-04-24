package pri.growup.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The Class WebMvcConfiguration
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    // 设置Cors
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")// 允许跨域访问的路径
                .allowedOrigins("*")// 允许跨域访问的源
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE", "PATCH")// 允许请求方法
                .maxAge(168000)// 预检间隔时间
                .allowCredentials(true);// 是否发送cookie
    }
}
