package com.wry.patterns.flyweight.type1;

import java.util.HashMap;

/**
 * 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static HashMap map; //使用Hashtable来存储享元对象，充当享元池

    private IgoChessmanFactory() {
        map = new HashMap<>();
		IgoChessman  black = new BlackIgoChessman();
        map.put("b", black);
		IgoChessman  white = new WhiteIgoChessman();
        map.put("w", white);
    }

	/**
	 * 返回享元工厂类的唯一实例
	 */
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

	/**
	 * 通过key来获取存储在Hashtable中的享元对象
	 */
    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) map.get(color);
    }
}
