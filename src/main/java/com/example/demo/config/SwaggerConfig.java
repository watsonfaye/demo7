package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket userRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户模块")  //模块名称
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))  //扫描的控制器路径
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("吴昊的项目开发接口文档")    //接口文档标题
                .description("此文档仅供开发技术组领导、开发人员使用")   //描述
                .termsOfServiceUrl("http://www.baidu.com/")   //相关的网址
                .contact(new Contact("watson","http://www.xxx.com/","XXXXXX7805@qq.com"))    //作者  邮箱等
                .version("1.0")  //版本号
                .build();
    }
}