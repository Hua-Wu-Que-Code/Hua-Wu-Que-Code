package com.example.desigonpattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 菜单类，属于树枝节点
 * @date 2023/3/4 10:03:13
 */
public class Menu extends MenuComponent{


    //菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> MeunList = new ArrayList<MenuComponent>();

    public Menu(String Name,int level) {
        this.Name = Name;
        this.level = level;
    }

    @Override
    public MenuComponent getChild(int index) {
        return MeunList.get(index);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        MeunList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        MeunList.remove(menuComponent);
    }

    @Override
    public void print() {
        for(int i = 0; i < level; i++) System.out.print("==");
        System.out.println(Name);

        for (MenuComponent menuComponent: MeunList) {
            menuComponent.print();
        }
    }
}
