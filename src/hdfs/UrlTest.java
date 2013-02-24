/*
 * Copyright 1999-2010 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package hdfs;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * 类UrlTest.java的实现描述：TODO 类实现描述 
 * @author yangqi 2013-2-24 下午11:28:49
 */
public class UrlTest {

    /**
     * @param args
     * @throws URISyntaxException
     */
    public static void main(String[] args) throws URISyntaxException {
        // TODO Auto-generated method stub
        URI uri = new URI("yx://usser@10.16.29.2:20/test/go.do");

        System.out.println(uri.getScheme());
        System.out.println(uri.getAuthority());
        System.out.println(uri.getPath());
    }

}
