/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.model.TableInfo;
import java.io.StringWriter;
import java.util.List;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 *
 */
public class EntityTemplate {

    /**
     *
     * @param packageName
     * @param tableName
     * @param className
     * @param list
     * @return output
     */
    public static String readSource(String packageName, String tableName, String className, List<TableInfo> list) {

        VelocityEngine ve = new VelocityEngine();
        //外部
        // ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "D:\\data");
        //内部
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

        ve.setProperty("input.encoding", "UTF-8");

        ve.setProperty("output.encoding", "UTF-8");

        ve.init();
        Template t = ve.getTemplate("sample.vm");
        t.setEncoding("UTF-8");
        VelocityContext context = new VelocityContext();
        context.put("packageName", packageName);
        context.put("dbname", tableName);
        context.put("javaClazz", className);
        context.put("list", list);

        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        String output = writer.toString();

        return output;

    }
}
