package com.lt.util.General.writeFiles.Classpath;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import com.lt.jdbc.JdbcBean;
import com.lt.util.ProjectBean;

public class WriteClasspath {

	/**
	 * 创建文件
	 * 
	 * @return
	 */
	public String writeClasspath(){
		
		String status="success";
		String url,dirs;
		ProjectBean pb=new ProjectBean();
		url=pb.getProjectUrl()+"/"+pb.getProjectName()+"/.classpath";
		dirs=pb.getProjectUrl()+"/"+pb.getProjectName()+"/";
		try {
			createFiles(dirs,url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			status="failure";
			e.printStackTrace();
		}
		 
		return status;
	}
	/**
	 * 创建
	 * 
	 * @return
	 */
	public  void createFiles(String dirs,String url) throws IOException{
		Logger log = Logger.getLogger("ZeroLog");   
		JdbcBean jb=new JdbcBean();
        File file=new File(url);
        File dir=new File(dirs);
        if(!file.exists()){
        	dir.mkdirs();
            file.createNewFile();
        }
            //FileOutputStream out=new FileOutputStream(file,true);        
            FileOutputStream out=new FileOutputStream(file);        
            StringBuffer sb=new StringBuffer();
             
             
            sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            sb.append("<classpath>\n");
          
        	sb.append(" <classpathentry kind=\"src\" path=\"src\"/>\n");
        	sb.append(" <classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\"/>\n");
        	sb.append(" <classpathentry kind=\"con\" path=\"melibrary.com.genuitec.eclipse.j2eedt.core.MYECLIPSE_JAVAEE_5_CONTAINER\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/activation.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/asm-3.3.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/asm-commons-3.3.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/asm-tree-3.3.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/cglib-2.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/cglib-nodep-2.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-beanutils-1.7.0.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-codec-1.3.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-collections-3.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-httpclient-3.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-logging-1.1.3.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/dom4j-1.6.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/ezmorph-1.0.4.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/javassist-3.11.0.GA.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/jdom-1.0.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/json-lib-2.2.3-jdk15.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/json_simple-1.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/jstl-1.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/log4j-1.2.14.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/mybatis-3.2.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/mybatis-spring-1.2.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/mysql-connector-java-5.1.5-bin.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/ojdbc6.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/oracle11g 11.2.0.1.0 JDBC_ojdbc6.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.aop-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.asm-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.aspects-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.beans-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.context-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.context.support-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.core-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.expression-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.instrument-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.instrument.tomcat-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.jdbc-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.jms-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.orm-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.oxm-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.test-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.transaction-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.web-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.web.portlet-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.web.servlet-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/org.springframework.web.struts-3.0.5.RELEASE.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/spring-mock.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/stax-api-1.0.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/stax-utils-20040917.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/wsdl4j-1.5.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/wstx-asl-3.0.1.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/xbean-spring-3.9.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/xfire-all-1.2.6.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/sqljdbc.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-lang-2.4.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/freemarker-2.3.22.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/aopalliance-1.0.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"con\" path=\"org.eclipse.jst.j2ee.internal.web.container\"/>\n");
        	sb.append(" <classpathentry kind=\"con\" path=\"org.eclipse.jst.j2ee.internal.module.container\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-fileupload-1.3.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-io-2.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/commons-lang3-3.2.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/ognl-3.0.19.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/struts2-core-2.3.32.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/struts2-json-plugin-2.3.32.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/struts2-spring-plugin-2.3.32.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/xwork-core-2.3.32.jar\"/>\n");
        	sb.append(" <classpathentry kind=\"output\" path=\"WebRoot/WEB-INF/classes\"/>\n");
           
            sb.append("</classpath>\n\n\n");

            out.write(sb.toString().getBytes("utf-8"));
                 
            log.info("创建文件.classpath 成功！") ;     
        out.close();
    }
 
}
