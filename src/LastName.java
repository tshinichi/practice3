import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastName {
    public static void main(String[]args){
        //苗字のリストを作成
        List<String> lastNames = new ArrayList<>();
        lastNames.add("佐藤");
        lastNames.add("鈴木");
        lastNames.add("高橋");
        lastNames.add("田中");
        lastNames.add("伊藤");
        lastNames.add("渡辺");
        lastNames.add("山本");
        lastNames.add("中村");
        lastNames.add("小林");
        lastNames.add("加藤");

        //リストの数と内容を出力
        System.out.println(lastNames.size());
        for(String s : lastNames){
            System.out.println(s);
        }

        //リストに"山田"が含まれているか判定（含まれる：true , 含まれない：false)
        System.out.println(lastNames.contains("山田"));

        //苗字とその人口のマップを作成
        Map<String, String> lastNamesPopulation = new HashMap<>();
        lastNamesPopulation.put("佐藤", "約185万人");
        lastNamesPopulation.put("鈴木", "約178万人");
        lastNamesPopulation.put("高橋", "約139万人");
        lastNamesPopulation.put("田中", "約132万人");
        lastNamesPopulation.put("伊藤", "約106万人");
        lastNamesPopulation.put("渡辺", "約105万人");
        lastNamesPopulation.put("山本", "約104万人");
        lastNamesPopulation.put("中村", "約103万人");
        lastNamesPopulation.put("小林", "約102万人");
        lastNamesPopulation.put("加藤", "約88万人");

        //マップの内容を出力
        for(String key : lastNamesPopulation.keySet()){
            String value = lastNamesPopulation.get(key);
            System.out.println(key + "の人口は" + value);
        }

        //例外を発生させる
        int index = 10;

        try {
            System.out.println(lastNames.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        }

    }
}
