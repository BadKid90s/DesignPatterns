package com.wry.factory.methodfactory.type2.factory;

import com.wry.factory.methodfactory.type2.product.Logger;

//日志记录器工厂接口：抽象工厂
public interface LoggerFactory {
	 Logger createLogger();
}
