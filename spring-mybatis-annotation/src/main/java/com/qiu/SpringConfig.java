package com.qiu;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.session.LocalCacheScope;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
@MapperScan(value = "com.qiu.dao")
@ComponentScan
public class SpringConfig {
    @Bean
    public DataSource dataSource() throws IOException {
        DruidDataSource dataSource = new DruidDataSource();
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        dataSource.setUrl(properties.getProperty("jdbc.url"));
        dataSource.setDriverClassName(properties.getProperty("jdbc.driverClassName"));
        dataSource.setUsername(properties.getProperty("jdbc.username"));
        dataSource.setPassword(properties.getProperty("jdbc.password"));
        return dataSource;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.qiu.entity");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String mapperDir = "classpath:/com/qiu/dao/xml/*.xml";
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        configuration.setUseGeneratedKeys(true);
        configuration.setLocalCacheScope(LocalCacheScope.STATEMENT);
//        configuration.setLogImpl(Log4j2Impl.class);
//        configuration.setLazyLoadingEnabled(false);
//        configuration.setAggressiveLazyLoading(false);
        bean.setConfiguration(configuration);
        bean.setMapperLocations(resolver.getResources(mapperDir));
        return bean;
    }

}
