package com.keeplearng.design.pattern.creational_chuangjianxing.simplefactory_jiandangongchang;

/**
 * Created by liangyu
 */
public class VideoFactory {
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    /**
     * rec: 方法的返回类型为接口类型，根据传入的参数去实例化接口的不同实现类，并返回
     * @param type
     * @return
     */
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

}
