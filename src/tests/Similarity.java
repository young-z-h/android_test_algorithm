package tests;

import entity.Major;
import entity.School;

import java.util.*;

public class Similarity {
    // User

    /**
     * 判断School差异指数(done)
     *
     * @param school
     * @param toCompare
     * @return
     */
    public static int schoolDiffDegree(School school, School toCompare){
        if (school == null || toCompare == null)
            return 0;
        int result = 0;
        result += Math.abs(school.getRank() - toCompare.getRank())
                + Math.abs(
                        (school.isBelong211()?(school.isBelong985()?100:50):0)
                                - (toCompare.isBelong211()?(toCompare.isBelong985()?100:50):0)
                    );

        return result;
    }

    /**
     * School量化指数
     * 规则：越小越好
     * 1. 排名为多少，增加多少
     * 2. 如果是985(同时也是211)，不增加
     * 3. 如果只是211，增加100
     * 4. 双非，增加150
     * @param school
     * @return
     */
    public static int schoolDegree(School school) {
        return school.getRank()
                + (school.isBelong211()?(school.isBelong985()?0:100):150);
    }
    /**
     * 专业量化指数，方式待定。。。。
     * @param major
     * @return
     */
    public static int majorDegree(Major major){
        int result = 0;
        // ..code..
        return result;
    }

    /**
     * 留学目标地区量化指数，方式待定
     * @param major
     * @param toCompare
     * @return
     */
    public static int targetRegionDiffDegree(Major major, Major toCompare){
        if (major == null || toCompare == null)
            return 0;
        int result = 0;
        // ..code..
        return result;
    }

    /**
     * GPA量化指数
     * @param gpa
     * @return
     */
    public static int gpaDegree(int gpa) {
        int result = gpa * 200; // 待补充
        return result;
    }

    /**
     * 计算距离，初步定为HashMap，实现方式待定
     * 测距方式暂时使用曼哈顿距离
     * @return
     */
    public static Map<Integer, Integer> manhattanDistance() {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer obj1, Integer obj2) {
                        // 降序
                        return obj2.compareTo(obj1);
                    }
                });
//        map.put("2019-03", "ccccc");
//        map.put("2018-12", "aaaaa");
//
//        Set<String> keySet = map.keySet();
//        Iterator<String> iter = keySet.iterator();
//
//        while (iter.hasNext()) {
//            String key = iter.next();
//            System.out.println(key + ":" + map.get(key));
//        }
        return map;
    }
    // User
}
