package com.wry.utils;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
	public static String getNodeElementContent(String filePath,String fileName,String nodeElement) {
		try {
			//创建文档对象
			Node node = getXMLNode(filePath, fileName, nodeElement);
            String chartType = node.getNodeValue().trim();
            return chartType;
        }
       	catch(Exception e) {
           	e.printStackTrace();
        	return null;
        }
    }

	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String filePath,String fileName,String nodeElement) {
		try {
			//创建DOM文档对象
			Node node = getXMLNode(filePath, fileName, nodeElement);

			String cName=node.getNodeValue();

			//通过类名生成实例对象并将其返回
			Class c=Class.forName(cName);
			Object obj=c.newInstance();
			return obj;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(Object object,String nodeElement) {
		try {
			//创建DOM文档对象
			Node node = getXMLNode(object.getClass().getResource("").getPath(), "config.xml", nodeElement);

			String cName=node.getNodeValue();

			//通过类名生成实例对象并将其返回
			Class c=Class.forName(cName);
			Object obj=c.newInstance();
			return obj;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static  Node getXMLNode(String filePath,String fileName,String nodeElement) throws ParserConfigurationException, IOException, SAXException {
		//创建DOM文档对象
		DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dFactory.newDocumentBuilder();
		Document doc;
		doc = builder.parse(new File(filePath+File.separator+fileName));

		//获取包含类名的文本节点
		NodeList nl = doc.getElementsByTagName(nodeElement);
		Node node=nl.item(0).getFirstChild();
		return node;
	}

}
