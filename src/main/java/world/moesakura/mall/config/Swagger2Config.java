package world.moesakura.mall.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import world.moesakura.mall.common.config.BaseSwaggerConfig;
import world.moesakura.mall.common.domain.SwaggerProperties;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class Swagger2Config extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("world.moesakura.mall")
                .title("mall api")
                .description("mall api 演示")
                .version("1.0")
                .contactName("MoeSakura")
                .contactUrl("https://moesakura.world")
                .contactEmail("i@moesakura.world")
                .enableSecurity(true)
                .build();
    }
}
