import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunApp {
    public static List<CanBo> canBoList = new ArrayList<>();
    public static List<CanBoGiaoVien> canBoGiaoVienList = new ArrayList<>();
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        while (true){
            menu();
        }
    }

    public static void menu(){
        System.out.println("Menu:" );
        System.out.println("1: create");
        System.out.println("2: show list");
        System.out.println("3: show top");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n){
            case 1:
                CanBoGiaoVien canBoGiaoVien = ChucNang.create();
                if (canBoGiaoVien != null){
                    canBoGiaoVienList.add(canBoGiaoVien);
                }break;
            case 2:
                ChucNang.show(canBoGiaoVienList);
                break;
            case 3:
                ChucNang.showTop(canBoGiaoVienList);
                break;
            default:
                System.out.println("try again");
                break;
        }
    }
}
