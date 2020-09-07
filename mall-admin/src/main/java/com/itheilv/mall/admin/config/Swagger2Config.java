package com.itheilv.mall.admin.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * @author WSQ
 * @since 2020-09-07
 * Swagger-ui相关配置
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.itheilv.mall"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(securitySchemes());
    }

    private ApiInfo createApiInfo(){
        return new ApiInfoBuilder()
                .title("mall-learning")
                .description("mall-learning")
                .version("1.0")
                .build();
    }


    private List<ApiKey> securitySchemes() {
        return Lists.newArrayList(new ApiKey("access-token", "access-token", "header"));
    }

}
