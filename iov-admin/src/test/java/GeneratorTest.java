import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.sql.Types;
import java.util.Collections;

public class GeneratorTest {


    @Test
    void genCode(){

        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/iov", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("softeem") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\带班资料\\实习实训\\2023\\华夏学院20计科12软件工程课设\\code\\iov-admin\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.softeem") // 设置父包名
                            .moduleName("iov") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\带班资料\\实习实训\\2023\\华夏学院20计科12软件工程课设\\code\\iov-admin\\src\\main\\resources\\mappers")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {}) //自动读取所有表生成
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
