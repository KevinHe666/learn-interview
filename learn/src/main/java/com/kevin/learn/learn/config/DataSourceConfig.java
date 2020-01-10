//package com.kevin.learn.learn.config;
//
//import com.baomidou.mybatisplus.entity.DefaultMetaObjectHandler;
//import com.baomidou.mybatisplus.entity.GlobalConfiguration;
//import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
//import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan("com.kevin.learn.learn.mapper*")
//public class DataSourceConfig {
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sessionFactory = new MybatisSqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
////        sessionFactory.setMapperLocations(new Resource[]{new ClassPathResource("mapper/CaseDataMapper.xml"),
//////                new ClassPathResource("mapper/AsyncJobHistoryMapper.xml"), new ClassPathResource("mapper/AsyncJobMapper.xml"),
//////                new ClassPathResource("mapper/BizLockMapper.xml"),
//////                new ClassPathResource("mapper/CallRecordMapper.xml"),
//////                new ClassPathResource("mapper/TaskMapper.xml")
//////        });
//        //之前手动mapper的xml文件还需要在代码中添加文件地址  现在修改为添加文件所在文件夹地址 新增mapper的xml文件不需要再添加文件地址
//        sessionFactory.setMapperLocations(
//                new PathMatchingResourcePatternResolver()
//                        .getResources("classpath*:mapper/*.xml"));
//        sessionFactory.setTypeAliasesPackage("com.creditease.ttsapi.entity");
//        sessionFactory.setPlugins(new Interceptor[]{
//                new PaginationInterceptor(),
//        });
//        sessionFactory.setGlobalConfig(globalConfiguration());
//        return sessionFactory.getObject();
//    }
//
//    @Bean
//    public GlobalConfiguration globalConfiguration() {
//        GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
//        conf.setDbColumnUnderline(true);
//        conf.setMetaObjectHandler(new DefaultMetaObjectHandler());
//        return conf;
//    }
//
//
//}
