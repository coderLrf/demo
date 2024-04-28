package com.example.module.design.memento;

/**
 * 角色状态管理者类
 *
 * @author lrf
 * @create 2024/4/3
 */

public class RoleStateCaretaker {
    
    private Memento memento;
    
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
