package lottery;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class Lottery {

    List list;

    public Lottery() {
    }

    public Lottery(LinkedHashSet<String> linkedHashSet) {
        this.list = new ArrayList();
        System.out.println(linkedHashSet);
        for (String text : linkedHashSet) {
            list.add(text);
        }
    }

    public String getResult() {
        int num = random(list.size());
        System.out.println(num);
        return list.get(num).toString();
    }

    public Integer getResult(int startNum, int EndNum) {
        return random(startNum, EndNum);
    }

    private int random(int num) {
        Random random = new Random();
        int result = random.nextInt(num);
        return result;
    }

    private int random(int startNum, int endNum) {
        int space = endNum - startNum;
        int result = random(space) + startNum;
        return result;
    }

}
