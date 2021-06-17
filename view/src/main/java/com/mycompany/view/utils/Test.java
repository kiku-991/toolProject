/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view.utils;

import java.io.StringWriter;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 *
 *
 */
public class Test {

    public static void main(String... arg) {
        VelocityEngine ve = new VelocityEngine();
        //外部
        //ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "D:\\data");
        //内部
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

        ve.init();
        org.apache.velocity.Template t = ve.getTemplate("./sample.vm");
        VelocityContext context = new VelocityContext();
        context.put("packageName", "com.shoping.kiku.entity");
        context.put("dbname", "userInfo");
        context.put("javaClazz", "UserInfo");

        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        System.out.println(writer.toString());

    }

}
