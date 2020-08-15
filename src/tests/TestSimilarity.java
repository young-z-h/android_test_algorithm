package tests;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import entity.Major;
import entity.School;
import entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestSimilarity {

    // objects
    private static List<User> users = new ArrayList<>();
    private static List<School> schools = new ArrayList<>();
    private static List<Major> majors = new ArrayList<>();

    public static void main(String[] args) {
        addObjects();
        List<User> users = contentHandle(getURLContent("http://localhost:8081/user/findAll"));
        for (User user: users) {
            System.out.println(user.toString());
        }
    }

    public static void addObjects(){

    }

    /**
     * 程序中访问http数据接口
     * @param urlStr URL
     * @return
     */
    public static String getURLContent(String urlStr) {
        // 网络的url地址
        URL url = null;
        // http连接
        HttpURLConnection httpConn = null;
        // 输入流
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try{
            url = new URL(urlStr);
            in = new BufferedReader( new InputStreamReader(url.openStream(),"UTF-8") );
            String str = null;
            while((str = in.readLine()) != null) {
                sb.append( str );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try{
                if(in!=null) {
                    in.close();
                }
            }catch(IOException ex) {
                ex.printStackTrace();
            }
        }
        String result =sb.toString();
//        System.out.println(result);
        return result;
    }

    /**
     * 处理返回的数据并且返回
     * @param str
     * @return
     */
    public static List<User> contentHandle(String str){
        ArrayList<Object> result = null;
        JSONObject json = JSON.parseObject(str);
        if ("200".equals(json.getString("state"))) {
//            ArrayList<User> users = JSON.parseArray(json.getString("data"), User.class);
            List<User> users = JSON.parseObject(json.getString("data"),new TypeReference<List<User>>(){});
            return users;
        }else
            return null;
    }


}
