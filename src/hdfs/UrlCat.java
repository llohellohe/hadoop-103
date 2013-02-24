/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package hdfs;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

/**
 * 类UrlCat.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-2-24 下午10:36:32
 */
public class UrlCat {
    static {
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }
    
    /**
     * @param args
     * @throws IOException
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        InputStream in = null;
        try {
            String url = "hdfs://localhost:9000/hf";
            in = new URL(url).openStream();
            IOUtils.copyBytes(in, System.out, 4096, false);
        } finally {
            IOUtils.closeStream(in);
        }
    }

}
