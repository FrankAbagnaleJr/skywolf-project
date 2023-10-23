package com.kyrie.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Arrays;

/**
 * MyBatis-Plus 代码生成类
 * 只要配置下面的必填项即可，代码不用动
 */
public class JGenerator {

	// FIXME 包路径  com.kyrie.user.pojo.User里面的前缀
	private static final String PARENT_PATH = "com.kyrie";

	// FIXME 服务名  com.kyrie.user.model.pojo.User中间的user
//	private static final String SERVICE_NAME = "user";  //下面也禁止了

	// FIXME 实体的路径  com.kyrie.user.pojo.User中间的pojo
	private static final String POJO_PATH = "pojo";

	// FIXME 生成的文件表前缀
	private static final String TABLI_PREFIX = "t_";
	// FIXME 是否移除表前缀
	private static final boolean IS_TABLI_PREFIX = true;


	// FIXME 数据库名
	private static final String DB_NAME = "skywolf";

	// FIXME mysql地址
	private static final String DATA_SOURCE_IP  = "192.168.101.67";

	// FIXME mysql端口
	private static final String DATA_SOURCE_PORT  = "3306";

	// FIXME mysql用户名
	private static final String DATA_SOURCE_USER_NAME  = "root";

	// FIXME mysql密码
	private static final String DATA_SOURCE_PASSWORD  = "mysql";

	// FIXME mysql驱动
	//"com.mysql.cj.jdbc.Driver"
	private static final String DATA_SOURCE_DRIVER  = "com.mysql.cj.jdbc.Driver";

	// FIXME 生成表的作者
	private static final String AUTHOR = "冀金梁";

	// FIXME 要生成的表名
	private static final String[] TABLE_NAMES = new String[]{
			"t_fns_procure"
//			"t_dev_day_data",
//			"t_dic_country",
//			"t_dic_lst_state",
//			"t_fba_stock_day_data",
//			"t_lst_base_info",
//			"t_lst_coupon_day_data",
//			"t_lst_day_data",
//			"t_order",
//			"t_product_info",
//			"t_store_info",
//			"t_employee",
//			"t_department",
//			"t_express_plan"
	};

	// FIXME 生成代码存放的目录
	private static final String DOC_PATH = "/generator/src/main/java";

	// TODO mysql URL，不用动！！
	private static final String DATA_SOURCE_URL  = "jdbc:mysql://"+ DATA_SOURCE_IP +":"+DATA_SOURCE_PORT+"/" + DB_NAME + "?useUnicode=true&useSSL=false&characterEncoding=utf8";

	// TODO 默认生成entity，需要生成DTO修改此变量
	// 一般情况下要先生成 DTO类 然后修改此参数再生成 PO 类。
	private static final Boolean IS_DTO = false;

	public static void main(String[] args) {
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();
		// 选择 freemarker 引擎，默认 Velocity
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setFileOverride(true);
		gc.setOutputDir(System.getProperty("user.dir") + DOC_PATH);
		gc.setAuthor(AUTHOR);
		gc.setOpen(false);
		gc.setSwagger2(false);
		gc.setServiceName("%sService");
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);

		if (IS_DTO) {
			gc.setSwagger2(true);
			gc.setEntityName("%sDTO");
		}
		mpg.setGlobalConfig(gc);

		// 数据库配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setUrl(DATA_SOURCE_URL);
		dsc.setDriverName(DATA_SOURCE_DRIVER);
		dsc.setUsername(DATA_SOURCE_USER_NAME);
		dsc.setPassword(DATA_SOURCE_PASSWORD);
		mpg.setDataSource(dsc);

		// 包配置
		PackageConfig pc = new PackageConfig();
//		pc.setModuleName(SERVICE_NAME);
		pc.setParent(PARENT_PATH);

		//实现类的包
		pc.setServiceImpl("service.impl");
		pc.setXml("mapper");

		pc.setController("controller");
		pc.setEntity("pojo");
		pc.setService("service");
		pc.setMapper("mapper");

		mpg.setPackageInfo(pc);


		// 设置模板
		TemplateConfig tc = new TemplateConfig();
		mpg.setTemplate(tc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		strategy.setEntityLombokModel(true);
		strategy.setRestControllerStyle(true);
		strategy.setInclude(TABLE_NAMES);
		strategy.setControllerMappingHyphenStyle(true);
//		strategy.setTablePrefix(pc.getModuleName() + "tb_");
		strategy.setTablePrefix(TABLI_PREFIX);
		// Boolean类型字段是否移除is前缀处理
		strategy.setEntityBooleanColumnRemoveIsPrefix(IS_TABLI_PREFIX);
		strategy.setRestControllerStyle(true);

		// 自动填充字段配置
		strategy.setTableFillList(Arrays.asList(
				new TableFill("create_date", FieldFill.INSERT),
				new TableFill("change_date", FieldFill.INSERT_UPDATE),
				new TableFill("modify_date", FieldFill.UPDATE)
		));
		mpg.setStrategy(strategy);

		mpg.execute();

		System.out.println("已完成！");
	}

}
