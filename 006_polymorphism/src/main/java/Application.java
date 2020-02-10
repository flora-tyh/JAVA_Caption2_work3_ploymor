import java.util.ArrayList;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Software intellijIdea = new IntellijIdea();
        Software chrome = new Chrome();
        Software wechat = new Wechat();

        ArrayList<Software> softwareList = new ArrayList<>(3);
        softwareList.add(intellijIdea);
        softwareList.add(chrome);
        softwareList.add(wechat);

        Random random = new Random();
        int n = random.nextInt(softwareList.size());

        pressF5(softwareList.get(n));

    }

    public static void pressF5(Software software) {
        System.out.println("当前是" + software.getClass().getName() + "软件");
        if(software instanceof IntellijIdea || software instanceof Chrome) {
            software.f5Action();
        } else if (software instanceof Wechat) {
            software.f5Action();
            Wechat newWechat = (Wechat) software;
            newWechat.wechatF5Action();
        }
    }
}
