package com.example.desigonpattern.combination;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 菜单节点：属于抽象根节点
 * @date 2023/3/4 09:56:07
 */
public abstract class MenuComponent {
    //菜单名称
    protected String Name;
    //菜单层级
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    };

    //移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    };

    //获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    //获取菜单名称
    public String getName() {
        return Name;
    }

    //打印菜单名称，包括子菜单和菜单项
    public abstract void print();
}
