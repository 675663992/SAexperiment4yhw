//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.weather2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        WeatherClient client = new WeatherClient();
        String city = "北京";
        String[] weatherInfo = client.getWeatherInfo(city);
        if (weatherInfo != null) {
            String[] var4 = weatherInfo;
            int var5 = weatherInfo.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                String info = var4[var6];
                System.out.println(info);
            }
        } else {
            System.out.println("查询失败，请稍后再试。");
        }

    }
}
