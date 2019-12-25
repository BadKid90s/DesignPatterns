package com.wry.factory.methodfactory.type2;

import com.wry.factory.methodfactory.type2.factory.FileLoggerFactory;
import com.wry.factory.methodfactory.type2.factory.LoggerFactory;
import com.wry.factory.methodfactory.type2.product.Logger;
import com.wry.utils.XMLUtil;

class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		factory = new FileLoggerFactory(); //可引入配置文件实现
		logger = factory.createLogger();
		logger.writeLog();

		//getBean()的返回类型为Object，需要进行强制类型转换
		factory = (LoggerFactory) XMLUtil.getBean(new Client(),"className");
		logger = factory.createLogger();
		logger.writeLog();

	}
}
