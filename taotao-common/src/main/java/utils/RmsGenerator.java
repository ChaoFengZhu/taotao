/**
 * 文件名： RmsGenerator.java
 * 版权： Copyright 2017-2022 CMCC All Rights Reserved.
 * 描述： RmsGenerator
 */

package utils;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

@SuppressWarnings("PMD")
public class RmsGenerator {

    private static final Logger log = LoggerFactory.getLogger(RmsGenerator.class);

    public static void main(final String[] args) {

        final String outputDir = "D:/taotao";
        // final String viewOutputDir = outputDir + "/view/";
        final AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        final GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(outputDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        gc.setAuthor("rms");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        final DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl(
                "jdbc:mysql://localhost:3306/taotao?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false");
        mpg.setDataSource(dsc);

        // 策略配置
        final StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // strategy.setDbColumnUnderline(true); // 这个配置true表示你的数据库表的字段是下划线命名false表示不是下划线
        // strategy.setTablePrefix(new String[] { "sys_" });
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude(new String[] { "tb_content","tb_content_category","tb_item","tb_item_cat","tb_item_desc","tb_item_param","tb_item_param_item","tb_order","tb_order_item","tb_order_shipping","tb_user" });
        mpg.setStrategy(strategy);

        // 包配置
        final PackageConfig pc = new PackageConfig();
        pc.setParent("com.taotao");
        pc.setController("controller");
        pc.setEntity("pojo");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
      /*  final InjectionConfig cfg = new InjectionConfig() {

            @Override
            public void initMap() {

            }

        };*/
       // mpg.setCfg(cfg);
        // 生成controller相关
        mpg.execute();
    }

}
