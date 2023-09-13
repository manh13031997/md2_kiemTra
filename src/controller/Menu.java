package controller;

import service.ExceptionManager;
import service.ProductManage;

public class Menu {
    private final ProductManage productManage;

    public Menu() {
        productManage = new ProductManage();
    }

    public void menuManage() {
        int choice;
        do {
            System.out.println("---- Product management program ----");
            System.out.println("1. hiện thị danh sách: ");
            System.out.println("2. thêm: ");
            System.out.println("3.cập nhập: ");
            System.out.println("4. xóa: ");
            System.out.println("5. loại: ");
            System.out.println("6. giá max: ");
            System.out.println("7. Read file: ");
            System.out.println("8. Write file: ");
            System.out.println("9. Exit: ");
            System.out.println("chọn chức năng: ");
            choice = ExceptionManager.exceptionChoice();
            switch (choice) {
                case 1:
                    productManage.display();
                    break;
                case 2:
                    System.out.println("1. thêm: ");
                    productManage.display();
                    choice = ExceptionManager.exceptionChoice();
                    if (choice == 1) {
                        productManage.add();
                    }
                    break;
                case 3:
                    productManage.edit();
                    break;
                case 4:
                    productManage.remove();
                    break;
                case 5:
                    System.out.println("1. Sort up ascending: ");
                    System.out.println("2. Sort descending: ");
                    System.out.println("3. Exit.");
                    choice = ExceptionManager.exceptionChoice();
                    if (choice == 1) {
                        productManage.sortAscending();
                    } else if (choice == 2) {
                        productManage.sortDescending();
                    }
                    break;
                case 6:
                    productManage.findMaxPrice();
                    break;
                case 7:
                    productManage.loadProduct(productManage.readProduct("product.cvs"));
                    break;
                case 8:
                    productManage.writeProduct();
                    break;
            }
        } while (choice != 9);
    }
}
