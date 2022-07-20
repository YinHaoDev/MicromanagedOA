package com.micromanaged.oa.configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.micromanaged.oa.infrastructure.*.mapper")
@EnableTransactionManagement
public class MicromanagedOAConfiguration {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {

        // 分页插件
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        paginationInnerInterceptor.setOverflow(true);
        paginationInnerInterceptor.setMaxLimit(-1L);
        paginationInnerInterceptor.setOptimizeJoin(true);

        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(paginationInnerInterceptor); // 分页
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor()); // 防止全表更新和删除
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor()); // 乐观锁
        return interceptor;
    }
}
