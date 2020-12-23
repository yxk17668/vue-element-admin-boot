package generator;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class CodeGenerator {


    public static void main(String[] args) {//没日志不知道
        //创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        mpg.setTemplate(templateGenerate());//自定义模板路径
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOpen(false);
        gc.setOutputDir("D:\\codeGen");
        gc.setFileOverride(true); //是否覆盖已有文件
        gc.setBaseResultMap(true); //XML是否需要BaseResultMap
        gc.setBaseColumnList(true); //XML是否显示字段
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setAuthor("songling");
        gc.setIdType(null);//不生效？
        mpg.setGlobalConfig(gc);
        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://XXX:3306/marry?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        dsc.setUsername("root");
        dsc.setPassword("slroot");
        mpg.setDataSource(dsc);
        //策略配置
        StrategyConfig sc = new StrategyConfig();
        //sc.setTablePrefix("tab_"); //表名前缀
        //sc.setTablePrefix("house"); //表名前缀
        sc.setInclude("marry_activity");
        //sc.setInclude("表名，多个英文逗号分割".split(","));
        sc.setNaming(NamingStrategy.underline_to_camel); //表名生成策略
        sc.setEntityBuilderModel(true);
        sc.setEntityLombokModel(true);
        mpg.setStrategy(sc);
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.songlingadmin");
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setXml("mapperfile");
        mpg.setPackageInfo(pc);

        mpg.execute();
    }


    private static TemplateConfig templateGenerate(){
        TemplateConfig templateConfig = new TemplateConfig()
                .setController("/templates/controller.java")
                ;
        return templateConfig;
    }

}

