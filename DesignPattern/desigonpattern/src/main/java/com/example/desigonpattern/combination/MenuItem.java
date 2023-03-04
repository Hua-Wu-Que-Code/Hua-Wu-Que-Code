package com.example.desigonpattern.combination;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 菜单项：叶子节点
 * @date 2023/3/4 10:10:53
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String Name,int level) {
        this.Name = Name;
        this.level = level;
    }
    @Override
    public void print() {
        for(int i = 0; i < level; i++) System.out.print("==");
        System.out.println(Name);
    }
}
