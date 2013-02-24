/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package hdfs;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * 类FileSystemAPI.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-2-24 下午11:17:43
 */
public class FileSystemAPI {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String uri = "hdfs://localhost:9000/";

        Configuration conf = new Configuration();

        FileSystem fs = FileSystem.get(URI.create(uri), conf);

        fs.copyFromLocalFile(new Path("/tmp/hf"), new Path("/abc/dir1"));

    }

}
