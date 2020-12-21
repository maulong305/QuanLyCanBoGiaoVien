import java.util.List;
import java.util.Scanner;

public class ChucNang {
    public static void show(List<CanBoGiaoVien> canBoGiaoVienList){
        for (int i = 0; i < canBoGiaoVienList.size(); i++) {
            System.out.println(canBoGiaoVienList.get(i));
        }
    }

    public static CanBoGiaoVien create(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();

        System.out.println("enter birthday");
        String birthday = scanner.nextLine();

        System.out.println("enter homeTown");
        String homeTown = scanner.nextLine();

        System.out.println("enter luong");
        int luong = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter thuong");
        int thuong = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter phat");
        int phat = scanner.nextInt();
        scanner.nextLine();



        CanBoGiaoVien canBoGiaoVien = new CanBoGiaoVien(name, birthday, homeTown, luong, thuong, phat);
//        canBoGiaoVien.setTongLuong();

        return canBoGiaoVien;
    }


    public static void showTop(List<CanBoGiaoVien> canBoGiaoVienList){
        for (int i = 0; i < canBoGiaoVienList.size(); i++) {
            if (canBoGiaoVienList.get(i).tongLuong > 8000){
                System.out.println(canBoGiaoVienList.get(i));
            }
        }
    }
}
