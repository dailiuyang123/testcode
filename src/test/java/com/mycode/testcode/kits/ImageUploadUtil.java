package com.mycode.testcode.kits;

import javax.activation.MimetypesFileTypeMap;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName ImageUploadUtil
 * Description: 图片上传 工具类
 * @Author dailiuyang
 * @Date 2019/8/16 11:02
 **/
public class ImageUploadUtil {


    /**
     * @Author dailiuyang
     * @Description  图片上传到 阿里图床
     * @Date 2019/8/16 11:02
     * @Param
     * @return
     **/
    public String uploadImage(InputStream in ,String imageName){



        return null;

    }


    /**
     * @Author dailiuyang
     * @Description
     * @Date 2019/8/16 11:14
     * @Param
     * @return
     **/
    public String sentPost(String url){



        return null;

    }



    public static void main(String[] args) {

        String url="https://api.uomg.com/api/image.ali";
        String method="POST";
        File file=new File("D:\\guide-cover-3.d59ac68c.jpg");
        String BOUNDARY = "---------------------------123821742118716";
        Map<String,String> headers=new HashMap<>();
        headers.put("Content-Type","multipart/form-data; boundary=" + BOUNDARY);
        headers.put("Sec-Fetch-Mode","cors");
        headers.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36");
        try {
            FileInputStream is=new FileInputStream(file);
            String sio = streamToString(is);
            String fetch = fetch(method, url, sio, headers);
            System.out.println(fetch);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




    /**
     * Send a request
     * @param method      HTTP method, for example "GET" or "POST"
     * @param url         Url as string
     * @param body        Request body as string
     * @param headers     Optional map with headers
     * @return response   Response as string
     * @throws IOException
     */
    static public String fetch(String method, String url, String body,
                               Map<String, String> headers) throws IOException {
        // connection
        URL u = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)u.openConnection();
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);

        // method
        if (method != null) {
            conn.setRequestMethod(method);
        }

        // headers
        if (headers != null) {
            for(String key : headers.keySet()) {
                conn.addRequestProperty(key, headers.get(key));
            }
        }

        // body
        if (body != null) {
            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            os.write(body.getBytes());
            os.flush();
            os.close();
        }

        // response
        InputStream is = conn.getInputStream();
        String response = streamToString(is);
        is.close();

        // handle redirects
        if (conn.getResponseCode() == 301) {
            String location = conn.getHeaderField("Location");
            return fetch(method, location, body, headers);
        }

        return response;
    }

    /**
     * Read an input stream into a string
     * @param in
     * @return
     * @throws IOException
     */
    static public String streamToString(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1;) {
            out.append(new String(b, 0, n));
        }
        return out.toString();
    }


}
