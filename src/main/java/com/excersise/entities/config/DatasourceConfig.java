package com.excersise.entities.config;


import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DatasourceConfig {

  @Bean
  @Primary
  @ConfigurationProperties(prefix="com.excersise.entities")
  public DataSource getDataSource() {
    DataSourceBuilder dsb = DataSourceBuilder.create();
    dsb.url("jdbc:mysql://localhost:3306/plant");
    return dsb.build();
  }

}



/*  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  @Bean
  public DataSource datasource() {
    return DataSourceBuilder.create()
        .driverClassName("org.postgresql.Driver")
        .url(url)
        .username(username)
        .password(password)
        .build();
  }*/
