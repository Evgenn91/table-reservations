package com.github.Evgenn91.config;

import com.github.Evgenn91.dao.TableDao;
import com.github.Evgenn91.dao.TableDaoImpl;
import com.github.Evgenn91.service.TableService;
import com.github.Evgenn91.service.TableServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/vebinar?useSLL=false&serverTimezone=Europe/Moscow");
        dataSource.setUsername("root");
        dataSource.setPassword("roottt");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public TableDao getUserDao(){
        return new TableDaoImpl(getJdbcTemplate());
    }

    @Bean
    public TableService getUserService(){
        return new TableServiceImpl();
    }

}
