package com.example.desigonpattern.combination;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 测试类
 * @date 2023/3/4 10:19:59
 */
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent menuComponent0 = new Menu("系统管理",1);
        MenuComponent menuComponent1 = new Menu("菜单管理",2);
        MenuComponent menuComponent2 = new Menu("权限配置",2);
        MenuComponent menuComponent3 = new Menu("角色管理",2);
        menuComponent0.add(menuComponent1);
        menuComponent0.add(menuComponent2);
        menuComponent0.add(menuComponent3);

        MenuComponent menuComponent10 = new MenuItem("页面访问",3);
        MenuComponent menuComponent11 = new MenuItem("展开菜单",3);
        MenuComponent menuComponent12 = new MenuItem("编辑菜单",3);
        MenuComponent menuComponent13 = new MenuItem("删除菜单",3);
        MenuComponent menuComponent14 = new MenuItem("新增菜单",3);
        menuComponent1.add(menuComponent10);
        menuComponent1.add(menuComponent11);
        menuComponent1.add(menuComponent12);
        menuComponent1.add(menuComponent13);
        menuComponent1.add(menuComponent14);


        MenuComponent menuComponent20 = new MenuItem("页面访问",3);
        MenuComponent menuComponent21 = new MenuItem("提交保存",3);
        menuComponent2.add(menuComponent20);
        menuComponent2.add(menuComponent21);

        MenuComponent menuComponent30 = new MenuItem("页面访问",3);
        MenuComponent menuComponent31 = new MenuItem("新增角色",3);
        MenuComponent menuComponent32 = new MenuItem("修改角色",3);
        menuComponent3.add(menuComponent30);
        menuComponent3.add(menuComponent31);
        menuComponent3.add(menuComponent32);

        menuComponent0.print();

    }
}
